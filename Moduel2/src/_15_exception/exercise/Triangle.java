package _15_exception.exercise;

import java.util.Scanner;

public class Triangle {
    public static void illegalTriangleException(int size1, int size2, int size3) throws Exception {
        if (size1 < -1 || size2 < -1 || size3 < -1) {
            throw new Exception();
        }
        if (size1 + size2 < size3 || size1 + size3 < size2 || size3 + size2 < size1) {
            throw new Exception();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Nhập size 1");
            int size1 = Integer.parseInt(scanner.nextLine());

            System.out.println("Nhập size 2");
            int size2 = Integer.parseInt(scanner.nextLine());

            System.out.println("Nhập size 3");
            int size3 = Integer.parseInt(scanner.nextLine());
            illegalTriangleException(size1, size2, size3);
            System.out.println("3 cạnh của tam giác");
        } catch (Exception e) {
            System.err.println("Không phải cạnh của tam giác ");
        }
    }
}
