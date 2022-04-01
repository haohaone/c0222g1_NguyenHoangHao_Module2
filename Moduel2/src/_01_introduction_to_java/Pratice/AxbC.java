package _01_introduction_to_java.Pratice;

import java.util.Scanner;

public class AxbC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cho phuong trinh bac nhat a * x + b = c");
        System.out.println("Nhap so a");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap so b");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap so c");
        double c = Double.parseDouble(scanner.nextLine());
        if (a==0){
            System.out.println("Phuong trinh vo nghiem");
        }else if (b==c){
            System.out.println("Phuong trinh co vo so nghiem");
        }else {
            System.out.println("Nghiem la :" +(c - b / a));
        }
    }
}
