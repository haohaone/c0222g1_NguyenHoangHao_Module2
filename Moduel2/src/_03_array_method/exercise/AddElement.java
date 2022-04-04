package _03_array_method.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class AddElement {
    public static void themPhanTuVaoMang (int[] Array,int num,int changeNum) {
        if (num <= Array.length-1){
            for (int i = Array.length - 1; i >= num ; i--) {
                if (i==num){
                    Array[i]=changeNum;
                    break;
                }
                Array[i] = Array[i - 1];
            }
            System.out.println(Arrays.toString(Array));
        }else {
            System.out.println("Vi tri nhap vao khong co trong mang");
        }
    }

    public static void main(String[] args) {
        int [] Array = {1,2,3,4,5,6,7,8,9,0,0,0};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vi tri can them");
        int num = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap gia tri can them");
        int number = Integer.parseInt(scanner.nextLine());
        themPhanTuVaoMang(Array,num,number);
    }
}
