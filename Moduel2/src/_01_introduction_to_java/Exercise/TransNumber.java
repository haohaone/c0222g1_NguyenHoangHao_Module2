package _01_introduction_to_java.exercise;

import java.util.Scanner;

public class TransNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so");
        int hangTram = Integer.parseInt(scanner.nextLine());
        int hangChuc;
        int soHangTram;
        int soHangDonVi;
        int soHangChuc;

        if (hangTram < 10) {
            soHangDonVi = hangTram;
            hangChuc = 0;
            soHangTram = 0;
            soHangChuc = 0;
        } else if (hangTram < 100) {
            hangChuc = hangTram;
            soHangTram = 0;
            soHangDonVi = hangChuc % 10;
            soHangChuc = (hangChuc - soHangDonVi) / 10;
        } else {
            hangChuc = hangTram % 100;
            soHangTram = (hangTram - hangChuc) / 100;
            soHangDonVi = hangChuc % 10;
            soHangChuc = (hangChuc - soHangDonVi) / 10;
        }
        String chuCaiHangTram = "";
        String chuCaiHangChuc = "";
        String chuCaiHangDonVi = "";

        switch (soHangTram) {
            case 1:
                chuCaiHangTram += "One Hundred";
                break;
            case 2:
                chuCaiHangTram += "Two Hundred";
                break;
            case 3:
                chuCaiHangTram += "Three Hundred";
                break;
            case 4:
                chuCaiHangTram += "Four Hundred";
                break;
            case 5:
                chuCaiHangTram += "Five Hundred";
                break;
            case 6:
                chuCaiHangTram += "Six Hundred";
                break;
            case 7:
                chuCaiHangTram += "Seven Hundred";
                break;
            case 8:
                chuCaiHangTram += "Eight Hundred";
                break;
            case 9:
                chuCaiHangTram += "Nine Hundred";
        }

        switch (soHangDonVi) {
            case 1:
                chuCaiHangDonVi += "One";
                break;
            case 2:
                chuCaiHangDonVi += "Two";
                break;
            case 3:
                chuCaiHangDonVi += "Three";
                break;
            case 4:
                chuCaiHangDonVi += "Four";
                break;
            case 5:
                chuCaiHangDonVi += "Five";
                break;
            case 6:
                chuCaiHangDonVi += "Six";
                break;
            case 7:
                chuCaiHangDonVi += "Seven";
                break;
            case 8:
                chuCaiHangDonVi += "Eight";
                break;
            case 9:
                chuCaiHangDonVi += "Nine";
        }
        if (hangChuc >= 20) {
            switch (soHangChuc) {
                case 2:
                    chuCaiHangChuc += "Twenty";
                    break;
                case 3:
                    chuCaiHangChuc += "Thirty";
                    break;
                case 4:
                    chuCaiHangChuc += "Forty";
                    break;
                case 5:
                    chuCaiHangChuc += "Fifty";
                    break;
                case 6:
                    chuCaiHangChuc += "Sixty";
                    break;
                case 7:
                    chuCaiHangChuc += "Seventy";
                    break;
                case 8:
                    chuCaiHangChuc += "Eighty";
                    break;
                case 9:
                    chuCaiHangChuc += "Ninety";
            }
        } else {
            switch (hangChuc) {
                case 10:
                    chuCaiHangChuc += "Ten";
                    break;
                case 11:
                    chuCaiHangChuc += "Eleven";
                    break;
                case 12:
                    chuCaiHangChuc += "Twenteen";
                    break;
                case 13:
                    chuCaiHangChuc += "Thirteen";
                    break;
                case 14:
                    chuCaiHangChuc += "Forteen";
                    break;
                case 15:
                    chuCaiHangChuc += "Fifteen";
                    break;
                case 16:
                    chuCaiHangChuc += "Sixteen";
                    break;
                case 17:
                    chuCaiHangChuc += "Seventeen";
                    break;
                case 18:
                    chuCaiHangChuc += "Eighteen";
                    break;
                case 19:
                    chuCaiHangChuc += "Nineteen";
            }
        }
        if (hangChuc>=20){
            System.out.println(chuCaiHangTram+" "+chuCaiHangChuc+" "+chuCaiHangDonVi);
        }else if (hangChuc<10){
            System.out.println(chuCaiHangTram+" "+chuCaiHangDonVi);
        }else {
            System.out.println(chuCaiHangTram+" "+chuCaiHangChuc);
        }
    }
}
