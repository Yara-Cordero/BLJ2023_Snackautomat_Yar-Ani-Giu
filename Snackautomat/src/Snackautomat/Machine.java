package Snackautomat;

import java.util.Scanner;

public class Machine {

    private float money;

    private String[][] vendigItems = new String[4][4];

    Item maltesers = new Item(3.50, "Maltesers", "A1", 10, false);
    Item mms = new Item(2.50, "M&M", "A2", 20,false);
    Item snickers = new Item(3.0, "Snickers", "A3", 15, false);
    Item twix = new Item(2.90, "Twix", "A4", 32, false);
    Item paprikaChips = new Item(4.20, "Paprika Chips", "B1", 43, false);
    Item haribo = new Item(4.80, "Haribo", "B2", 12, false);
    Item kaugummi = new Item(2.0, "Kaugummi", "B3", 51,false);
    Item oreos = new Item(3.75, "Oreos", "B4", 23,false);
    Item blueTakis = new Item(4.95, "Blue Takis", "C1", 17,false);
    Item balisto = new Item(2.30, "Balisto", "C2", 17,false);
    Item natureChips = new Item(4.20, "Nature Chips", "C3", 31,false);
    Item redTakis = new Item(4.95, "Red Takis","C4", 19,false);
    Item cola = new Item(3.80, "Cola", "D1", 45,true);
    Item wasserStill = new Item(1.75, "Wasser (Still)", "D2", 37, true);
    Item capriSun = new Item(1.50, "Capri Sun", "D3", 24, true);
    Item fanta = new Item(3.80, "Fanta", "D4",36,true);
    Item extra = new Item(5.0, "Lighter",11,false);
    Item extra2 = new Item(20.0,"Pregnancy test",15,false);
    Item extra3 = new Item(3.0,"Papes",22,false);
    Item extra4 = new Item(14.0,"Vape", 16,false);

    private void start() {
       boolean error = true;

       do{
           try{
               System.out.println("How much money do you have on you?");
               

           }catch (Exception e){
               System.out.println("Enter valid input");
           }

       }while(error);
    }

}
