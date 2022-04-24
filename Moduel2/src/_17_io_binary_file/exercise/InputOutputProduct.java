package _17_io_binary_file.exercise;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class InputOutputProduct {
    public static Scanner scanner = new Scanner(System.in);
    public static List<Product> productList =  new ArrayList<>();


    public static void writeFile(String path, List<Product> products){
        File file = new File(path);
        try(FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oop = new ObjectOutputStream(fos)) {
            oop.writeObject(products);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Product> readFile(String path){
        List<Product> products;
        File file = new File(path);
        try(FileInputStream fis = new FileInputStream(file);
        ObjectInputStream oos = new ObjectInputStream(fis)) {
            products = (List<Product>) oos.readObject();
            return products;
        } catch (FileNotFoundException e) {

        } catch (IOException e) {

        } catch (ClassNotFoundException e) {

        }
        return new LinkedList<>();
    }

    public static void add(){
        if (readFile("src\\_17_io_binary_file\\exercise\\products.txt") != null){
            productList = readFile("src\\_17_io_binary_file\\exercise\\products.txt");
        }

        System.out.println("Input id product");
        String id = scanner.nextLine();

        System.out.println("Input name product");
        String name = scanner.nextLine();

        System.out.println("Input productions");
        String productions = scanner.nextLine();

        System.out.println("Input status product");
        String status = scanner.nextLine();
        int price;
        while (true){
            System.out.println("Input price of product");
            try {
                price = Integer.parseInt(scanner.nextLine());
                break;
            }catch (NumberFormatException e){
                System.err.println("Input wrong format");
            }
        }
        productList.add(new Product(id, name, productions, status, price));
        writeFile("src\\_17_io_binary_file\\exercise\\products.txt", productList);
        System.out.println("Add successful");
    }

    public static void display(){
        List<Product> productList = readFile("src\\_17_io_binary_file\\exercise\\products.txt");
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    public static Product search(String name){
        List<Product> products = readFile("src\\_17_io_binary_file\\exercise\\products.txt");
        for (Product item : products) {
            if (item.getName().contains(name)){
                return item;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int choice = 0;
        String name;

        while (true){
            System.out.println("------------Menu------------");
            System.out.println("1. Add new Productions");
            System.out.println("2. display Production list");
            System.out.println("3. Search productions");
            System.out.println("4. Exit");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e){
                System.err.println("Your input is wrong format");
            }
            switch (choice){
                case 1:
                    add();
                    break;
                case 2:
                    display();
                    break;
                case 3:
                    display();
                    System.out.println("Input id product");
                    name = scanner.nextLine();
                    if (search(name) == null){
                        System.out.println("Your id is not in list");
                    }else {
                        System.out.println(search(name));
                    }
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}
