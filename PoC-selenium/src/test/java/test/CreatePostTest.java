package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.CreatePostPage;

public class CreatePostTest extends TestsDriver {

    @Test
    public void createPost(){

        CreatePostPage cpp = new CreatePostPage(driver);
        cpp.getPage();
        cpp.setTitle("New title");
    }

    @Test
    public void createShout(){
        System.out.println("Hola");
    }

}
