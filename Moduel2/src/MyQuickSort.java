import java.util.Arrays;

public class MyQuickSort {

    public static void quickSort(int[] array, int low, int high){
        if (array.length == 0 || array == null){
            return;
        }
        if (low >= high){
            return;
        }
        int temp = array[low];
        int i = low, j = high;
        while (i < j){
            while (i < j){
                if (array[j] < temp){
                    array[i] = array[j];
                    break;
                }
                j--;
            }
            System.out.println(Arrays.toString(array));
            while (i < j){
                if (array[i] > temp){
                    array[j] = array[i];
                    break;
                }
                i++;
            }
            System.out.println(Arrays.toString(array));
        }
        int index = i;
        array[index] = temp;
        System.out.println(Arrays.toString(array));



        if (j >= 0){
            quickSort(array, low, j);
        }
        if (index + 1 <= high){
            quickSort(array, index + 1 , high);
        }
    }


    public static void main(String[] args) {
        int arr[] ={6,5,10,7,9,2,4,1,3,0,10,15,17,19};
        quickSort(arr, 0, arr.length - 1);
    }
}
