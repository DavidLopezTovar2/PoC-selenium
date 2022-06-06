package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import test.LoginTest;

public class CreatePostPage extends PageBase{

    public CreatePostPage(WebDriver driver){
        super(driver);
    }

    @FindBy(id = "OldPublisher_Publisher_input")
    WebElement titleInput;

    @FindBy(id = "Editor_BaseEditor_div")
    WebElement bodyInput;

    public void getPage(){
        LoginTest.loginUser(driver);
        driver.get("https://s-beta.taringa.net/create");
    }

    public void setTitle(String text){
        sendKeys(titleInput,text);
    }

    public void setBody(){
        sendKeys(bodyInput,"Lore mipsum");
    }


}
