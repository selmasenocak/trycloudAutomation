package com.trycloud.step_definitions;
import com.trycloud.pages.FilesPage;
import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US9_stepdefinitions {
    FilesPage filesPage=new FilesPage();//Creating an object from files page(POM)
    LoginPage loginPage = new LoginPage();//Creating an object from login page(POM)


    @Given("user on the dashboard page")
    public void userOnTheDashboardPage() {
        loginPage.login();
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Dashboard"));//Verifying user is on the dashboard
    }

    @When("the user clicks the Files module")
    public void theUserClicksTheModule() {
        filesPage.files.click();
    }


    @When("user click action-icon  from any file on the page")
    public void user_click_action_icon_from_any_file_on_the_page() {
        filesPage.actionIcon.click();
    }


    @When("user choose the Details option")
    public void user_choose_the_option() {
        filesPage.details.click();
    }

    @When("user write a {string} inside the input box")
    public void user_write_a_inside_the_input_box(String myMessage) {
        filesPage.comments.click();//Clicking the input box
        filesPage.setMessage(myMessage);//Sending the myMessage by a method
    }

    @When("user click the submit button to post it")
    public void user_click_the_submit_button_to_post_it() {
        filesPage.post.click();
    }

    @Then("Verify the {string} is displayed in the comment section.")
    public void verify_the_is_displayed_in_the_comment_section(String expectedText) {
        String actualText = filesPage.seePost.getText();//muhtar
        Assert.assertEquals(expectedText,actualText);//Text verification
        Assert.assertTrue(filesPage.seePost.isDisplayed());//Verifying the text is displayed on the page
    }







}

