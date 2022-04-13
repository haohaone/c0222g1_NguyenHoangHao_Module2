package _10_arraylist_linkedlist.exercise.array_list;

import _10_arraylist_linkedlist.exercise.array_list.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Double> arrayList = new ArrayList<>();
        arrayList.add(1.2);
        arrayList.add(2.3);
        arrayList.add(3.5);
        arrayList.add(4.6);
        arrayList.remove(2);
        System.out.println(arrayList);


    }
}
