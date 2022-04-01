package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TalkModulePage {

    public TalkModulePage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[@aria-label='Talk'])[1]")
    public WebElement talkModule;

    @FindBy(xpath = "//input[@placeholder='Search conversations or users']")
    public WebElement userSearchBox;

    @FindBy(xpath = "//div[@placeholder='Write message, @ to mention someone …']")
    public WebElement messageBox;

    @FindBy(xpath = "//button[@class='new-message-form__button submit icon-confirm-fade']")
    public WebElement submitMessageBtn;

    @FindBy(xpath = "//span[@class='acli__content__line-one__title']")
    public WebElement userFind;

    @FindBy(xpath = "//button[@class='new-message-form__button submit icon-confirm-fade']")
    public WebElement messageDisplayed;
}