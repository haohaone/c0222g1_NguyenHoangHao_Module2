package _02_loop_statement.Pratice;

import java.util.Scanner;

public class KiemTraSoNguyen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("kiem tra so nguyen to");
        int num = Integer.parseInt(scanner.nextLine());
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("Day la so nguyen to");
        }else {
            System.out.println("Kay khong phai la so nguyen to");
        }
    }
}
