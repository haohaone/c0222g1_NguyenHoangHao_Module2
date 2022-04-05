package _03_array_method.exercise;

public class MaxElement {
    public static int max (int [] array){
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]){
                max = array[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int [][] arr = {
                {2,15,6,1,3,17,8,9},
                {5,6,18,3,4,11,10,13,9,7,3},
                {11,5,3,14,8,19,6,12,4,7},
                {6,11,13},
                {17,8}
        };
        int max = max(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (max < max(arr[i])){
                max = max(arr[i]);
            }
        }
        System.out.println("Max is: "+max);
    }
}
