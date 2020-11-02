package xyz.yuelai;

/**
 * @author zhong
 * @date 2020-10-14 15:26:19 周三
 */
public class AppLauncher {
    public static void main(String[] args) {
        FXApplication.launch(AppPreloader.class, App.class);
    }
}
