package PomKite;

import BaseClass.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public class ConsoleWindow  extends Base {
    //datamember
    @FindBy(xpath = "//a[@class='button button-blue']")private   WebElement ACTIVENOWBUTTON;
    @FindBy(xpath = "//a[@class='router-link-exact-active router-link-active']")private WebElement DASHBOARD;
    @FindBy(xpath = "//div[text()='Documents']")private WebElement DOCUMENT;



    // cunstructe
       public ConsoleWindow(){
           PageFactory.initElements(driver,this);


       }
       // methods

    public boolean getId() throws InterruptedException {
        ACTIVENOWBUTTON.click();
        Thread.sleep(500);
        Set<String> ids = driver.getWindowHandles();
        Iterator<String> id = ids.iterator();
        ArrayList AllIds=new ArrayList(ids);
        Object HomePageId = AllIds.get(0);
        Object ChildPageId = AllIds.get(1);
        System.out.println(HomePageId);
        System.out.println(ChildPageId);
        driver.switchTo().window((String) ChildPageId);
        Thread.sleep(20000);
        DOCUMENT.click();
        Thread.sleep(20000);
        driver.switchTo().window((String) HomePageId);


        return true;
    }












}
