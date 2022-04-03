package _02_loop_statement.pratice;

import java.util.Scanner;

public class PrintsStar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Draw the triangle");
        System.out.println("2. Draw the square");
        System.out.println("3. Draw the rectangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice:");
        String star = "* ";
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                for (int i = 0; i < 5; i++) {
                    System.out.println(star);
                    star += "* ";
                }
                break;
            case 2:
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 5; j++) {
                        System.out.printf("* ");
                    }
                    System.out.println("");
                }
                break;
            case 3:
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 10; j++) {
                        System.out.printf("* ");
                    }
                    System.out.println("");
                }
                break;
            case 4:
                System.exit(0);
            default:
                System.out.println("No choice");
        }
    }
}
