package _07_abstract_class_interface.exercise.exercise_of_mrchien;

import java.util.Objects;
import java.util.Scanner;

public class DisplayPersonList {
    public static Scanner scanner = new Scanner(System.in);
    public static Person[] personInSchoolList = new Person[15];


    public static void addNewStudent(){
        System.out.println("Input student name");
        String name = scanner.nextLine();
        System.out.println("Input student age");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Input student gender");
        String gender = scanner.nextLine();
        boolean flag = gender.equals("Nam");
        System.out.println("Input student point");
        double point = Double.parseDouble(scanner.nextLine());
        personInSchoolList[Person.getAmount()] = new Students(name, age, flag, point);
        System.out.println("Add new person successful");
    }

    public static void displayStudentsList(){
        for (Person students : personInSchoolList) {
            if (students instanceof Students){
                students.display();
            }
        }
    }

    public static void deleteStudent(){
        System.out.println("Input name student need to delete");
        String name = scanner.nextLine();
        boolean flag = false;
        for (int i = 0; i < personInSchoolList.length; i++) {
            if (name.equals(personInSchoolList[i].getName()) && personInSchoolList[i] instanceof Students){
                flag = true;
                for (int j = i; j < personInSchoolList.length; j++) {
                    if (j == Person.getAmount()){
                        personInSchoolList[j] = null;
                        break;
                    }
                    personInSchoolList[j] = personInSchoolList[j + 1];
                }
                System.out.println("Delete successful");
                break;
            }
        }
        if (!flag){
            System.out.println("Name is not in person list");
        }
    }

    public static void addNewTeacher(){
        System.out.println("Input teacher name");
        String name = scanner.nextLine();
        System.out.println("Input teacher age");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Input teacher gender");
        String gender = scanner.nextLine();
        boolean flag = gender.equals("Nam");
        System.out.println("Input teacher salary");
        float salary = Float.parseFloat(scanner.nextLine());
        personInSchoolList[Person.getAmount()] = new Teacher(name, age, flag, salary);
        System.out.println("Add new person successful");
    }

    public static void displayTeachersList(){
        for (Person teacher : personInSchoolList) {
            if (teacher instanceof Teacher){
                teacher.display();
            }
        }
    }

    public static void deleteTeacher(){
        System.out.println("Input name teacher need to delete");
        String name = scanner.nextLine();
        boolean flag = false;
        for (int i = 0; i < personInSchoolList.length; i++) {
            if (name.equals(personInSchoolList[i].getName()) && personInSchoolList[i] instanceof Teacher){
                flag = true;
                for (int j = i; j < personInSchoolList.length; j++) {
                    if (j == Person.getAmount()){
                        personInSchoolList[j] = null;
                        break;
                    }
                    personInSchoolList[j] = personInSchoolList[j + 1];
                }
                System.out.println("Delete successful");
                break;
            }
        }
        if (!flag){
            System.out.println("Name is not in person list");
        }
        Person.setAmount(Person.getAmount() - 1);
    }


    public static void main(String[] args) {
        int choice;
        while (true){
            System.out.println("--------Menu--------");
            System.out.println("1. Add new students");
            System.out.println("2. Display students");
            System.out.println("3. Delete students");
            System.out.println("4. Add new teacher");
            System.out.println("5. Display teacher");
            System.out.println("6. Delete teacher");
            System.out.println("7. Exit");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                        addNewStudent();
                        break;
                case 2:
                        displayStudentsList();
                        break;
                case 3:
                        deleteStudent();
                        break;
                case 4:
                        addNewTeacher();
                        break;
                case 5:
                        displayTeachersList();
                        break;
                case 6:
                        deleteTeacher();
                        break;
                case 7:
                        System.exit(7);
            }
        }
    }
}
