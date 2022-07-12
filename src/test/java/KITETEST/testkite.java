package KITETEST;

import BaseClass.Base;
import PomKite.ConsoleWindow;
import PomKite.HomePage;
import PomKite.Loginpage;
import PomKite.PinPage;
import UTILITY.Listerners;
import UTILITY.Utility;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

@Listeners(Listerners.class)
public class testkite extends Base {
    HomePage homepage;
    Loginpage login;
    PinPage pin;
    ConsoleWindow console;

    @BeforeClass
    public void lounchBrowser() throws IOException {
        chrome();
        driver.get(Utility.getdataproperty("URL"));

    }

    @BeforeMethod
    public void gohomepage() throws IOException, InterruptedException {
        homepage = new HomePage();
        login = new Loginpage(driver);
        pin = new PinPage(driver);
        console=new ConsoleWindow();

        login.sendUsername(Utility.getdataproperty("usr"));
        login.sendPassward(Utility.getdataproperty("PASS"));
        login.submitButton();
        Utility.implicitWait(500000);
        pin.sendPin(Utility.readDataExcel(0, 2));
        pin.clicCountinueButton();
        Utility.implicitWait(5000);
    }

    @Test
    public void validateUserId() throws IOException, InterruptedException {

        Assert.assertEquals(homepage.validateUsername(),Utility.readDataExcel(0,2),"both user name is same test case is pass");



    }
    @Test(priority = -1)
     public void consolePage() throws InterruptedException {
        SoftAssert soft=new SoftAssert();
        soft.assertTrue(console.getId(),"does not click on document button");
    }

}


     /* @Test(priority = 1)
          public void buyShare() throws InterruptedException {
          homepage.buy3NumberShare();


      }*/
      


    /*  @AfterMethod
     public void logoutbutton() throws InterruptedException, IOException {
       homepage.logOutButton();


       }
     @AfterClass
         public void returnbrower(){
           driver.quit();
       }*/




















