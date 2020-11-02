package xyz.yuelai;

import javafx.application.Preloader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import xyz.yuelai.view.PreloadView;

/**
 * @author zhong
 * @date 2020-11-02 10:19:36 周一
 */
public class AppPreloader extends Preloader {

    Stage stage;
    private PreloadView view;

    @Override
    public void init() throws Exception {
        View.ELEMENT_STYLE = true;
        view = View.createView(PreloadView.class);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.stage = primaryStage;
        primaryStage.setScene(new Scene(view.getRoot()));
        primaryStage.show();
    }

    @Override
    public void handleApplicationNotification(PreloaderNotification info) {
        if (info instanceof ProgressNotification){
            double progress = ((ProgressNotification) info).getProgress();
            view.getProgressBar().setProgress(progress);
            if (progress >= 1){
                stage.hide();
            }
        }
    }
}
