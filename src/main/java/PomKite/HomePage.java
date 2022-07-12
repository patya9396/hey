package PomKite;

import BaseClass.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import java.time.Duration;
import java.util.*;

public class HomePage extends Base {


    //datamember

    @FindBy(xpath = "//span[@class='user-id']") private WebElement USERID;
    @FindBy(xpath = "//a[@target='_self']")private WebElement LOGOUTBUTTON;
    @FindBy(xpath = "//div[@class='vddl-list list-flat']")
    private List<WebElement>STOCKLIST;
    @FindBy(xpath = "(//div[@class='info'])[2]//span[@class='nice-name']") private WebElement SHARE3NUMBER;
    @FindBy(xpath = "//a[@class='button button-blue']")private   WebElement ACTIVENOWBUTTON;




    //constructer
    public  HomePage(){
        PageFactory.initElements(driver,this);

    }
    // methods

    public String validateUsername() {

        String actual = USERID.getText();
        return actual;
    }

    public void stockRead(){
        Iterator<WebElement> ele = STOCKLIST.iterator();

        while (ele.hasNext()){

             System.out.println(ele.next().getText());


        }


    }

    public void buy3NumberShare() throws InterruptedException {
     Actions act=new Actions(driver);
     act.moveToElement(SHARE3NUMBER).perform();

    }


     public void logOutButton() throws InterruptedException {
        USERID.click();
        Thread.sleep(600);
        LOGOUTBUTTON.click();



     }



}
