package Snackautomat;

public class Item {

    private float price;
    private String nameOfTheProduct;
    private final int productnumber;    //These are the fix product numbers
    private int amout;

    public Item(float price, String nameOfTheProduct, int productnumber, int amout) {
        this.price = price;
        this.nameOfTheProduct = nameOfTheProduct;
        this.productnumber = productnumber;
        this.amout = amout;
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

    public int getProductnumber() {
        return productnumber;
    }

    public int getAmout() {
        return amout;
    }

    public void setAmout(int amout) {
        this.amout = amout;
    }
}
