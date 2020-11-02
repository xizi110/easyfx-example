package xyz.yuelai.view;

import javafx.beans.binding.Bindings;
import javafx.beans.binding.StringBinding;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import xyz.yuelai.View;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author zhong
 * @date 2020-11-02 10:27:13 周一
 */
public class PreloadView extends View {
    @FXML
    private ProgressBar progressBar;
    @FXML
    private Label progress;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        StringBinding stringBinding = Bindings.createStringBinding(() -> String.format("%.2f%%", progressBar.progressProperty().multiply(100).get()), progressBar.progressProperty());
        progress.textProperty().bind(stringBinding);
    }

    @Override
    public String fxml() {
        return "PreloadView.fxml";
    }

    public ProgressBar getProgressBar() {
        return progressBar;
    }


}
