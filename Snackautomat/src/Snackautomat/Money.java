package Snackautomat;

public class Money {

    private float price;
    private String nameOfTheProduct;
    private String productnumber;
    private int amount;

    public Money(float price, String nameOfTheProduct, String productnumber, int amount) {
        this.price = price;
        this.nameOfTheProduct = nameOfTheProduct;
        this.productnumber = productnumber;
        this.amount = amount;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getNameOfTheProduct() {
        return nameOfTheProduct;
    }

    public void setNameOfTheProduct(String nameOfTheProduct) {
        this.nameOfTheProduct = nameOfTheProduct;
    }

    public String getProductnumber() {
        return productnumber;
    }

    public void setProductnumber(String productnumber) {
        this.productnumber = productnumber;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
