package _01_introduction_to_java.Pratice;

import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Nhap chieu dai");
        int chieuDai =  number.nextInt();
        System.out.println("Nhap chieu rong");
        int chieuRong = number.nextInt();
        int dienTich = chieuDai*chieuRong;
        System.out.println("Dien tich hcn la: " + dienTich);
    }
}
