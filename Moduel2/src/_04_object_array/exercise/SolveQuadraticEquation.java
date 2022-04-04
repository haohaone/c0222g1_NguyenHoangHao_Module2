package _04_object_array.exercise;

import java.util.Scanner;

public class SolveQuadraticEquation {
    public static class QuadraticEquation {
        double a,b,c;

        private QuadraticEquation() {

        }

        private QuadraticEquation(double a, double b, double c){
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public double getA(){
            return this.a;
        }

        public double getDiscriminant(){
            return (this.b * this.b) - 4 * this.a * this.c;
        }

        public double getTwoRoot1(){
            return (((-this.b + Math.sqrt(getDiscriminant())) / (2 * this.a)));
        }

        public double getTwoRoot2(){
            return (((-this.b - Math.sqrt(getDiscriminant())) / (2 * this.a)));
        }

        public double getOneRoot(){
            return -this.c / this.b;
        }

        public double getOneDoubleRoot(){
            return -this.b / (2 * this.a);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhâp a");
        Double a = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhâp b");
        Double b = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhâp c");
        Double c = Double.parseDouble(scanner.nextLine());
        QuadraticEquation equation = new QuadraticEquation(a,b,c);
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
