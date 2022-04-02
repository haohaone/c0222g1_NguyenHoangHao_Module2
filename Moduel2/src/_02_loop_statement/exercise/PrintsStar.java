package _02_loop_statement.Exercise;

import java.util.Scanner;

public class VeSao2 {
//    public void Hcn(){
//
//    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Tam Giac Dinh Ben Trai");
        System.out.println("2. Tam Giac Dinh Ben Phai");
        System.out.println("3. Tam Giac Dinh Duoi Ben Trai");
        System.out.println("4. Tam Giac Dinh Duoi Ben Phai");
        System.out.println("5. Tam Giac Can");
        System.out.println("6. Hinh Chu Nhat");
        System.out.println("Enter your choice:");
        while (true){
            String star = "* ";
            String space = "  ";
            int num = 0;
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
                        for (int j = num; j < 4; j++) {
                            System.out.print("  ");
                        }
                        num++;
                        System.out.println(star);
                        star += "* ";
                    }
                    break;
                case 3:
                    for (int i = 0; i < 5; i++) {
                        for (int j = num; j < 5; j++) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                        num++;
                    }
                    break;
                case 4:
                    for (int i = 0; i < 5; i++) {
                        for (int j = num; j < 5; j++) {
                            System.out.print(star);
                        }
                        num++;
                        System.out.println();
                        System.out.print(space);
                        space += "  ";
                    }
                    break;
                case 5:
                    for (int i = 0; i < 5; i++) {
                        for (int j = num; j < 9; j++) {
                            System.out.print(star);
                        }
                        num += 2;
                        System.out.println();
                        System.out.print(space);
                        space += "  ";
                    }
                    break;
                case 6:
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 7; j++) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}
