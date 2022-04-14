package _11_stack_queue.exercise.reverse_stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ReverseInteger {
    public static void main(String[] args) {
        int [] arrayInteger = {1,2,3,4,5,6};
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arrayInteger.length; i++) {
            stack.push(arrayInteger[i]);
        }


        List<Integer> arrayList = new ArrayList<>();
        int stackSize = stack.size();
        for (int i = 0; i < stackSize; i++) {
            arrayList.add(stack.pop());
        }

        for (Integer integer : arrayList) {
            stack.push(integer);
        }

        System.out.println(stack.toString());
    }
}
