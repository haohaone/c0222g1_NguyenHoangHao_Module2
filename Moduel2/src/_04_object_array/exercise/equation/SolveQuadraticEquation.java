package _04_object_array.exercise.equation;

import java.util.Scanner;

public class SolveQuadraticEquation {
        private double a,b,c;

        SolveQuadraticEquation() {

        }

        SolveQuadraticEquation(double a, double b, double c){
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
