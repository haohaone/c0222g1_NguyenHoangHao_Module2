package test_book.service.implement;

import case_study.utils.ReadAndWrite;
import test_book.model.Book;
import test_book.service.BookService;
import test_book.utils.ReadAndWriteTest2;
import java.io.File;
import java.io.Serializable;
import java.util.*;

public class BookingServiceImp implements BookService, Serializable {
    public static LinkedHashMap<Book, Integer> bookList = getBooks();
    public static String regexId = "[0-9]{5}";
    public static Scanner scanner = new Scanner(System.in);

    public static LinkedHashMap<Book, Integer> getBooks(){
        LinkedHashMap<Book, Integer> booksList = new LinkedHashMap<>();
        List<String[]> list = ReadAndWrite.read("src\\test2\\data\\book.csv");
        for (String[] item : list) {
            booksList.put(new Book(item[0], item[1]), Integer.parseInt(item[2]));
        }
        return booksList;
    }

    @Override
    public void addNew() {
        bookList = getBooks();
        System.out.println("Input book id");
        String id;
        while (true){
            id = scanner.nextLine();
            if (id.matches(regexId)){
                break;
            }else {
                System.err.println("Input id is wrong format");
            }
        }

        System.out.println("Input book name");
        String name = scanner.nextLine();

        System.out.println("Input amount of book");
        int amount;
        while (true){
            try {
                amount = Integer.parseInt(scanner.nextLine());
                break;
            }catch (NumberFormatException e){
                System.err.println("Your input is wrong format");
            }
        }
        Book book = new Book(id,name);

        ReadAndWriteTest2.write("src\\test2\\data\\book.csv",book.getLine()+","+amount);
        System.out.println("add new successful");
    }

    @Override
    public void borrow() {
        bookList = getBooks();
        display();
        System.out.println("Input id booking you want to borrow");
        String id;
        while (true){
            id = scanner.nextLine();
            if (id.matches(regexId)){
                break;
            }else {
                System.err.println("Input id is wrong format");
            }
        }

        boolean check = false;
        for (Map.Entry<Book, Integer> element : bookList.entrySet()) {
            if (element.getKey().getId().equals(id)){
                if (element.getValue() == 0){
                    System.out.println("This book has all borrowed");
                }else {
                    element.setValue(element.getValue() - 1);
                    System.out.println("Borrow successful");
                }
                check = true;
                break;
            }
        }

        if (!check){
            System.out.println("Your input id book is not in list");
        }else {
            File file = new File("src\\test2\\data\\book.csv");
            file.delete();
            for (Map.Entry<Book, Integer> element : bookList.entrySet()) {
                ReadAndWriteTest2.write("src\\test2\\data\\book.csv",element.getKey().getLine()+","+element.getValue());
            }
        }
    }

    @Override
    public void giveBack() {
        bookList = getBooks();
        display();
        System.out.println("Input id booking you want to borrow");
        String id;
        while (true){
            id = scanner.nextLine();
            if (id.matches(regexId)){
                break;
            }else {
                System.err.println("Input id is wrong format");
            }
        }

        boolean check = false;
        for (Map.Entry<Book, Integer> element : bookList.entrySet()) {
            if (element.getKey().getId().equals(id)){
                element.setValue(element.getValue() + 1);
                System.out.println("Give back successful");
                check = true;
                break;
            }
        }

        if (!check){
            System.out.println("Your input id book is not in list");
        }else {
            File file = new File("src\\test2\\data\\book.csv");
            file.delete();
            for (Map.Entry<Book, Integer> element : bookList.entrySet()) {
                ReadAndWriteTest2.write("src\\test2\\data\\book.csv",element.getKey().getLine()+","+element.getValue());
            }
        }
    }

    @Override
    public void display() {
        bookList = getBooks();
        try {
            for (Map.Entry<Book, Integer> element : bookList.entrySet()) {
                System.out.println("[id = " + element.getKey().getId() + ", amount = " + element.getValue() + "]");
            }
        }catch (Exception e){
            System.out.println("Facility list is 0");
        }
    }
}
