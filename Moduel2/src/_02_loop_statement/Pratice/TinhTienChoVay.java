package _02_loop_statement.Pratice;

import java.util.Scanner;

public class TinhTienChoVay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money;
        int month;
        float interestRate;
        System.out.println("So tien Vay");
        money = Double.parseDouble(scanner.nextLine());
        System.out.println("So thang vay");
        month = Integer.parseInt(scanner.nextLine());
        System.out.println("Lai suat nam");
        interestRate = Float.parseFloat(scanner.nextLine());
        double totalInterest = 0;
        for(int i = 0; i < month; i++){
            totalInterest += money * (interestRate/100)/12 * month;
        }
        System.out.println("Total of interest: " + totalInterest);
    }
}
