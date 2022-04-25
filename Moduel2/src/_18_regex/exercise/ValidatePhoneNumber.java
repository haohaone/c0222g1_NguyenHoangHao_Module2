package _18_regex.exercise;

import java.util.regex.Pattern;

public class ValidatePhoneNumber {
    private static final String PHONE_REGEX =   "^\\([0-9]{2}\\)-\\(0[0-9]+\\)$";
    public static  String[] validPhoneNum = new String[] { "(84)-(0978489648)"};
    public static  String[] invalidPhoneNum = new String[] { "(a8)-(22222222)"};

    public static void main(String args[]) {
        for (String name : validPhoneNum) {
            boolean check = Pattern.matches(PHONE_REGEX, name);
            System.out.println("Email is " + name +" is valid: "+ check);
        }
        for (String email : invalidPhoneNum) {
            boolean isvalid = Pattern.matches(PHONE_REGEX, email);
            System.out.println("Email is " + email +" is valid: "+ isvalid);
        }
    }
}
