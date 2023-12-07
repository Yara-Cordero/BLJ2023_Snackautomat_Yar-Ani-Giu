package Snackautomat;

public class Item {


    private double price;
    private String nameOfTheProduct;
    private int amount;
    private boolean isDrink;

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

