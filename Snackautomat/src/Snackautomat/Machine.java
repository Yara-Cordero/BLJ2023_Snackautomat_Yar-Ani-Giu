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
    Item haribo = new Item(5.25, "Haribo", "B2", 12, false);
    Item kaugummi = new Item(2.0, "Kaugummi", "B3", 51,false);
    Item oreos = new Item(3.75, "Oreos", "B4", 23,false);
    Item blueTakis = new Item(4.95, "Blue Takis", "C1", 17,false);
    Item balisto = new Item()
    Item cola = new Item(3.80, "Cola", "D1", 45,true);
    Item wasserStill = new Item(1.75, "Wasser (Still)", "D2", 37, true);
    Item capriSun = new Item(1.50, "Capri Sun", "D3", 24, true);
    Item extra = new Item();
    Item extra1 = new Item();
    Item extra2 =

    private void start() {
       boolean error = true;

       do{
           try{
               System.out.println("How much money do you have on you?");
               money

           }catch (Exception e){
               System.out.println("Enter valid input");
           }

       }while(error);
    }

}
