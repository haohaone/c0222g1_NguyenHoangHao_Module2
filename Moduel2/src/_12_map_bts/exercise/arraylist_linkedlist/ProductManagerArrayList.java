package _12_map_bts.exercise.arraylist_linkedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProductManagerArrayList {
    private ArrayList<Product> productsList = new ArrayList<>();
    public Scanner scanner = new Scanner(System.in);

    public void addProduct(Product product){
        productsList.add(product);
    }

    public void setProduct(int id){
        int count = 0;
        int index = 0;
        for (int i = 0; i < productsList.size(); i++) {
            if (productsList.get(i).getIdProduct() == id){
                index = i;
                count++;
                break;
            }
        }
        if (count == 0){
            System.out.println("This id product is not in list");
        }else {
            System.out.println("Input name product you want set");
            String name = scanner.nextLine();
            System.out.println("Input id product you want set");
            int newId = Integer.parseInt(scanner.nextLine());
            System.out.println("Input price product you want set");
            int price = Integer.parseInt(scanner.nextLine());
            productsList.set(index, new Product(name,newId,price));
            System.out.println("Set successful");
        }
    }

    public void deleteProduct(int id){
        int count = 0;
        int index = 0;
        for (int i = 0; i < productsList.size(); i++) {
            if (productsList.get(i).getIdProduct() == id){
                index = i;
                count++;
                break;
            }
        }
        if (count == 0){
            System.out.println("This id product is not in list");
        }else {
            productsList.remove(productsList.get(index));
            System.out.println("Delete successful");
        }
    }

    public void searchProduct(String name){
        int count = 0;
        int index = 0;
        for (int i = 0; i < productsList.size(); i++) {
            if (productsList.get(i).getNameProduct().contains(name)){
                index = i;
                count++;
                break;
            }
        }
        if (count == 0){
            System.out.println("This id product is not in list");
        }else {
            System.out.println(productsList.get(index));
        }
    }

    public ArrayList<Product> sortProductList(){
        Collections.sort(productsList);
        return productsList;
    }

    public void display(){
        for (Product product : productsList) {
            System.out.println(product);
        }
    }
}
