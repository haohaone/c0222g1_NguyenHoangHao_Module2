package _03_array_method.Exercise;

import java.util.Scanner;

public class Demkytuchuoi {
    public static void kiemTraKiTu(String str){
        char [] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)){
                    count++;
                }
            }
            boolean flag = true;
            for (int j = 0; j < arr.length; j++) {
                if (str.charAt(i) == arr[j]){
                    flag = false;
                    break;
                }else {
                    flag = true;
                }
            }
            if (flag){
                System.out.println("Ki tu "+str.charAt(i)+" co "+count+" ki tu");
                arr[i] = str.charAt(i);
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
