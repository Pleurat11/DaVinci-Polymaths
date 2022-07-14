package net.davinci.utilities;

public class BrowserUtils {

    public static void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
