package _12_map_bts.exercise.arraylist_linkedlist;

public class Product implements Comparable<Product> {
    private String nameProduct;
    private int idProduct, price;

    public Product(String nameProduct, int idProduct, int price) {
        this.nameProduct = nameProduct;
        this.idProduct = idProduct;
        this.price = price;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int compareTo(Product o) {
        return Integer.compare(getPrice(), o.getPrice());
    }

    @Override
    public String toString() {
        return "[" +
                "nameProduct='" + nameProduct + '\'' +
                ", idProduct=" + idProduct +
                ", price=" + price +
                ']';
    }
}
