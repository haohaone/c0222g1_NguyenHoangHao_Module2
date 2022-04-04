package _03_array_method.exercise;

import java.util.Arrays;
import java.util.Scanner;

class DeleteElementInArray {
    public static void deleteElement(int[] Array, int num){
        boolean flag = false;
        for (int i = 0; i < Array.length; i++) {
            if (Array[i]==num){
                for (int j = i+1;j < Array.length ; j++,i++) {
                    Array[i]=Array[j];
                    if (j==Array.length - 1){
                        Array[j]=0;
                    }
                }
                flag = true;
                break;
            }else {
                flag = false;
            }
        }
        if (flag){
            System.out.println(Arrays.toString(Array));
        }else {
            System.out.println("Khong co trong mang");
        }
    }

    public static void main(String[] args) {
        int [] Array = {1,2,3,4,5,6,7,8,9};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap phan tu can xoa");
        int num = Integer.parseInt(scanner.nextLine());
        deleteElement(Array,num);
    }
}
