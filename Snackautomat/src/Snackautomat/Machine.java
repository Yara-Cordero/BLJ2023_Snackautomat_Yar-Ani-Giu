package Snackautomat;

public class Machine {

    private float money;

    private String[][] vendigItems = new String[3][4];

    Item maltesers = new Item(3.50, "Maltesers", "A1", 10, false);
    Item mms = new Item(2.50, "M&M", "A2", 20,false);
    Item snickers = new Item(3.0, "Snickers", "A3", 15, false);
    Item twix = new Item(2.90, "Twix", "B1", 32, false);
    Item paprikaChips = new Item(4.20, "Paprika Chips", "B2", 43, false);

}
