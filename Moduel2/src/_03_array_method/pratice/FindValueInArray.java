package _03_array_method.pratice;

import java.util.Scanner;

public class FindValueInArray {
    public static String DanhSachHs (String [] array,String name){
        boolean flag = false;
        int viTri = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(name)){
                flag = true;
                viTri = i;
                break;
            }else {
                flag = false;
            }
        }
        if (flag){
            return "vị trí số " + (viTri + 1);
        }else {
            return "Không có tên trong danh sách";
        }
    }

    public static void main(String[] args) {
        String [] clasC0222g1 = {"hao","hoang","trung","phuc","duy","uyen"};
        System.out.println("Ten hoc sinh can tim");
        Scanner scanner = new Scanner(System.in);
        String tenHs = scanner.nextLine();
        System.out.println(DanhSachHs(clasC0222g1,tenHs));
    }
}
