package _03_array_method.exercise;

import java.util.Arrays;

public class StringMerge {
    public static int[] noiChuoi(int [] Arr1 , int [] Arr2){
        int newArray [] = new int[Arr1.length + Arr2.length];
        for (int i = 0; i < Arr1.length; i++) {
            newArray[i] = Arr1[i];
        }
        int a = 0;
        for (int i = Arr1.length; i < newArray.length; i++) {
            newArray[i] = Arr2[a];
            a++;
        }
        return newArray;
    }

    public static void main(String[] args) {
        int [] Arr1 = {1,2,3,4,5,6,7,8,9,10,99};
        int [] Arr2 = {11,12,13,14,15,99};
        System.out.println(Arrays.toString(noiChuoi(Arr1,Arr2)));
    }
}
