import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Find10Elements {
    WebDriver wd ;


    @BeforeTest
    public void prepare(){
        wd = new FirefoxDriver();
        wd.get("https://ilcarro-1578153671498.web.app/search");
    }

    @Test
    public void findElements(){
        wd.findElement(By.tagName("a"));
        wd.findElement(By.tagName("input"));
        wd.findElement(By.tagName("span"));
        wd.findElement(By.className("search-card"));
        wd.findElement(By.className("header"));
        wd.findElement(By.className("title-container"));
        wd.findElement(By.id("0"));
        wd.findElement(By.id("city"));
        wd.findElement(By.id("dates"));

    }

    @AfterTest
    public void afterTest(){
        wd.quit();
    }
}
