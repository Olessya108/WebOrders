package com.weborders.pages;

import com.weborders.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {

    public RegistrationPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(name = "firstname")
    public WebElement firstname;

    @FindBy(name = "lastname")
    public WebElement lastname;

    @FindBy(name = "username")
    public WebElement username;

    @FindBy(xpath = "//small[.='last name is required']")
    public WebElement lastnameErrorMsg;

    @FindBy(xpath = "//small[.='username is required']")
    public WebElement usernameErrorMsg;

    @FindBy(xpath = "//small[.='email address is required']")
    public WebElement emailErrorMsg;

    @FindBy(tagName = "button")
    public WebElement signup;

    @FindBy(tagName = "button")
    public WebElement list;

    public Select getList(){
        return new Select(list);
    }


}
