package _11_stack_queue.practice.stack;

import _10_arraylist_linkedlist.exercise.linked_list.MyLinkedList;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<T> {
    private MyLinkedList<T> stack;

    public MyGenericStack() {
        stack = new MyLinkedList<>();
    }

    public boolean isEmpty() {
        return stack.size() == 0;
    }

    public void push(T e) {
        stack.addFirst(e);
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return (T) stack.removeLast();
    }

    public T peek() {
        return (T) stack.get(size());
    }

    public int size() {
        return stack.size();
    }

    @Override
    public String toString() {
        return stack.toString();
    }
}
