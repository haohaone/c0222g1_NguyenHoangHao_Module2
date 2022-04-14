package _11_stack_queue.exercise.deciaml_binary_hexedecimal;

import java.util.Scanner;
import java.util.Stack;

public class DecimalBinaryTest {
    public static int DecimalToBinary(int decimal){
        Stack<Integer> binary = new Stack<>();
        int divide = 0;
        while (true){
            divide = decimal % 2;
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
        return Integer.parseInt(string);
    }

    public static int BinaryToDecimal(int binary){
        String [] string = String.valueOf(binary).split("");
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
            int binary;
            int decimal;
            switch (choice){
                case 1:
                    binary = 0;
                    System.out.println("Input Decimal convert to Binary");
                    decimal = Integer.parseInt(scanner.nextLine());
                    binary = DecimalToBinary(decimal);
                    System.out.println(binary);
                    break;
                case 2:
                    decimal = 0;
                    System.out.println("Input Binary covert to Decimal");
                    binary = Integer.parseInt(scanner.nextLine());
                    decimal = BinaryToDecimal(binary);
                    System.out.println(decimal);
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }
}
