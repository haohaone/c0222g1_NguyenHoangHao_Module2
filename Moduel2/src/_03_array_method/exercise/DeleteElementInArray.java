package _03_array_method.exercise;

import java.util.Arrays;
import java.util.Scanner;

class DeleteElementInArray {
    public static void deleteElement(int[] array, int num){
        boolean flag = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i]==num){
                for (int j = i+1;j < array.length ; j++,i++) {
                    array[i]=array[j];
                    if (j==array.length - 1){
                        array[j]=0;
                    }
                }
                flag = true;
                break;
            }else {
                flag = false;
            }
        }
        if (flag){
            System.out.println(Arrays.toString(array));
        }else {
            System.out.println("Khong co trong mang");
        }
    }

    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,9};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap phan tu can xoa");
        int num = Integer.parseInt(scanner.nextLine());
        deleteElement(array,num);
    }
}
