package com.uservalidator;

import java.util.regex.Pattern;

public class UserValidator
{
    public static final String NAME_PATTERN =  "^[A-Z]+[a-zA-Z]{2,}$";
    public static final String EMAIL_ADDRESS_PATTERN = "^[a-zA-Z.]{3,}[@][a-zA-Z]{2,}[.][a-z]{2}[.][a-z]{2,}$";
    public static final String MOBILE_NUMBER_PATTERN = "^[1-9][0-9][ ][6-9][0-9]{9}$";
    private static final String PASSWORD_PATTERN = "^(?=.*[A-Z])" +  "(?=.*[!@#$%^&*]){1}" + "(?=.*[0-9]).{8,}$";

    public boolean validateFirstName(String fname)
    {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matcher(fname).matches();
    }
    public boolean validLastName(String lname)
    {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matcher(lname).matches();
    }
    public boolean validateEmailId(String email)
    {
        Pattern pattern = Pattern.compile(EMAIL_ADDRESS_PATTERN);
        return pattern.matcher(email).matches();
    }
    public boolean validateMobileNumber(String mobile)
    {
        Pattern pattern = Pattern.compile(MOBILE_NUMBER_PATTERN);
        return pattern.matcher(mobile).matches();
    }
    public boolean validatePassword(String password)
    {
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        return pattern.matcher(password).matches();
    }

}
