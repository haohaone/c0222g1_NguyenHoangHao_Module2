package test_cinema.service.implement;

import case_study.utils.ReadAndWrite;
import test_cinema.model.Interest;
import test_cinema.service.CinemaService;
import test_cinema.utils.StartTimeException;

import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CinemaServiceImplement implements CinemaService {
    public static String idRegex = "CI-[0-9]{4}";
    public static Scanner scanner = new Scanner(System.in);
    public static List<Interest> interestList = getInterestList();

    public static List<Interest> getInterestList() {
        List<Interest> interestList = new ArrayList<>();
        List<String[]> list = ReadAndWrite.read("src\\test\\data\\interest.csv");
        for (String[] item : list) {
            interestList.add(new Interest(
                    item[0],
                    item[1],
                    item[2],
                    Integer.parseInt(item[3])));
        }
        return interestList;
    }

    @Override
    public void addNew() {
        interestList = getInterestList();
        System.out.println("Input interest id");
        String id = "";
        boolean check;
        while (true){
            check = false;
            while (true){
                id = scanner.nextLine();
                if (id.matches(idRegex)){
                    break;
                }else {
                    System.out.println("Your id is wrong format, it should be CI-XXXX");
                }
            }

            for (Interest item : interestList) {
                if (id.equals(item.getId())){
                    check = true;
                    break;
                }
            }
            if (check){
                System.out.println("your input id is already in list");
            }else {
                break;
            }
        }


        System.out.println("Input film name");
        String name = scanner.nextLine();

        System.out.println("Input start time");
        String date;
        while (true){
            try {
                date = scanner.nextLine();
                dateTimeCheck(date);
                break;
            } catch (StartTimeException e) {
                System.err.println("Start time can't before today ");
            } catch (Exception e) {
                System.err.println("Your input is wrong format");
            }
        }

        System.out.println("Input amount ticket");
        int amount;
        while (true){
            try {
                amount = Integer.parseInt(scanner.nextLine());
                if (amount > 0){
                    break;
                }else{
                    System.err.println("amount ticket can't be negative");
                }
            }catch (NumberFormatException e){
                System.err.println("Your input is wrong format");
            }
        }

        String line = id + "," + date + "," + name + "," + amount;
        ReadAndWrite.write("src\\test\\data\\interest.csv", line);
        System.out.println("Add successful");
    }

    @Override
    public void display() {
        List<Interest> interestList = getInterestList();
        for (Interest item : interestList) {
            System.out.println(item.toString());
        }
    }

    @Override
    public void delete() {
        interestList = getInterestList();
        display();
        System.out.println("Input your id to want delete");
        String id;
        while (true){
            id = scanner.nextLine();
            if (id.matches(idRegex)){
                break;
            }else {
                System.out.println("Your id is wrong format, it should be CI-XXXX");
            }
        }

        boolean check = false;
        Interest interest = null;
        for (Interest item : interestList) {
            if (id.equals(item.getId())){
                check = true;
                interest = item;
                break;
            }
        }


        if (check){
            int choice;
            while (true){
                System.out.println("Are you sure to delete this interest");
                System.out.println("1. Yes");
                System.out.println("2. No");
                try{
                    System.out.println("Input your choice");
                    choice = Integer.parseInt(scanner.nextLine());
                    if (choice == 1 || choice == 2){
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Input is wrong format");
                }
            }


            switch (choice){
                case 1:
                    interestList.remove(interest);
                    File file = new File("src\\test\\data\\interest.csv");
                    file.delete();

                    for (Interest item : interestList) {
                        ReadAndWrite.write("src\\test\\data\\interest.csv", item.getLine());
                    }
                    System.out.println("Delete successful");
                    break;
                case 2:
                    System.out.println("Cancel successful");
                    break;
            }
        }else {
            System.out.println("Your input id is not in list");
        }

    }

    public static void dateTimeCheck(String dateOfBirth) throws Exception {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu").withResolverStyle(ResolverStyle.STRICT);
        LocalDate localDate1 = LocalDate.parse(dateOfBirth, formatter);
        LocalDate localDate2 = LocalDate.now();
        localDate2.format(formatter);

        if (localDate1.isBefore(localDate2)){
            throw new StartTimeException();
        }
    }
}
