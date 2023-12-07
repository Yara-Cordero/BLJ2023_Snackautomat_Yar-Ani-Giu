package Snackautomat;

public class Item {

    private double price;
    private String nameOfTheProduct;
    private String productNumber;    //These are the fix product numbers
    private int amount;
    private boolean isDrink;

    public Item(double price, String nameOfTheProduct, String productNumber, int amount, boolean isDrink) {
        this.price = price;
        this.nameOfTheProduct = nameOfTheProduct;
        this.productNumber = productNumber;
        this.amount = amount;
        this.isDrink = isDrink;
    }

    public Item(String productNumber) {
        this.productNumber = productNumber;
    }

    public Item(double price, String nameOfTheProduct, int amount, boolean isDrink) {
        this.price = price;
        this.nameOfTheProduct = nameOfTheProduct;
        this.amount = amount;
        this.isDrink = isDrink;
    }



    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getNameOfTheProduct() {
        return nameOfTheProduct;
    }

    public void setNameOfTheProduct(String nameOfTheProduct) {
        this.nameOfTheProduct = nameOfTheProduct;
    }

    public String getProductNumber() {
        return productNumber;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public boolean isDrink() {
        return isDrink;
    }

    public void setDrink(boolean drink) {
        isDrink = drink;
    }


}

