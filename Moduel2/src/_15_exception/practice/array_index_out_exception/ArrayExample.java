package _15_exception.practice.array_index_out_exception;

import java.util.Random;

public class ArrayExample {
    public int[] createRandom(){
        Random rd = new Random();
        int[] arr = new int[100];
        System.out.println("Danh sách phần tử của mảng");
        for (int i = 0; i < 100; i++) {
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        return arr;
    }
}
