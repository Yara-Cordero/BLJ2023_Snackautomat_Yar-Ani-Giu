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

    Item a1 = new Item(3.50, "Maltesers", 10, false);
    Item a2 = new Item(2.50, "M&M", 20, false);
    Item a3 = new Item(3.0, "Snickers", 15, false);
    Item a4 = new Item(2.90, "Twix", 32, false);
    Item b1 = new Item(4.20, "P. Chips", 43, false);
    Item b2 = new Item(4.80, "Haribo", 12, false);
    Item b3 = new Item(2.0, "Kaugummi", 51, false);
    Item b4 = new Item(3.75, "Oreos", 23, false);
    Item c1 = new Item(4.95, "Blue Takis", 17, false);
    Item c2 = new Item(2.30, "Balisto", 17, false);
    Item c3 = new Item(4.20, "N. Chips", 31, false);
    Item c4 = new Item(4.95, "Red Takis", 19, false);
    Item d1 = new Item(3.80, "Cola", 45, true);
    Item d2 = new Item(1.75, "Wasser (Still)", 37, true);
    Item d3 = new Item(1.50, "Capri Sun", 24, true);
    Item d4 = new Item(3.80, "Fanta", 36, true);

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
                //secretKeyFunction();
           }else {
               switch (inputItemPos){
                   case "a1":{
                       purchaseItem(a1, getMoney());
                       break;
                   }case "a2":{
                       purchaseItem(a2, getMoney());
                       break;
                   }case "a3":{
                       purchaseItem(a3, getMoney());
                       break;
                   }case "a4":{
                       purchaseItem(a4, getMoney());
                       break;
                   }case "b1":{
                       purchaseItem(b1, getMoney());
                       break;
                   }case "b2":{
                       purchaseItem(b2, getMoney());
                       break;
                   }case "b3":{
                       purchaseItem(b3, getMoney());
                       break;
                   }case "b4":{
                       purchaseItem(b4, getMoney());
                       break;
                   }case "c1":{
                       purchaseItem(c1, getMoney());
                       break;
                   }case "c2":{
                       purchaseItem(c2, getMoney());
                       break;
                   }case "c3":{
                       purchaseItem(c3, getMoney());
                       break;
                   }case "c4":{
                       purchaseItem(c4, getMoney());
                       break;
                   }case "d1":{
                       purchaseItem(d1, getMoney());
                       break;
                   }case "d2":{
                       purchaseItem(d2, getMoney());
                       break;
                   }case "d3":{
                       purchaseItem(d3, getMoney());
                       break;
                   }case "d4":{
                       purchaseItem(d4, getMoney());
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

    /*
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
                    changePrice(a1);
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

    }*/

    /*
    private void changePrice(Item item) {
        boolean error;

        do {
            error = true;
            System.out.println("Enter the product number for the item whose price you want to change:");
            String inputProductNumber = scan.nextLine().toLowerCase();

            String itemProductNumber = item.getProductNumber(); // Accessing product number using the Item object

            if(inputProductNumber.equals(itemProductNumber)) {
                // Product number matches, proceed to change the price
                System.out.println("Enter the new price for the item:");
                double newPrice = scan.nextDouble();
                scan.nextLine(); // Consume the newline character after reading the double

                item.setPrice(newPrice); // Assuming setPrice() method exists in the Item class to change the price
                error = false; // Set error to false for exit the loop
            } else {
                System.out.println("Product number does not match. Please try again.");
            }
        } while (error);
    }*/


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



