package _10_arraylist_linkedlist.exercise;

import java.util.Arrays;

public class ArrayListTest {
    public static void main(String[] args) {
        Arraylist<Integer> arrayList = new Arraylist<>();
        arrayList.push(1);
        arrayList.push(2);
        arrayList.push(3);
        arrayList.push(4);
        System.out.println(arrayList.toString());
        System.out.println();
        arrayList.add(2,99);
        System.out.println(arrayList.toString());
        arrayList.remove(2);
        System.out.println(arrayList.toString());
        System.out.println(arrayList.size());

        Arraylist<Integer> newArrayList = new Arraylist<>();
    }
}
