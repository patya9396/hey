package BaseClass;

import org.apache.bcel.classfile.Utility;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Base {

    public static WebDriver driver;


    public  void chrome() {
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();


    }

    public void fireFox() {
        {
            System.setProperty("webdriver.gecko.driver", "C:\\webdriver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
            driver = new FirefoxDriver();

        }


    }

    public static void scrollIntoView(WebElement element) {

        JavascriptExecutor scoll = ((JavascriptExecutor) driver);
        scoll.executeScript("arguments[0].scrollIntoView(true)", element);
    }
}