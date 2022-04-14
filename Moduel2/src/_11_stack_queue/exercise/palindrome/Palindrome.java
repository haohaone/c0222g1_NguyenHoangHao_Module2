package _11_stack_queue.exercise.palindrome;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    public static boolean checkPalindrome(String string) {
        String [] arrayString = string.split("");
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();

        for (int i = 0; i < arrayString.length; i++) {
            stack.push(arrayString[i].toLowerCase());
            queue.add(arrayString[i].toLowerCase());
        }

        boolean flag = true;
        for (int i = 0; i < arrayString.length; i++) {
            if (!stack.pop().equals(queue.poll())){
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        System.out.println("Input palindrome");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        System.out.println(checkPalindrome(string));
    }
}
