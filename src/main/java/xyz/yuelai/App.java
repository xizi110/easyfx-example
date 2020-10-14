package xyz.yuelai;

import javafx.scene.Scene;
import javafx.stage.Stage;
import xyz.yuelai.view.ExampleView;

/**
 * Hello world!
 *
 */
public class App extends FXApplication {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // 启用elementUI
        setElementStyleEnable(true);
        ExampleView view = View.createView(ExampleView.class);
        primaryStage.setScene(new Scene(view.getRoot()));
        primaryStage.show();
    }
}
