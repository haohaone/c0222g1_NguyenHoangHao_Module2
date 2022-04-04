package _04_object_array.practice;

import java.util.Objects;
import java.util.Scanner;

public class ClassRectangle {
    public static class Rectangle{
        double width, height;

        public Rectangle(){

        }

        public Rectangle(double width,double height){
            this.width = width;
            this.height = height;
        }


        public double getArea(){
            return this.width * this.height;
        }

        public double perimeter(){
            return (this.height + this.width) * 2;
        }

        public String display(){
            return "Rectangle: "+"width = "+this.width+ " height = "+this.height;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều dài cho HCN");
        double width = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập chiều rộng cho HCN");
        double height = Double.parseDouble(scanner.nextLine());
        Rectangle rectangle = new Rectangle(width,height);
        System.out.println(rectangle.display());
        System.out.println("Diện tích: "+rectangle.getArea());
        System.out.println("Chu vi: "+rectangle.getArea());
    }
}
