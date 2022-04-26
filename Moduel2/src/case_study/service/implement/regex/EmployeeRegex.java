package case_study.service.implement.regex;

import case_study.utils.DateTimeException;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;
import java.util.Scanner;

public class EmployeeRegex {
    public static Scanner scanner = new Scanner(System.in);

    public static void dateTimeCheck(String dateOfBirth) throws Exception {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu").withResolverStyle(ResolverStyle.STRICT);
        LocalDate localDate1 = LocalDate.parse(dateOfBirth, formatter);
        LocalDate localDate2 = LocalDate.now();
        localDate2.format(formatter);

        int year = Period.between(localDate1, localDate2).getYears();
        if (year < 18 || year > 100){
            throw new DateTimeException();
        }
    }

    public static String dateOfBirth(){
        String dateOfBirth;
        while (true){
            try {
                dateOfBirth = scanner.nextLine();
                dateTimeCheck(dateOfBirth);
                break;
            } catch (DateTimeException e) {
                System.err.println("This age of customer can't booking");
            }catch (Exception ignored){
                System.err.println("Input wrong format");
            }
        }
        return dateOfBirth;
    }

    public static String level(){
        String level = "";
        boolean checkLevel = true;
        while (checkLevel){
            int choice = 0;
            System.out.println("--------Menu--------");
            System.out.println("1. Secondary Graduation");
            System.out.println("2. College Graduation");
            System.out.println("3. Graduate");
            System.out.println("4. Post-Graduate");
            System.out.println("Input your choice");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Input wrong format");;
            }
            switch (choice){
                case 1:
                    level = "Secondary Graduation";
                    checkLevel = false;
                    break;
                case 2:
                    level = "College Graduation";
                    checkLevel = false;
                    break;
                case 3:
                    level = "Graduate";
                    checkLevel = false;
                    break;
                case 4:
                    level = "Post-Graduate";
                    checkLevel = false;
                    break;
                default:
                    checkLevel = true;
            }
        }
        return level;
    }

    public static String position(){
        String position = "";
        boolean checkPosition = true;
        int choice = 0;
        while (checkPosition){
            System.out.println("--------Menu--------");
            System.out.println("1. Receptionist");
            System.out.println("2. Servants");
            System.out.println("3. Supervisor");
            System.out.println("4. Manager");
            System.out.println("5. Director");
            System.out.println("Input your choice");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Input wrong format");;
            }
            switch (choice){
                case 1:
                    position = "Receptionist";
                    checkPosition = false;
                    break;
                case 2:
                    position = "Servants";
                    checkPosition = false;
                    break;
                case 3:
                    position = "Supervisor";
                    checkPosition = false;
                    break;
                case 4:
                    position = "Manager";
                    checkPosition = false;
                    break;
                case 5:
                    position = "Director";
                    checkPosition = false;
                    break;
                default:
                    checkPosition = true;
            }
        }
        return position;
    }

    public static int salary(){
        int salary;
        while (true){
            try {
                salary = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.err.println("Input wrong format");;
            }
        }
        return salary;
    }
}
