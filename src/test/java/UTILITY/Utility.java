package UTILITY;

import BaseClass.Base;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class Utility extends Base {




   public static String readDataExcel(int row, int cell) throws IOException {
       File myfile=new File("D:\\allexcelpdf\\kitelogin.xlsx");
       Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
       String pin = mysheet.getRow(row).getCell(cell).getStringCellValue();

       return pin;
   }

    public static String getdataproperty(String key) throws IOException {
        Properties pro=new Properties();
        FileInputStream input=new FileInputStream("C:\\Users\\BusinessComputers.in\\IdeaProjects\\KiteProject1\\src\\com\\mydataResource.properties");
        pro.load(input);
        String ne = pro.getProperty(key);


        return ne;
    }
     public static void implicitWait(int time){
       driver.manage().timeouts().implicitlyWait(Duration.ofMillis(time));

     }
      public static void captureScreenShot(String pin) throws IOException {
          File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
           File dest=new File("D:\\takescreenshots"+pin+".png");
          FileHandler.copy(source,dest);
      }


     public static void action(){

         Actions act=new Actions(driver);

     }
     public  static void scrollIntoView(WebElement element){

         JavascriptExecutor scoll = ((JavascriptExecutor) driver);
         scoll.executeScript("arguments[0],scrollIntoView(true)",element);


     }


}
