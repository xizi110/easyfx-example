package xyz.yuelai;

import javafx.application.Preloader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import xyz.yuelai.view.ExampleView;

/**
 * Hello world!
 *
 */
public class App extends FXApplication {

    private ExampleView view ;

    @Override
    public void init() throws Exception {
        // 启用elementUI
        setElementStyleEnable(true);
        view = View.createView(ExampleView.class);
        for (int i = 0; i < 100; i++) {
            Thread.sleep(20);
            notifyPreloader(new Preloader.ProgressNotification(i/99.0));
        }
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setScene(new Scene(view.getRoot()));
        primaryStage.show();
    }
}
