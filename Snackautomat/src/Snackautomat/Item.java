package Snackautomat;

public class Item {

    private float price;
    private String nameOfTheProduct;
    private final int productNumber;    //These are the fix product numbers
    private int amount;
    private boolean isDrink;

    public Item(float price, String nameOfTheProduct, int productNumber, int amount, boolean isDrink) {
        this.price = price;
        this.nameOfTheProduct = nameOfTheProduct;
        this.productNumber = productNumber;
        this.amount = amount;
        this.isDrink = isDrink;
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

    public int getProductNumber() {
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
