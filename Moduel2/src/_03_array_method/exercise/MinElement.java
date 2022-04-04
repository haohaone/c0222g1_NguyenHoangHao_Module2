package _03_array_method.exercise;

public class MinElement {
    public static int min (int [] Array){
        int min = Array[0];
        for (int i = 1; i < Array.length; i++) {
            if (min > Array[i]){
                min = Array[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int [] Arr =  {5,6,18,3,4,11,10,13,9,7,3};
        System.out.println("Min is: "+ min(Arr));
    }
}
