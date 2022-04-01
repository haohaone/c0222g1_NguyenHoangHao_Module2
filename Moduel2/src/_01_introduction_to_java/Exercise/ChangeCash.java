package _01_introduction_to_java.Exercise;

import java.util.Scanner;

public class ChangeCash {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap USD");
        int usd = Integer.parseInt(scanner.nextLine());
        System.out.println(23000*usd + "VND");
    }
}
