package _18_regex.practice;

import java.util.regex.Pattern;

public class ValidateAccount {
    private static final String ACCOUNT_REGEX =   "^[_a-z]{6,}$";
    public static  String[] validAccount = new String[] { "haohao", "haohaone", "HAO_ne" };
    public static  String[] invalidAccount = new String[] { "haone1", "123456"};

    public static void main(String args[]) {
        for (String account : validAccount) {
            boolean check = Pattern.matches(ACCOUNT_REGEX, account);
            System.out.println("Email is " + account +" is valid: "+ check);
        }
        for (String account : invalidAccount) {
            boolean isvalid = Pattern.matches(ACCOUNT_REGEX, account);
            System.out.println("Email is " + account +" is valid: "+ isvalid);
        }
    }
}
