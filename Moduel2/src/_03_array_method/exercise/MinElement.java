package _03_array_method.exercise;

public class MinElement {
    public static int min (int [] array){
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]){
                min = array[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int [] arr =  {5,6,18,3,4,11,10,13,9,7,3};
        System.out.println("Min is: "+ min(arr));
    }
}
