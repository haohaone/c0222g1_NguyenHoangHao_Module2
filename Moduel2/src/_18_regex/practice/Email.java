package _18_regex.practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {

    private static final String EMAIL_REGEX =   "^[A-Za-z0-9]+@[A-Za-z0-9]+(\\.[A-Za-z0-9]+){1,2}$";
    public static final String[] validEmail = new String[] { "a@gmail.com.vn", "ab@yahoo.com", "abc@hotmail.com.vn.dn" };
    public static final String[] invalidEmail = new String[] { "@gmail.com", "ab@gmail.", "@#abc@gmail.com" };

    public static void main(String args[]) {
        for (String email : validEmail) {
            boolean check = Pattern.matches(EMAIL_REGEX, email);
            System.out.println("Email is " + email +" is valid: "+ check);
        }
        for (String email : invalidEmail) {
            boolean isvalid = Pattern.matches(EMAIL_REGEX, email);
            System.out.println("Email is " + email +" is valid: "+ isvalid);
        }
    }
}
