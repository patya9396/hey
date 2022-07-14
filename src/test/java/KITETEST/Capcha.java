package KITETEST;

import BaseClass.Base;
import UTILITY.Listerners;
import UTILITY.Utility;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
@Listeners(Listerners.class)
public class Capcha extends Base {

    @Test
    public  void irtc() throws IOException, InterruptedException, TesseractException {
        chrome();
        driver.get("https://www.irctc.co.in/");
        Utility.implicitWait(7898766);
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
        Utility.implicitWait(7898766);
        driver.findElement(By.xpath("//div[@class='h_menu_drop_button hidden-xs']")).click();
        Utility.implicitWait(7898766);
        driver.findElement(By.xpath("//button[text()='LOGIN']")).click();
        //(//div[@class='form-group'])[3]//div[@class='captcha_div']
        Utility.implicitWait(7898766);
        driver.switchTo().frame("html5Captcha");
        Utility.implicitWait(7898766);
        WebElement imageElement = driver.findElement(By.xpath("(//div[@class='form-group form-sd ng-star-inserted']//img)[2]"));
        Utility.implicitWait(897766776);
        // Utility.scrollIntoView(imageElement);
        Utility.implicitWait(897766776);
        File src = imageElement.getScreenshotAs(OutputType.FILE);
        File myfile=new File("C:\\Users\\BusinessComputers.in\\IdeaProjects\\INVESTMENT_BANKING\\src\\TestData.png");
        FileHandler.copy(src,myfile);
        Thread.sleep(5000);
        ITesseract img=new Tesseract();
        String str = img.doOCR(myfile);
        System.out.println(str);

    }



}
