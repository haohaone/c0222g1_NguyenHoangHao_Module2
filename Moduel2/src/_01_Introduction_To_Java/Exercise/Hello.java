package _01_Introduction_To_Java.Exercise;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your Name");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);
    }
}
