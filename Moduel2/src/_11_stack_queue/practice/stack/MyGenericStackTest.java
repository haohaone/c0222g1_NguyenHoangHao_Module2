package _11_stack_queue.practice.stack;

public class MyGenericStackTest {
    public static void main(String[] args) {
        MyGenericStack<String> stack = new MyGenericStack();
        stack.push("Five");
        stack.push("Four");
        stack.push("Three");
        stack.push("Two");
        stack.push("One");
        System.out.println(stack.toString());
        System.out.println(stack.pop());
    }
}
