package pages;

import org.openqa.selenium.WebDriver;

import static org.junit.Assert.*;

public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    public HomePage navigateTo(){
        driver.navigate().to("https://the-internet.herokuapp.com/");
        assertEquals("The Internet", driver.getTitle());
        return new HomePage(driver);
    }
}
