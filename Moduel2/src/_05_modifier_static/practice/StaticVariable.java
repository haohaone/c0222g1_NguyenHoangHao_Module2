package _05_modifier_static.practice;

public class StaticVariable {
    public static void main(String[] args) {
        Car toyota3 = new Car("Toyota 3","skyactiv 3");
        System.out.println(Car.numberOfCar);
        Car toyota6 = new Car("Toyota 6","skyactiv 6");
        System.out.println(Car.numberOfCar);
    }
}
