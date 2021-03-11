package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    private String formAuthenticationLink = "Form Authentication";
    private String wysiwigEditorLink = "WYSIWYG Editor";

        public HomePage (WebDriver driver){
            super(driver);
        }

    public LoginPage clickFormAuthentication(){
        clickLink(formAuthenticationLink);
        return new LoginPage(driver);
    }

    public FrameEditorPage clickWysiwygEditor() {
        clickLink(wysiwigEditorLink);
        return new FrameEditorPage(driver);
    }

    private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }
}
