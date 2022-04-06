package _04_object_array.exercise.equation;

import java.util.Scanner;

public class TestEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhâp a");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhâp b");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhâp c");
        double c = Double.parseDouble(scanner.nextLine());
        SolveQuadraticEquation equation = new SolveQuadraticEquation(a,b,c);
        if (equation.getA() == 0){
            System.out.println("Phương trình có 1 nghiêm x: "+equation.getOneRoot());
        }else if (equation.getDiscriminant() < 0){
            System.out.println("Phương trình vô nghiệm");
        }else if (equation.getDiscriminant() == 0){
            System.out.println("Phương trình có 1 nghiệm kép: "+equation.getOneDoubleRoot());
        }else {
            System.out.println("Phương trình có 2 nghiệm: ");
            System.out.println("x = "+equation.getTwoRoot1());
            System.out.println("x = "+equation.getTwoRoot2());
        }
    }
}
