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
}