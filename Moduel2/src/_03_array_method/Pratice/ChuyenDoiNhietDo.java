package _03_array_method.Pratice;

import java.util.Scanner;

public class ChuyenDoiNhietDo {
    public static String doiCquaF (double doC){
        return "Do F: " + ((9 / 5) * doC + 32);
    }

    public static String doiFquaC (double doF){
        return "Do C: " + ((5.0 / 9 ) * (doF - 32));
    }

    public static void main(String[] args) {
        System.out.println("1: Doi do C Qua F");
        System.out.println("2: Doi do F Qua C");
        System.out.println("0: Thoat");
        Scanner scanner = new Scanner(System.in);
        while (true){
            int num = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhap nhiet do");
            double nhietDo = Double.parseDouble(scanner.nextLine());
            switch (num){
                case 1:
                    System.out.println(doiCquaF(nhietDo));
                    break;
                case 2:
                    System.out.println(doiFquaC(nhietDo));
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }
}
