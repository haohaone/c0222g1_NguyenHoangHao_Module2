package case_study.view;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        String arg1 = "CodegymDaNang";

        String[] arr = arg1.split("");
        String arg2 = "";
        for (int i = 0; i < arr.length; i++) {
            arg2 += arr[i].toLowerCase();
            if ( i < arr.length-2 && arr[i + 1].charAt(0) < 91) {
                arg2 += " ";
            }
        }
        System.out.println(arg2);
    }
}
