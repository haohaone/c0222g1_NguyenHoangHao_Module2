package test_codegym.controller;

import test_codegym.service.implement.SubjectServiceImp;

import java.util.Scanner;

public class DisplayMenu {
    public static void main(String[] args) {
        SubjectServiceImp subjectServiceImp = new SubjectServiceImp();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (true){
            System.out.println("----Menu Subject Codegym----");
            System.out.println("1. Display subject codegym list");
            System.out.println("2. Edit subject");
            System.out.println("3. Delete subject by id");
            System.out.println("4. Add new subject");
            System.out.println("5 Exit");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Input wrong format");;
            }
            switch (choice){
                case 1:
                    subjectServiceImp.display();
                    break;
                case 2:
                    subjectServiceImp.edit();
                    break;
                case 3:
                    subjectServiceImp.deleteById();
                    break;
                case 4:
                    subjectServiceImp.addNew();
                    break;
                case 5:
                    System.exit(5);

            }
        }
    }
}
