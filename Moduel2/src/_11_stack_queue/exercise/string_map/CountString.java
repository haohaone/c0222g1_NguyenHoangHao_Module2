package _11_stack_queue.exercise.string_map;

import _10_arraylist_linkedlist.exercise.array_list.ArrayList;

import java.util.Arrays;
import java.util.Map;

public class CountString {
    public static void main(String[] args) {
        String string = "Hello GOOD Morning everybody good morning";
        String [] arrString = string.split(" ");

        Map<String,Integer> stringMap = new java.util.TreeMap<>();
        for (int i = 0; i < arrString.length; i++) {
            arrString[i] = arrString[i].toLowerCase();
        }

        for (int i = 0; i < arrString.length; i++) {
            int count = 1;
            if (arrString[i].equals("")){
                continue;
            }
            for (int j = i + 1; j < arrString.length; j++) {
                if (arrString[i].equals(arrString[j]) ){
                    arrString[j] = "";
                    count++;
                }
            }
            stringMap.put(arrString[i],count);
        }

        for (Map.Entry<String, Integer> entry: stringMap.entrySet()){
            System.out.println("Từ "+entry.getKey() + " có "+entry.getValue());
        }
    }
}
