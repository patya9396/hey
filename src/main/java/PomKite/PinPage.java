package PomKite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PinPage {

    //datamember
    @FindBy(id = "pin") private WebElement PIN;
    @FindBy(xpath = "//button[@type='submit']") private WebElement CONTINUEBUTTON;

    //constructer

    public PinPage(WebDriver driver){
        PageFactory.initElements(driver,this);

    }

    //methods
    public boolean sendPin(String pin){
        PIN.sendKeys(pin);

        return true;
    }
    public boolean clicCountinueButton(){
        CONTINUEBUTTON.click();
        CONTINUEBUTTON.isDisplayed();
        return false;
    }
















}
