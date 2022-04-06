package _05_modifier_static.exercis_of_mrchien.students;

import java.util.Scanner;

public class TestStudents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng học sinh");
        int studentsAmount = Integer.parseInt(scanner.nextLine());
        Students[] studentsList = new Students[studentsAmount];

        for (int i = 0; i < studentsList.length; i++) {
            System.out.println("Nhập thông cho học sinh thứ " + (i + 1));
            System.out.println("Tên");
            String name = scanner.nextLine();
            System.out.println("Tuổi");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.println("Địa chỉ");
            String address = scanner.nextLine();
            System.out.println("Điểm");
            double point = Double.parseDouble(scanner.nextLine());
            System.out.println("Học sinh thứ " + (i + 1) + " đã tạo thành công");
            System.out.println();
            studentsList[i] = new Students(name, age, address, point);
        }

        for (Students item : studentsList) {
            System.out.println(item.toString());
        }

        System.out.println("Học sinh muốn xóa khỏi danh sách");
        int position = Integer.parseInt(scanner.nextLine());
        System.out.println("Học sinh số " + position + " đã xóa thành công");

        for (int i = position - 1; i < studentsList.length; i++) {
            if (i == studentsList.length - 1){
                studentsList[i] = null;
            }
            studentsList[i] = studentsList[i + 1];
        }

        for (Students students : studentsList) {
            if (students == null) {
                continue;
            }
            System.out.println(students.toString());
        }
    }
}
