package _01_introduction_to_java.Pratice;

import java.util.Scanner;

public class DayOfMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap thang");
        int month = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap nam");
        int years = Integer.parseInt(scanner.nextLine());
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Co 31 ngay");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Co 30 ngay");
                break;
            case 2:
                if (years % 4 == 0 && years % 100 == 0 || years % 400 == 0){
                    System.out.println("Co 29 ngay");
                }else {
                    System.out.println("Co 28 ngay");
                }
        }
    }
}
