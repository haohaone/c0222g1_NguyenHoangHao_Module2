package _02_loop_statement.Pratice;

import java.util.Scanner;

public class UocChungLonNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so a");
        int  a = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap so b");
        int b = Integer.parseInt(scanner.nextLine());
        int i = 1;
        int uocChungLonNhat = 0;
        if (a == 0 || b == 0){
            System.out.println("Khong có uoc chung");
        }else {
            while (true) {
                if (a % i == 0 && b % i == 0) {
                    uocChungLonNhat = i;
                }
                ++i;
                if (i > b && i > a) {
                    break;
                }
            }
        }
        System.out.println("Uoc chung lon nhat cua a ba b la "+ uocChungLonNhat);
    }
}
