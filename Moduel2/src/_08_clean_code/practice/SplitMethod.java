package _08_clean_code.practice;

public class SplitMethod {
    public static double getArea(int radius){
        return radius * radius * Math.PI;
    }

    public static double getPerimeter(int radius){
        return 2 * radius * Math.PI;
    }

    public static double getVolume(int radius, int height){
        double baseArea = getArea(radius);
        double basePerimeter = getArea(height);
        double volume = basePerimeter * height + 2 * baseArea;
        return volume;
    }
}
