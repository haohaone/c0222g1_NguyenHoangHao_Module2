package _01_introduction_to_java.Exercise;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your Name");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);
    }
}
