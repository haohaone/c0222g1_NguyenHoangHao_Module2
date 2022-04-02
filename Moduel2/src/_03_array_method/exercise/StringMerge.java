package _03_array_method.Exercise;

import java.util.Arrays;

public class GopChuoi {
    public static int[] noiChuoi(int [] arr1 , int [] arr2){
        int newArray [] = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            newArray[i] = arr1[i];
        }
        int a = 0;
        for (int i = arr1.length; i < newArray.length; i++) {
            newArray[i] = arr2[a];
            a++;
        }
        return newArray;
    }

    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5,6,7,8,9,10,99};
        int [] arr2 = {11,12,13,14,15,99};
        System.out.println(Arrays.toString(noiChuoi(arr1,arr2)));
    }
}
