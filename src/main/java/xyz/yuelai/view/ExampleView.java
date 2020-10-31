package xyz.yuelai.view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import xyz.yuelai.View;
import xyz.yuelai.control.EleSwitch;
import xyz.yuelai.control.Message;
import xyz.yuelai.control.Notification;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author zhong
 * @date 2020-10-14 15:24:11 周三
 */
public class ExampleView extends View {

    @FXML
    private EleSwitch eleSwitch;
    @Override
    public String fxml() {
        return "Example.fxml";
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        eleSwitch.activeProperty().addListener((observable, oldValue, newValue) -> {
            showNotificationAutoClose("active 状态：" + newValue);
        });
    }

    @FXML
    private void showNotification(ActionEvent event){
        Button source = (Button) event.getSource();
        String text = source.getText();
        if (text.equals("默认按钮")) {
            showNotification("Notification 可以手动关闭，也可以自动关闭");
            showNotificationAutoClose("Notification 可以手动关闭，也可以自动关闭", Notification.Type.WARNING);
        }else if (text.equals("主要按钮")){
            showNotificationAutoClose("Notification 可以手动关闭，也可以自动关闭", Notification.Type.ERROR);
            showNotificationAutoClose("Notification 可以手动关闭，也可以自动关闭", Notification.Type.SUCCESS);
        }
    }

    @FXML
    private void showMessage(ActionEvent event){
        Button source = (Button) event.getSource();
        String text = source.getText();
        if (text.equals("信息按钮")) {
            showMessage("Message 自动关闭");
            showMessage("Message 自动关闭", Message.Type.WARNING);

        }else if (text.equals("成功按钮")){
            showMessage("Message 自动关闭", Message.Type.ERROR);
            showMessage("Message 自动关闭", Message.Type.SUCCESS);
        }
    }

}
