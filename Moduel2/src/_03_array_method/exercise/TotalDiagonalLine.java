package _03_array_method.exercise;

import java.util.Scanner;

public class TotalDiagonalLine {
    public static int tongCheo (int [][] array){
        int totalLeft = 0;
        int totalRight = 0;
        for (int i = 0,j = array.length - 1; i < array.length; i++,j--) {
            totalLeft += array[i][i];
            totalRight += array[i][j];
        }
        return totalLeft + totalRight;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chieu dai cho ma tran vuong");
        int number = Integer.parseInt(scanner.nextLine());
        int [][] arr = new int[number][number];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhap phan tu cho dong " + i);
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        System.out.println("Tong 2 duong cheo la " + tongCheo(arr));
    }
}
