package net.davinci.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;

public class Driver {
    private Driver(){}

    private static WebDriver driver;

    public static WebDriver getDriver(){
        if (driver == null){
            String browserType = ConfigurationReader.getProperty("browser");

            switch (browserType){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();

                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();

                    break;
                case "safari":
                    WebDriverManager.safaridriver().setup();
                    driver = new SafariDriver();
                    break;
            }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        }
        return driver;
    }

    public static void closeDriver(){
        driver.close();
    }
}