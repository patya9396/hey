package KITETEST;

import BaseClass.Base;
import PomKite.HomePage;
import PomKite.Loginpage;
import PomKite.PinPage;
import UTILITY.Listerners;
import UTILITY.Utility;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import java.io.IOException;


@Listeners({Listerners.class})
public class KiteLoginValidation extends Base {
      Loginpage page1;
      PinPage page2;


    @BeforeClass
       public void lounchSide() throws IOException {
        chrome();
        driver.get(Utility.getdataproperty("URL"));
        page1= new Loginpage(driver);
        page2=new PinPage(driver);
        Utility.implicitWait(6999999);
    }
        @Test
          public void cheakLoginPage() throws IOException {


        }

         @AfterMethod
           public void closeBrowser(){
           driver.quit();
         }






}
