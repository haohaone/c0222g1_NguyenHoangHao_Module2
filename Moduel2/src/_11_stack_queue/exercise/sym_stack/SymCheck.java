package _11_stack_queue.exercise.sym_stack;

import java.util.Scanner;
import java.util.Stack;

public class SymCheck {
    public static boolean symCheck(String string) {
        String[] symArray = string.split("");
        Stack<String> symStack = new Stack<>();
        boolean flag = false;

        for (int i = 0; i < symArray.length; i++) {
            if (symArray[i].equals("(")) {
                symStack.add(symArray[i]);
            }
            if (symArray[i].equals(")")) {
                if (symStack.isEmpty()) {
                    flag = false;
                    break;
                } else if (symArray[i].equals(")") && symStack.pop().equals("(")) {
                    flag = true;
                } else {
                    flag = false;
                }
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        System.out.println("Input palindrome");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        System.out.println(symCheck(string));
    }
}
