package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import pages.LoginPage;

public class LoginTest extends TestsDriver {

    @Test()
    public void loginUser(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.getPage();
        loginPage.setUserName("dadavivi88@hotmail.com");
        loginPage.setPassword("Toolbar1997");
        loginPage.login();
    }

    @Test
    public void loginAdmin(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.getPage();
        loginPage.setUserName("test_user_21");
        loginPage.setPassword("CableTecladoBlanco");
        loginPage.login();
    }

    @Test
    public void loginFacebook(){

    }

    @Test
    public void loginGoogle(){

    }

    public static void loginUser(WebDriver driver){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.getPage();
        loginPage.setUserName("dadavivi88@hotmail.com");
        loginPage.setPassword("Toolbar1997");
        loginPage.login();
    }

}
