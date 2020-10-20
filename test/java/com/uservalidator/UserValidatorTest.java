package com.uservalidator;

import org.junit.Assert;
import org.junit.Test;

public class UserValidatorTest
{
    //Welcome text
    @Test
    public void Welcome()
    {
        System.out.println(" Welcome to the program");
    }
    //Checking the validity of first name
    @Test
    public void given_firstName_WhenProper_GiveTrue() {
        UserValidator userValidator = new UserValidator();
        boolean result;
        result = userValidator.validateFirstName("Kale");
    }
    //Checking the validity of second name
    @Test
    public void given_LastName_Proper_Give_True()
    {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validLastName("Ibrah");
        Assert.assertTrue(result);
    }
    //Checking the validity of email id
    @Test
    public void given_email_WhenValid_GiveTrue()
    {
        UserValidator userValidator = new UserValidator();
        boolean result;
        result = userValidator.validateEmailId("ikhale@gmail.co.in");
        Assert.assertTrue(result);
    }
    //Checking the validity of mobile number
    @Test
    public void given_MobileNumber_WhenValid_GiveTrue()
    {
        UserValidator userValidator = new UserValidator();
        boolean result;
        result = userValidator.validateMobileNumber("91 9745945143");
        Assert.assertTrue(result);
    }
}
