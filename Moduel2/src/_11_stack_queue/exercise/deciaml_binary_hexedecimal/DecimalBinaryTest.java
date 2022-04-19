package _11_stack_queue.exercise.deciaml_binary_hexedecimal;

import java.util.Scanner;
import java.util.Stack;

public class DecimalBinaryTest {

    public static String decimalToBinary(int decimal){
        Stack<Integer> binary = new Stack<>();
        int divide = 0;
        while (true){
            divide = (decimal) % 2;
            binary.push(divide);
            decimal = decimal / 2;
            if (decimal  < 1){
                break;
            }
        }
        String string = "";
        int size = binary.size();
        for (int i = 0; i < size; i++) {
            string += binary.pop();
        }
        return string;
    }

    public static int binaryToDecimal(String binary){
        String [] string = binary.split("");
        Stack<Integer> binaryStack = new Stack<>();
        for (int i = 0; i < string.length; i++) {
            binaryStack.push(Integer.parseInt(string[i]));
        }
        int decimal = 0;
        for (int i = 0; i < string.length; i++) {
            decimal += binaryStack.pop() * Math.pow(2,i);
        }
        return decimal;
    }

    public static void main(String[] args) {

        int choice;
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("--------Menu--------");
            System.out.println("1. Decimal to Binary");
            System.out.println("2. Binary to Decimal");
            System.out.println("0. Exit");
            choice = Integer.parseInt(scanner.nextLine());
            String binary;
            int decimal;
            switch (choice){
                case 1:
                    binary = "";
                    System.out.println("Input Decimal convert to Binary");
                    decimal = Integer.parseInt(scanner.nextLine());
                    binary = decimalToBinary(decimal);
                    System.out.println(binary);
                    break;
                case 2:
                    decimal = 0;
                    System.out.println("Input Binary covert to Decimal");
                    binary = scanner.nextLine();
                    decimal = binaryToDecimal(binary);
                    System.out.println(decimal);
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }
}
