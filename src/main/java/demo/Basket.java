package demo;

public class Basket {
    private int id;
    private Book book;
    private int quantitiy;
    private Discount discount;
    private double netPrice;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Book getBook() {
        return book;
    }
    public void setBook(Book book) {
        this.book = book;
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
    
}
