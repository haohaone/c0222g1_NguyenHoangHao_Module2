package _18_regex.exercise;

import java.util.regex.Pattern;

public class ValidateClassName {
    private static final String NAME_REGEX =   "^[CAP][0-9]{4}[GHIKLM]$";
    public static  String[] validClassName = new String[] { "C0318G"};
    public static  String[] invalidClassName = new String[] { "M0318G", "P0323A"};

    public static void main(String args[]) {
        for (String name : validClassName) {
            boolean check = Pattern.matches(NAME_REGEX, name);
            System.out.println("Email is " + name +" is valid: "+ check);
        }
        for (String email : invalidClassName) {
            boolean isvalid = Pattern.matches(NAME_REGEX, email);
            System.out.println("Email is " + email +" is valid: "+ isvalid);
        }
    }
}
