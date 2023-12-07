package Snackautomat;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Machine {

    private double money;
    private final String secretKey = "secret key";
    public final static void clearConsole()
    {
        try
        {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows"))
            {
                Runtime.getRuntime().exec("cls");
            }
            else
            {
                Runtime.getRuntime().exec("clear");
            }
        }
        catch (final Exception e)
        {
            //  Handle any exceptions.
        }
    }
    private String[][] vendigItems = new String[4][4];

    Item maltesers = new Item(3.50, "Maltesers", "A1", 10, false);
    Item mms = new Item(2.50, "M&M", "A2", 20,false);
    Item snickers = new Item(3.0, "Snickers", "A3", 15, false);
    Item twix = new Item(2.90, "Twix", "A4", 32, false);
    Item paprikaChips = new Item(4.20, "P. Chips", "B1", 43, false);
    Item haribo = new Item(4.80, "Haribo", "B2", 12, false);
    Item kaugummi = new Item(2.0, "Kaugummi", "B3", 51,false);
    Item oreos = new Item(3.75, "Oreos", "B4", 23,false);
    Item blueTakis = new Item(4.95, "Blue Takis", "C1", 17,false);
    Item balisto = new Item(2.30, "Balisto", "C2", 17,false);
    Item natureChips = new Item(4.20, "N. Chips", "C3", 31,false);
    Item redTakis = new Item(4.95, "Red Takis","C4", 19,false);
    Item cola = new Item(3.80, "Cola", "D1", 45,true);
    Item wasserStill = new Item(1.75, "Wasser (Still)", "D2", 37, true);
    Item capriSun = new Item(1.50, "Capri Sun", "D3", 24, true);
    Item fanta = new Item(3.80, "Fanta", "D4",36,true);
    Item extra = new Item(5.0, "Lighter",11,false);
    Item extra2 = new Item(20.0,"Pregnancy test",15,false);
    Item extra3 = new Item(3.0,"Papes",22,false);
    Item extra4 = new Item(14.0,"Vape", 16,false);


    public Machine() {
    }

    public Machine(double money) {
        this.money = money;
    }

    private static final String red = "\u001B[31m";
    private static final String yellow = "\u001B[33m";
    private static final String green ="\u001B[32m";
    private static final String reset = "\u001B[0m";


    Scanner scan = new Scanner(System.in);

    void start() {
       char decisionRepeat = 'y';
       boolean error = true;
       printMachine();

       do{
           try{
               System.out.println("How much money do you have on you?");
               money = scan.nextDouble(); //work
               scan.nextLine();
               error = false;

           }catch (Exception e){
               System.out.println("Enter valid input");
           }

       }while(error);

       setMoney(money);

       do {
           printMachine();

           String inputItemPos = scan.nextLine().toLowerCase();  //have to enter twice
           scan.nextLine();
           error = true;
           if (secretKey.equals(inputItemPos)) {
                secretKeyFunction();
           }else {
               switch (inputItemPos){
                   case "a1":{
                       purchaseItem(maltesers, getMoney());
                       break;
                   }case "a2":{
                       purchaseItem(mms, getMoney());
                       break;
                   }case "a3":{
                       purchaseItem(snickers, getMoney());
                       break;
                   }case "a4":{
                       purchaseItem(twix, getMoney());
                       break;
                   }case "b1":{
                       purchaseItem(paprikaChips, getMoney());
                       break;
                   }case "b2":{
                       purchaseItem(haribo, getMoney());
                       break;
                   }case "b3":{
                       purchaseItem(kaugummi, getMoney());
                       break;
                   }case "b4":{
                       purchaseItem(oreos, getMoney());
                       break;
                   }case "c1":{
                       purchaseItem(blueTakis, getMoney());
                       break;
                   }case "c2":{
                       purchaseItem(balisto, getMoney());
                       break;
                   }case "c3":{
                       purchaseItem(natureChips, getMoney());
                       break;
                   }case "c4":{
                       purchaseItem(redTakis, getMoney());
                       break;
                   }case "d1":{
                       purchaseItem(cola, getMoney());
                       break;
                   }case "d2":{
                       purchaseItem(wasserStill, getMoney());
                       break;
                   }case "d3":{
                       purchaseItem(capriSun, getMoney());
                       break;
                   }case "d4":{
                       purchaseItem(fanta, getMoney());
                       break;
                   } default:{
                       System.out.println("Enter a valid Input");
                   }

               }

           }

           error = true;
           do {
               System.out.println("Do you want to buy more things? (Y/N)");
               decisionRepeat = scan.next().charAt(0);
               if (decisionRepeat == 'y' ||decisionRepeat == 'Y' ||decisionRepeat == 'n' || decisionRepeat == 'N') {
                   error = false;
               }
           }while (error);

           if(decisionRepeat == 'n' || decisionRepeat == 'N') {
               System.out.println("Thank you for using this ultimate awesome vending machine!!");
               System.out.println("SEE YOU NEXT TIME :) ");
               System.out.println("- Yara, Anik & Giulia ");
               System.exit(0);
           }

       }while (decisionRepeat == 'y' || decisionRepeat == 'Y');

    }

    private void purchaseItem(Item item, double money){
        this.money = money;
        String inputChoice;
        boolean error = true;

        System.out.println("You selected " + item.getNameOfTheProduct() + "\n\n");
        printMachineWithPrice(item);

        do {
            System.out.println("What do you want to do?");
            System.out.println("1. Buy\n2. Cancel");
            inputChoice = scan.nextLine().toLowerCase();
            scan.nextLine();
            if (inputChoice.equals("1") || inputChoice.equals("1.") || inputChoice.equals("buy")) {
                error = false;

                if (item.getPrice() > money) {
                    System.out.println("You don't have enough money to buy this item!");
                } else {
                    item.setAmount(item.getAmount() - 1);
                    setMoney((getMoney() - item.getPrice()));
                    printMachine();
                    System.out.println(item.getNameOfTheProduct() + " WAS PURCHASED!!");
                }
            } else if (inputChoice.equals("2") || inputChoice.equals("2.") || inputChoice.equals("cancel")) {
                error = false;
                break;
            }else {
                System.out.println("Enter a valid Input");
            }
        }while (error);
    }

    public void secretKeyFunction() {
        Scanner scanner = new Scanner(System.in);
        boolean error = true;
        boolean repeat = true;


        do {
            do {
                System.out.println("You got the " + yellow + "SECRET KEY!!" + reset);
                System.out.println("What do you want to do?");
                System.out.println("1. Restock item\n2. Change Price\n3. Replace item\n4. Cancel");

                String inputSecretKeyChoice = scanner.nextLine().toLowerCase();

                if (inputSecretKeyChoice.equals("1") || inputSecretKeyChoice.equals("1.") || inputSecretKeyChoice.equals("restock item")) {
                    error = false;
                    //  restockItem();
                } else if (inputSecretKeyChoice.equals("2") || inputSecretKeyChoice.equals("2.") || inputSecretKeyChoice.equals("change price")) {
                    error = false;
                    changePrice();
                } else if (inputSecretKeyChoice.equals("3") || inputSecretKeyChoice.equals("3.") || inputSecretKeyChoice.equals("replace item")) {
                    error = false;
                    //replaceItem();
                } else if (inputSecretKeyChoice.equals("4") || inputSecretKeyChoice.equals("4.") || inputSecretKeyChoice.equals("cancel")) {
                    error = false;
                } else {
                    System.out.println("Invalid Input");
                }
            } while (error);

            System.out.println("Do you want to make more changes? (Y/N)");
            char inputRepeat = scanner.next().charAt(0);

            if(inputRepeat == 'n' || inputRepeat == 'N'){
                repeat = false;
            }
        }while(repeat);

    }

    private void changePrice() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> vendigItems = new ArrayList<>();

        System.out.println("Enter the name of the item you want to change the price of:");
        String itemNameOfTheProduct = scanner.nextLine();
        System.out.println("Enter the new price");
        double newPrice = scanner.nextDouble();
        scanner.nextLine();    //consume new line left-over

        boolean found = false;
        for (Item item : vendigItems) {
            if (item.getNameOfTheProduct().toLowerCase().equals(itemNameOfTheProduct)) {
                item.setPrice(newPrice);
                found = true;
                System.out.println("The price of " + item.getNameOfTheProduct() + " has been updated to " + newPrice);
                break;
            }
        }
        if (!found) {
            System.out.println("Item not found in the vending machine.");
        }
    }

    public void replaceItem() {
        Scanner in = new Scanner(System.in);
        System.out.println("Which item do you want to replace?");
        String itemPos = in.nextLine();



    }





    void printMachine() {
        clearConsole();
        String formattedMoney = String.format("%.2f", money);
        System.out.println(
                        "\n                                                        ░██████████████████████████████████████████████████████████████░                                                        \n" +
                        "                                                        ░██████████████████████████████████████████████████████████████░                                                        \n" +
                        "                 ###################                    ░██████████████████████████████████████████████████████████████░                                                        \n" +
                        "                 ##               ##                    ░█████▓░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒███████████████░                                                        \n" +
                        "                 ##    $ " + formattedMoney +"     ##                    ░█████▒                                        ░████▓▒█████████░                                                        \n" +
                        "                 ##               ##                    ░█████▒    " +red + "▒▓▓▓   "+yellow+  "  ▓▓▓  "+red+   "    ░▓▓▓▓  "+yellow+   "   ▓▓▓▓" + reset +"    ░███████████████░                                                        \n" +
                        "                 ###################                    ░█████▒   "+red+ " ▓▓▓▓▒    "+yellow+ "███▓  "+red+   "   ▒████ "+yellow+   "   ░████░ "+reset+  "  ░███████████████░                                                        \n" +
                        "                                                        ░█████▒   "+red+ " █▓██▓ "+yellow+   "  ▓███▓ "+red+   "    ▒████ "+yellow+   "   ░████░ "+reset+  "  ░████▓▓█████████░                                                        \n" +
                        "                                                        ░█████▓▒▒▒▒ A1 ▒▒▒▒▒ A2 ▒▒▒▒▒ A3 ▒▒▒▒▒▒ A4 ▒▒▒▒▒██           ▓█░                                                        \n" +
                        "                                                        ░█████▒                                        ░██  Enter    ▓█░                                                        \n" +
                        "                                                        ░█████▒   "+green+  "  ░░░  "+yellow+    "    ░░░  "+green+    "    ░░░  "+yellow+    "    ░░░  "+reset+   "   ░██  Code     ▓█░                                                        \n" +
                        "                                                        ░█████▒   "+green+ " ████▓  "+yellow+  "  ▓███▓ "+green+   "   ▒████ "+yellow+   "   ░████░ "+reset+  "  ░██           ▓█░                                                        \n" +
                        "                                                        ░█████▒   "+green+ " ████▓ "+yellow+  "   ▒███▓ "+green+   "   ▒████ "+yellow+   "   ░████░ "+reset+  "  ░████▓▒█████████░                                                        \n" +
                        "                                                        ░█████▓▒▒▒▒ B1 ▒▒▒▒▒ B2 ▒▒▒▒▒ B3 ▒▒▒▒▒▒ B4 ▒▒▒▒▒████▓▒█████████░                                                        \n" +
                        "                                                        ░█████▒                                        ░███▓1▒▓2▓▒3▓███░                                                        \n" +
                        "                                                        ░█████▒    ▓███▓    ▒███▓    ░████    ░████░   ░███▓4▒▓5▓▒6▓███░                                                        \n" +
                        "                                                        ░█████▒    ████▓    ▒███▓    ▒████    ░████░   ░███▓7▒▓8▓▒9████░                                                        \n" +
                        "                                                        ░█████▒    ████▓    ▒███▓    ▒████    ░████░   ░██████▒#▒██████░                                                        \n" +
                        "                                                        ░█████▒▒▒▒▒ C1 ▒▒▒▒▒ C2 ▒▒▒▒▒▒ C3 ▒▒▒▒▒ C4 ▒▒▒▒░███████████████░                                                        \n" +
                        "                                                        ░█████▒     ▒▒▒      ▒▒▒      ▒▒▒      ▒▒▒▒    ░███████████████░                                                        \n" +
                        "                                                        ░█████▒    ████▓    ▓███▓    ▒████    ░████░   ░███▒▒▓▒████████░                                                        \n" +
                        "                                                        ░█████▒    ████▓    ▓███▓    ▒████    ░████░   ░████▓▒█████████░                                                        \n" +
                        "                                                        ░█████▒▒▒▒▒ D1 ▒▒▒▒▒ D2 ▒▒▒▒▒▒ D3 ▒▒▒▒▒ D4 ▒▒▒▒░███████████████░                                                        \n" +
                        "                                                        ░██████████████████████████████████████████████████████████████░                                                        \n" +
                        "                                                        ░██████████████████████████████████████████████████████████████░                                                        \n" +
                        "                                                        ░█████▒░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▒▒▒▒▒▒▒▒▒░███████████████░                                                        \n" +
                        "                                                        ░█████▒░██████████████████████████████████████▓░███████████████░                                                        \n" +
                        "                                                        ░██████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓███████████████░                                                        \n" +
                        "                                                        ░██████████████████████████████████████████████████████████████░                                                        \n" +
                        "                                                        ░██████████████████████████████████████████████████████████████░                                                        \n" +
                        "                                                         ░░█▒░  ░ ░█▒                                     ▒█░ ░   ▒█░░                                                         \n" +
                        "                                                           ▓█▓▓▓▓▓▓█▒                                      ▒█▓▓▓▓▓▓█▓                                                           ");


    }

    void printMachineWithPrice(Item item) {
        clearConsole();
        String formattedMoney = String.format("%.2f", money);
        String itemPrice = String.format("%.2f", item.getPrice());
        String itemName = item.getNameOfTheProduct();

        int maxNameLength = 10;
        //if maltesers this not work
        //this works with short names
        //we have to adjust to names for space

        if (itemName.length() > maxNameLength) {
            itemName = itemName.substring(0, maxNameLength);
        } else {
            // Calculate the padding needed on both sides
            int totalPadding = maxNameLength - itemName.length();
            int leftPadding = totalPadding / 2;
            int rightPadding = totalPadding - leftPadding;

            // Create the formatted item name with padding on both sides
            itemName = String.format("%" + (itemName.length() + leftPadding) + "s%" + rightPadding + "s", itemName, "");
        }


        System.out.println(
                "\n                                                        ░██████████████████████████████████████████████████████████████░                                                        \n" +
                        "                                                        ░██████████████████████████████████████████████████████████████░                                                        \n" +
                        "                 ###################                    ░██████████████████████████████████████████████████████████████░                                                        \n" +
                        "                 ##               ##                    ░█████▓░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒███████████████░                                                        \n" +
                        "                 ##    $ " + formattedMoney + "    ##                    ░█████▒                                        ░████▓▒█████████░                                                        \n" +
                        "                 ##               ##                    ░█████▒    " +red + "▒▓▓▓   "+yellow+  "  ▓▓▓  "+red+   "    ░▓▓▓▓  "+yellow+   "   ▓▓▓▓" + reset +"    ░███████████████░                                                        \n" +
                        "                 ###################                    ░█████▒   "+red+ " ▓▓▓▓▒    "+yellow+ "███▓  "+red+   "   ▒████ "+yellow+   "   ░████░ "+reset+  "  ░███████████████░                                                        \n" +
                        "                                                        ░█████▒   "+red+ " █▓██▓ "+yellow+   "  ▓███▓ "+red+   "    ▒████ "+yellow+   "   ░████░ "+reset+  "  ░████▓▓█████████░                                                        \n" +
                        "                                                        ░█████▓▒▒▒▒ A1 ▒▒▒▒▒ A2 ▒▒▒▒▒ A3 ▒▒▒▒▒▒ A4 ▒▒▒▒▒██           ▓█░                                                        \n" +
                        "                                                        ░█████▒                                        ░██ " + itemName + "▓█░                                                        \n" +
                        "                                                        ░█████▒   "+green+  "  ░░░  "+yellow+    "    ░░░  "+green+    "    ░░░  "+yellow+    "    ░░░  "+reset+   "   ░██  $ " + itemPrice + "   ▓█░                                                        \n" +
                        "                                                        ░█████▒   "+green+ " ████▓  "+yellow+  "  ▓███▓ "+green+   "   ▒████ "+yellow+   "   ░████░ "+reset+  "  ░██           ▓█░                                                        \n" +
                        "                                                        ░█████▒   "+green+ " ████▓ "+yellow+  "   ▒███▓ "+green+   "   ▒████ "+yellow+   "   ░████░ "+reset+  "  ░████▓▒█████████░                                                        \n" +
                        "                                                        ░█████▓▒▒▒▒ B1 ▒▒▒▒▒ B2 ▒▒▒▒▒ B3 ▒▒▒▒▒▒ B4 ▒▒▒▒▒████▓▒█████████░                                                        \n" +
                        "                                                        ░█████▒                                        ░███▓1▒▓2▓▒3▓███░                                                        \n" +
                        "                                                        ░█████▒    ▓███▓    ▒███▓    ░████    ░████░   ░███▓4▒▓5▓▒6▓███░                                                        \n" +
                        "                                                        ░█████▒    ████▓    ▒███▓    ▒████    ░████░   ░███▓7▒▓8▓▒9████░                                                        \n" +
                        "                                                        ░█████▒    ████▓    ▒███▓    ▒████    ░████░   ░██████▒#▒██████░                                                        \n" +
                        "                                                        ░█████▒▒▒▒▒ C1 ▒▒▒▒▒ C2 ▒▒▒▒▒▒ C3 ▒▒▒▒▒ C4 ▒▒▒▒░███████████████░                                                        \n" +
                        "                                                        ░█████▒     ▒▒▒      ▒▒▒      ▒▒▒      ▒▒▒▒    ░███████████████░                                                        \n" +
                        "                                                        ░█████▒    ████▓    ▓███▓    ▒████    ░████░   ░███▒▒▓▒████████░                                                        \n" +
                        "                                                        ░█████▒    ████▓    ▓███▓    ▒████    ░████░   ░████▓▒█████████░                                                        \n" +
                        "                                                        ░█████▒▒▒▒▒ D1 ▒▒▒▒▒ D2 ▒▒▒▒▒▒ D3 ▒▒▒▒▒ D4 ▒▒▒▒░███████████████░                                                        \n" +
                        "                                                        ░██████████████████████████████████████████████████████████████░                                                        \n" +
                        "                                                        ░██████████████████████████████████████████████████████████████░                                                        \n" +
                        "                                                        ░█████▒░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▒▒▒▒▒▒▒▒▒░███████████████░                                                        \n" +
                        "                                                        ░█████▒░██████████████████████████████████████▓░███████████████░                                                        \n" +
                        "                                                        ░██████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓███████████████░                                                        \n" +
                        "                                                        ░██████████████████████████████████████████████████████████████░                                                        \n" +
                        "                                                        ░██████████████████████████████████████████████████████████████░                                                        \n" +
                        "                                                         ░░█▒░  ░ ░█▒                                     ▒█░ ░   ▒█░░                                                         \n" +
                        "                                                           ▓█▓▓▓▓▓▓█▒                                      ▒█▓▓▓▓▓▓█▓                                                           ");

    }



    public String getSecretKey() {
        return secretKey;
    }

    public double getMoney() {
        return money;
    }
    public void setMoney(double money) {
        this.money = money;
    }
}



