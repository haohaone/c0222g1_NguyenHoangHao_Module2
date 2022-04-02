package _03_array_method.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class TongCot {
    public static int array (int [] array){
        int total = 0;
        for (int value : array) {
            total += value;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so dong cho mang 2 chieu");
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap so phan tu trong mang");
        int number1 = Integer.parseInt(scanner.nextLine());
        int [][] arr = new int[number][number1];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhap phan tu cho dong "+i);
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }

        System.out.println("Exit: -1");
        System.out.println("Vi tri cot can tinh tong");
        while (true){
            int num = Integer.parseInt(scanner.nextLine());
            if (num >= 0 || num < arr.length){
                System.out.println("Tong cac phan tu o vi tri "+num+" la "+array(arr[num]));
            }else {
                System.out.println("Vi tri cot khong co trong mang");
            }
            if (num == -1){
                System.exit(0);
            }
        }
    }
}
