package PomKite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {


    //datamember
    @FindBy(id = "userid")
    private WebElement USERID;
    @FindBy(id = "password")
    private WebElement PASSWARD;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement SUBMITBUTTON;


// constructer

    public Loginpage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    //methods
    public boolean sendUsername(String userName) {

        USERID.sendKeys(userName);
        boolean p1 = USERID.isDisplayed();
        boolean p2 = USERID.isSelected();
        boolean p3 = USERID.isEnabled();

        return false;

    }

    public boolean sendPassward(String passward) {
        PASSWARD.sendKeys(passward);


        return false;
    }
      public boolean submitButton(){
          SUBMITBUTTON.click();
          SUBMITBUTTON.isDisplayed();
          SUBMITBUTTON.isSelected();
          return true;
      }
     public boolean submitButton1(){
         boolean button = SUBMITBUTTON.isEnabled();
        return button;
     }










}
