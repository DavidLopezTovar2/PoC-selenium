package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RunTest {

    WebDriver driver;

    @BeforeTest
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        driver = new ChromeDriver();
    }

    @Test
    public void loginTest(){
        driver.get("https://s-beta.taringa.net/login");

        WebElement username = driver.findElement(By.name("id"));
        username.sendKeys("dadavivi88@hotmail.com");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("Toolbar1997");

        WebElement login = driver.findElement(By.linkText("Login"));
        login.click();
    }

    @AfterTest
    public void quite(){
        driver.close();
    }
}
