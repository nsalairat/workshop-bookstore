package demo;

import java.util.List;

public class Basket {
    private int id;
    private List<Item> items;
    private int quantitiy;
    private Discount discount;
    private double netPrice;

    

    public int getId() {
        return id;
    }



    public void setId(int id) {
        this.id = id;
    }



    public List<Item> getItems() {
        return items;
    }



    public void setItems(List<Item> items) {
        this.items = items;
    }



    public int getQuantitiy() {
        return quantitiy;
    }



    public void setQuantitiy(int quantitiy) {
        this.quantitiy = quantitiy;
    }



    public Discount getDiscount() {
        return discount;
    }



    public void setDiscount(Discount discount) {
        this.discount = discount;
    }



    public double getNetPrice() {
        return netPrice;
    }



    public void setNetPrice(double netPrice) {
        this.netPrice = netPrice;
    }



    public void addBook(List<Book> books2) {

    }

    
}
