package _14_sort_algorithm.exercise;

import java.util.Arrays;

public class MinhHoaInsertionSort {
    public static void insertionSort(int[] array){
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j  = i;
            while (j > 0 && temp < array[j - 1]){
                array[j] = array[j - 1];
                j--;
            }
            array[j] = temp;
            System.out.println(Arrays.toString(array));
        }
    }

    public static void main(String[] args) {
        int[] array = {5,2,4,8,6,1,3};
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }
}
