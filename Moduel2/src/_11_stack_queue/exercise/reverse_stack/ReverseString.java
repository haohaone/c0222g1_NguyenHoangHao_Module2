package _11_stack_queue.exercise.reverse_stack;

import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        String string = "hao hao ne";
        String [] arr = string.split(" ");
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
        string = "";
        int stackSize = stack.size();
        for (int i = 0; i < stackSize; i++) {
            string += stack.pop();
            if (i == stackSize - 1){
                string += " ";
            }
        }

        System.out.println(string);
    }
}

