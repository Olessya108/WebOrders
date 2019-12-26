package com.weborders.reviewcode;

import com.weborders.pages.RegistrationPage;
import com.weborders.utilities.Driver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationFormTestWithPOM {

    WebDriver driver;
    @Before
    public void setUp(){
        driver = Driver.get();
        driver.get("http://practice.cybertekschool.com/registration_form");
    }

    @After
    public void close(){
        Driver.closeDriver();
    }

    @Test
    public void test1(){
        RegistrationPage registrationPage =new RegistrationPage();
        // enter value in firstname
        registrationPage.firstname.sendKeys("John");
        // click sign up
        registrationPage.signup.click();
        // verify last name is required message is displayed
        Assert.assertTrue(registrationPage.lastnameErrorMsg.isDisplayed());
    }


    @Test
    public void test2(){
        RegistrationPage registrationPage = new RegistrationPage();
        // enter value in firstname
        registrationPage.firstname.sendKeys("John");
        // enter value in lastname
        registrationPage.lastname.sendKeys("Doe");
        // click sign up
        registrationPage.signup.click();
        // verify username is required message is displayed
        Assert.assertTrue(registrationPage.usernameErrorMsg.isDisplayed());

    }

    @Test
    public void test3(){
        RegistrationPage registrationPage = new RegistrationPage();
        // enter value in firstname
        registrationPage.firstname.sendKeys("John");
        // enter value in lastname
        registrationPage.lastname.sendKeys("Doe");
        // enter value in username
        registrationPage.username.sendKeys("johndoe");
        // click sign up
        registrationPage.signup.click();
        // verify email is required message is displayed
        Assert.assertTrue(registrationPage.emailErrorMsg.isDisplayed());
    }


}
