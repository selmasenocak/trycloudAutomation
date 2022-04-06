package com.trycloud.step_definitions;


import com.trycloud.pages.FilesPage;
import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US9_stepdefinitions {
    FilesPage filesPage=new FilesPage();


    @When("user click action-icon  from any file on the page")
    public void user_click_action_icon_from_any_file_on_the_page() {
        filesPage.actionIcon.click();
    }
    @When("user choose the {string} option")
    public void user_choose_the_option(String string) {
        filesPage.details.click();
    }
    @When("user write a {string} inside the input box")
    public void user_write_a_inside_the_input_box(String myMessage) {
        filesPage.comments.click();
        filesPage.setMessage(myMessage);
        BrowserUtils.sleep(3);
    }

    @When("user click the submit button to post it")
    public void user_click_the_submit_button_to_post_it() {
        filesPage.post.click();
    }

    @Then("Verify the {string} is displayed in the comment section.")
    public void verify_the_is_displayed_in_the_comment_section(String expectedText) {
        BrowserUtils.sleep(3);
        String actualText = filesPage.seePost.getText();
        BrowserUtils.sleep(2);
        Assert.assertEquals(expectedText,actualText);
        System.out.println("actualText = " + actualText);
        System.out.println("expectedText = " + expectedText);
    }

    @Given("user on the dashboard page")
    public void userOnTheDashboardPage() {
    }

    @When("the user clicks the {string} module")
    public void theUserClicksTheModule(String arg0) {
    }
}