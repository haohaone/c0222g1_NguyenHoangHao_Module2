package case_study.service.implement.regex;

import java.util.Scanner;

public class ContractRegex {
    public static Scanner scanner = new Scanner(System.in);

    public static double fee(){
        double fee;
        while (true){
            try {
                fee = Integer.parseInt(scanner.nextLine());
                if (fee > 0){
                    break;
                }else {
                    System.out.println("Your input can't be negative");
                }
            } catch (NumberFormatException e) {
                System.err.println("Input wrong format");
            }
        }
        return fee;
    }

    public static int id(){
        int id;
        while (true){
            try {
                id = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.err.println("Input wrong format");
            }
        }
        return id;
    }
}
