package _10_arraylist_linkedlist.exercise.linked_list;

import java.util.LinkedList;
import java.util.List;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<Integer> ll = new MyLinkedList<>();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addFirst(4);
        ll.addFirst(4);
        ll.addFirst(2);
        ll.addFirst(9);
        ll.addFirst(9);
        System.out.println(ll.toString());

        ll.remove(2);
        System.out.println(ll.toString());

//        List<Integer> ll = new LinkedList<>();
//        ll.add(1);
//        ll.add(2);
//        ll.add(3);
//        System.out.println(ll.toString());
    }
}
