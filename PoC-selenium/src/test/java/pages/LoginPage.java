package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase {

    public LoginPage (WebDriver driver){
        super(driver);
    }

    @FindBy(name = "id")
    WebElement username;

    @FindBy(name = "password")
    WebElement password;

    @FindBy(linkText = "Login")
    WebElement loginButton;

    public void getPage(){
        driver.get("https://s-beta.taringa.net/login");
    }

    public void setUserName(String text){
        sendKeys(username,text);
    }

    public void setPassword(String text){
        sendKeys(password,text);
    }

    public void login(){
        click(loginButton);
    }





}
