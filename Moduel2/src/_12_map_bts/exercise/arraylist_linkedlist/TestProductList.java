package _12_map_bts.exercise.arraylist_linkedlist;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class TestProductList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductManagerArrayList productManagerArrayList = new ProductManagerArrayList();
        int choice;
        while (true){
            int id, price;
            System.out.println("1. Add new product");
            System.out.println("2. Delete product");
            System.out.println("3. Set product");
            System.out.println("4. Search product");
            System.out.println("5. Compare list product");
            System.out.println("6. Display list product");
            System.out.println("0. Exit");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice){
                case 1:
                    System.out.println("Input name product");
                    String name = scanner.nextLine();
                    System.out.println("Input idProduct");
                    id = Integer.parseInt(scanner.nextLine());
                    System.out.println("Input Product Price");
                    price = Integer.parseInt(scanner.nextLine());
                    productManagerArrayList.addProduct(new Product(name,id,price));
                    System.out.println("Add successful");
                    break;
                case 2:
                    System.out.println("Input id of Product you want to delete");
                    id = Integer.parseInt(scanner.nextLine());
                    productManagerArrayList.deleteProduct(id);
                    break;
                case 3:
                    System.out.println("Input id of Product you want to delete");
                    id = Integer.parseInt(scanner.nextLine());
                    productManagerArrayList.setProduct(id);
                    break;
                case 4:
                    System.out.println("Input id of Product you want to search");
                    id = Integer.parseInt(scanner.nextLine());
                    productManagerArrayList.searchProduct(id);
                    break;
                case 5:
                    System.out.println("Compare products list in order price");
                    productManagerArrayList.sortProductList();
                    System.out.println("Compare successful");
                case 6:
                    productManagerArrayList.display();
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }
}
