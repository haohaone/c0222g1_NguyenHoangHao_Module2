package _15_exception.exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Triangle {
    public static void illegalTriangleException(int size1, int size2, int size3) throws IllegalTriangleException {
        if (size1 + size2 < size3 && size1 + size3 < size2 && size3 + size2 < size1) {
            throw new IllegalTriangleException();
        }
    }

    public static void negative(int size1, int size2, int size3) throws Negative {
        if (size1 < 0 || size2 < 0 || size3 < 0) {
            throw new Negative();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size1;
        int size2;
        int size3;
        while (true) {
            try {
                System.out.println("Nhập size 1");
                size1 = Integer.parseInt(scanner.nextLine());

                System.out.println("Nhập size 2");
                size2 = Integer.parseInt(scanner.nextLine());

                System.out.println("Nhập size 3");
                size3 = Integer.parseInt(scanner.nextLine());

                negative(size1, size2, size3);
                illegalTriangleException(size1, size2, size3);
                System.out.println("3 cạnh của tam giác");
                break;
            }
            catch (IllegalTriangleException e) {
                System.err.println("Không phải cạnh của tam giác ");
            } catch (Negative negative) {
                System.err.println("Không nhâp số âm");
            } catch (NumberFormatException e) {
                System.err.println("Không được nhập chữ");
            }
        }
    }
}
