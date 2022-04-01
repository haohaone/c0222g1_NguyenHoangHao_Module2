package _01_introduction_to_java.Pratice;

import java.util.Scanner;

public class Weight_height {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Can nang cua ban");
        double canNang = Double.parseDouble(scanner.nextLine());
        System.out.println("Chieu cao cua ban");
        double chieuCao = Double.parseDouble(scanner.nextLine());
        double bmi = canNang/Math.pow(chieuCao,2);
        System.out.println("BMI cua ban la " + bmi);
        if (bmi<18.5){
            System.out.println("Thieu can");
        }else if (bmi<25.0){
            System.out.println("Binh thuong");
        }else if (bmi<30){
            System.out.println("Thua can");
        }else {
            System.out.println("Beo phi");
        }
    }
}
