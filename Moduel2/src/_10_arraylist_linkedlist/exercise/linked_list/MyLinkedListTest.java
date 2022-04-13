package _10_arraylist_linkedlist.exercise.linked_list;

import java.util.LinkedList;
import java.util.List;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<Integer> ll = new MyLinkedList<>();
        ll.addFirst(2);
        ll.addLast(1);
        ll.addLast(4);
        ll.addLast(4);
        ll.addLast(2);
        ll.addLast(9);
        ll.addLast(9);
        System.out.println(ll.toString());

        MyLinkedList<Integer> clone = new MyLinkedList<>();
        clone = ll.clone();
        System.out.println(clone);

//        List<Integer> ll = new LinkedList<>();
//        ll.add(1);
//        ll.add(2);
//        ll.add(3);
//        System.out.println(ll.toString());
    }
}
