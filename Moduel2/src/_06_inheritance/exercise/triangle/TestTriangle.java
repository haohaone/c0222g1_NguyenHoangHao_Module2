package _06_inheritance.exercise.triangle;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double size1, size2, size3;
        while (true){
            System.out.println("Nhâp cạnh đầu tiên");
            size1 = Double.parseDouble(scanner.nextLine());
            System.out.println("Nhập cạnh thứ 2");
            size2 = Double.parseDouble(scanner.nextLine());
            System.out.println("Nhập cạnh thứ 3");
            size3 = Double.parseDouble(scanner.nextLine());
            if (size1 + size2 > size3 && size2 + size3 > size1 && size1 + size3 > size2){
                break;
            }else {
                System.out.println("Không phải là 3 cạnh của 1 tam giác");
            }
        }
        System.out.println("Màu sắc tam giác");
        String color = scanner.nextLine();
        System.out.println("Thêm thành công");
        Triangle triangle = new Triangle(size1, size2, size3, color);
        System.out.println(triangle.toString());
    }
}
