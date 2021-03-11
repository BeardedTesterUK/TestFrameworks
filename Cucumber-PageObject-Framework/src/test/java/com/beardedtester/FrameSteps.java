package com.beardedtester;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.FrameEditorPage;
import pages.HomePage;

import static org.junit.Assert.assertEquals;

public class FrameSteps {}

   /* FrameEditorPage frame;
    WebDriver driver;
    HomePage home;

    @Given("^the Frame home page$")
    public void the_Frame_home_page(){
        home = new HomePage(driver);
        home.navigateTo();
        home.clickWysiwygEditor();
    }

    @When("^Input into frame$")
    public void input_into_frame(){
        frame = new FrameEditorPage(driver);
        frame.clearTextArea();
        frame.setTextArea("hello");
        frame.decreaseIndention();
        frame.setTextArea("world");
    }

    @Then("^Text input is correct$")
    public void text_input_is_correct(){
        String string = frame.getTextFromEditor();
        assertEquals( "Text from editor is incorrect","hello"+"world",string);
    }
}*/
