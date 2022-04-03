package _03_array_method.pratice;

public class ElementMax {
    public static int timSoLonNhat (int[] array){
        int max = array[0];
        for (int i = 1; i < array.length ; i++) {
            if (max < array[i]){
                max = array[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int [] arr = {7,5,3,8,2,1,5,6,0};
        System.out.println("So phan tu lan nhat trong mang la " + timSoLonNhat(arr));
    }
}
