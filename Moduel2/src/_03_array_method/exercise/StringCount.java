package _03_array_method.exercise;

import java.util.Scanner;

public class StringCount {
    public static void kiemTraKiTu(String Str){
        char [] Arr = new char[Str.length()];
        for (int i = 0; i < Str.length(); i++) {
            int count = 1;
            for (int j = i + 1; j < Str.length(); j++) {
                if (Str.charAt(i) == Str.charAt(j)){
                    count++;
                }
            }
            boolean flag = true;
            for (int j = 0; j < Arr.length; j++) {
                if (Str.charAt(i) == Arr[j]){
                    flag = false;
                    break;
                }else {
                    flag = true;
                }
            }
            if (flag){
                System.out.println("Ki tu "+Str.charAt(i)+" co "+count+" ki tu");
                Arr[i] = Str.charAt(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao 1 chuoi");
        String string = scanner.nextLine();
        kiemTraKiTu(string);
    }
}
