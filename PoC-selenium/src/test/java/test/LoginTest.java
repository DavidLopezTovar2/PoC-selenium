package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest {

    WebDriver driver;

    @BeforeTest
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        driver = new ChromeDriver();
    }

    @Test
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

    @AfterTest
    public void quite(){
        driver.close();
    }

}
