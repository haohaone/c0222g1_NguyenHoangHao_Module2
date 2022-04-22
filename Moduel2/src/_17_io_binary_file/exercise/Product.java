package _17_io_binary_file.exercise;

import java.io.Serializable;

public class Product implements Serializable {
    private String id, name, productions, another;
    private int price;

    public Product(String id, String name, String productions, String another, int price) {
        this.id = id;
        this.name = name;
        this.productions = productions;
        this.another = another;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductions() {
        return productions;
    }

    public void setProductions(String productions) {
        this.productions = productions;
    }

    public String getAnother() {
        return another;
    }

    public void setAnother(String another) {
        this.another = another;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", productions='" + productions + '\'' +
                ", another='" + another + '\'' +
                ", price=" + price +
                '}';
    }
}
