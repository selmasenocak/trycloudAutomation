package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilesPage {
    public  FilesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }




    @FindBy(xpath = "(//li)[2]")
    public WebElement files;

    @FindBy(xpath = "//a[2]/span[@class='icon icon-more']")
    public WebElement actionIcon;

    @FindBy(xpath = "//span[.='Details']")
    public WebElement details;


    @FindBy(xpath = "//span[@class='app-sidebar-tabs__tab-icon icon-comment']")
    public WebElement comments;

    @FindBy(xpath = "//div[@class='message']")
    public WebElement message;

    @FindBy(xpath = "(//input[@type='submit'])[2]")
    public WebElement post;

    @FindBy(xpath = "//div[.='muhtar']")
    public WebElement seePost;

    public void setMessage(String myMessage) {
        message.sendKeys(myMessage);
    }

    TalkModulePage talkModulePage = new TalkModulePage();

    public void filesOrTalkModule(String module) {
        if (module.equals("Files")) {
            files.click();
        } else {
            talkModulePage.talkModule.click();
        }

    }
}