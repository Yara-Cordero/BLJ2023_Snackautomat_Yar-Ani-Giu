package Snackautomat;

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

    Item a1 = new Item(3.50, "Maltesers", 10, false);
    Item a2 = new Item(2.50, "M&M", 10, false);
    Item a3 = new Item(3.0, "Snickers", 10, false);
    Item a4 = new Item(2.90, "Twix", 10, false);
    Item b1 = new Item(4.20, "P. Chips", 10, false);
    Item b2 = new Item(4.80, "Haribo", 10, false);
    Item b3 = new Item(2.0, "Kaugummi", 10, false);
    Item b4 = new Item(3.75, "Oreos", 10, false);
    Item c1 = new Item(4.95, "Blue Takis", 10, false);
    Item c2 = new Item(2.30, "Balisto", 10, false);
    Item c3 = new Item(4.20, "N. Chips", 10, false);
    Item c4 = new Item(4.95, "Red Takis", 10, false);
    Item d1 = new Item(3.80, "Cola", 10, true);
    Item d2 = new Item(1.75, "Wasser (Still)", 10, true);
    Item d3 = new Item(1.50, "Capri Sun", 10, true);
    Item d4 = new Item(3.80, "Fanta", 10, true);

    Item extra1 = new Item(5.0, "Lighter",10,false);
    Item extra2 = new Item(20.0,"Pregnancy test",10,false);
    Item extra3 = new Item(3.0,"Papes",10,false);
    Item extra4 = new Item(14.0,"Vape", 10,false);
    Item extra5 = new Item(20.0, "Powerbank", 10, false);
    Item extra6 = new Item(6.50, "Condoms", 10, false);
    Item extra7 = new Item(2.50, "Red Bull", 10, true);
    Item extra8 = new Item(3.40, "Ice Tea", 10, true);


    public Machine() {
    }

    public Machine(double money) {
        this.money = money;
    }

    private static final String red = "\u001B[31m";
    private static final String yellow = "\u001B[33m";
    private static final String green ="\u001B[32m";
    private static final String violet = "\u001B[35m";
    private static final String blue = "\u001B[34m";
    private static final String cyan = "\u001B[36m";
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
           System.out.println("Enter Code:");

           String inputItemPos = scan.nextLine().toLowerCase();  //have to enter twice
           scan.nextLine();
           error = true;
           if (secretKey.equals(inputItemPos)) {
                secretKeyFunction();
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

    private void secretKeyFunction() {
        String inputCode;
        boolean repeat = true;


        do {
            boolean error;
            do {
                printMachine();

                System.out.println("You got the " + yellow + "SECRET KEY!!" + reset);
                System.out.println("What do you want to do?");
                System.out.println("Which item do you want to edit? ");

                System.out.println("1. Restock item\n2. Change Price\n3. Replace item\n4. Cancel");

                String inputSecretKeyChoice = scan.nextLine().toLowerCase();
                error = false;

                if (inputSecretKeyChoice.equals("1") || inputSecretKeyChoice.equals("restock item")) {
                    error = false;


                    System.out.println("Enter Code");
                    inputCode = scan.nextLine();


                    switch (inputCode.toLowerCase()) {
                        case "a1": {
                            restockItem(a1);
                            break;
                        }
                        case "a2": {
                            restockItem(a2);
                            break;
                        }
                        case "a3": {
                            restockItem(a3);
                            break;
                        }
                        case "a4": {
                            restockItem(a4);
                            break;
                        }
                        case "b1": {
                            restockItem(b1);
                            break;
                        }
                        case "b2": {
                            restockItem(b2);
                            break;
                        }
                        case "b3": {
                            restockItem(b3);
                            break;
                        }
                        case "b4": {
                            restockItem(b4);
                            break;
                        }
                        case "c1": {
                            restockItem(c1);
                            break;
                        }
                        case "c2": {
                            restockItem(c2);
                            break;
                        }
                        case "c3": {
                            restockItem(c3);
                            break;
                        }
                        case "c4": {
                            restockItem(c4);
                            break;
                        }
                        case "d1": {
                            restockItem(d1);
                            break;
                        }
                        case "d2": {
                            restockItem(d2);
                            break;
                        }
                        case "d3": {
                            restockItem(d3);
                            break;
                        }
                        case "d4": {
                            restockItem(d4);
                            break;
                        }
                    }
                    //  restockItem();
                } else if (inputSecretKeyChoice.equals("2") || inputSecretKeyChoice.equals("change price")) {
                    error = false;

                    System.out.println("Enter Code");
                    inputCode = scan.nextLine();

                    switch (inputCode.toLowerCase()) {
                        case "a1": {
                            changePrice(a1);
                            break;
                        }
                        case "a2": {
                            changePrice(a2);
                            break;
                        }
                        case "a3": {
                            changePrice(a3);
                            break;
                        }
                        case "a4": {
                            changePrice(a4);
                            break;
                        }
                        case "b1": {
                            changePrice(b1);
                            break;
                        }
                        case "b2": {
                            changePrice(b2);
                            break;
                        }
                        case "b3": {
                            changePrice(b3);
                            break;
                        }
                        case "b4": {
                            changePrice(b4);
                            break;
                        }
                        case "c1": {
                            changePrice(c1);
                            break;
                        }
                        case "c2": {
                            changePrice(c2);
                            break;
                        }
                        case "c3": {
                            changePrice(c3);
                            break;
                        }
                        case "c4": {
                            changePrice(c4);
                            break;
                        }
                        case "d1": {
                            changePrice(d1);
                            break;
                        }
                        case "d2": {
                            changePrice(d2);
                            break;
                        }
                        case "d3": {
                            changePrice(d3);
                            break;
                        }
                        case "d4": {
                            changePrice(d4);
                            break;
                        } default:
                    }

                } else if (inputSecretKeyChoice.equals("3") || inputSecretKeyChoice.equals("replace item")) {
                    error = false;

                    System.out.println("Enter Code");
                    inputCode = scan.nextLine();

                    switch (inputCode.toLowerCase()) {
                        case "a1": {
                            replaceItem(a1);
                            break;
                        }
                        case "a2": {
                            replaceItem(a2);
                            break;
                        }
                        case "a3": {
                            replaceItem(a3);
                            break;
                        }
                        case "a4": {
                            replaceItem(a4);
                            break;
                        }
                        case "b1": {
                            replaceItem(b1);
                            break;
                        }
                        case "b2": {
                            replaceItem(b2);
                            break;
                        }
                        case "b3": {
                            replaceItem(b3);
                            break;
                        }
                        case "b4": {
                            replaceItem(b4);
                            break;
                        }
                        case "c1": {
                            replaceItem(c1);
                            break;
                        }
                        case "c2": {
                            replaceItem(c2);
                            break;
                        }
                        case "c3": {
                            replaceItem(c3);
                            break;
                        }
                        case "c4": {
                            changePrice(c4);
                            break;
                        }
                        case "d1": {
                            changePrice(d1);
                            break;
                        }
                        case "d2": {
                            changePrice(d2);
                            break;
                        }
                        case "d3": {
                            changePrice(d3);
                            break;
                        }
                        case "d4": {
                            changePrice(d4);
                            break;
                        }
                    }


                } else if (inputSecretKeyChoice.equals("4") || inputSecretKeyChoice.equals("4.") || inputSecretKeyChoice.equals("cancel")) {
                    error = false;
                } else {
                    System.out.println("Invalid Input");
                    error = true;
                }
            } while (error);

            System.out.println("Do you want to make more changes? (Y/N)");
            char inputRepeat = scan.next().charAt(0);
            scan.nextLine();

            if(inputRepeat == 'n' || inputRepeat == 'N'){
                repeat = false;
            }
        }while(repeat);

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

    private void restockItem(Item item) {
        System.out.println("Do you want to set the item to max(15) or default amount(10)");
        String restockChoice = scan.next();

        if(restockChoice == "max" || restockChoice == "15") {
            int calcMaxAmount = 15 - item.getAmount();
            item.setAmount(item.getAmount() + calcMaxAmount);
            System.out.println(item.getNameOfTheProduct() + "has now been restocked to " + item.getAmount() + "items");
        } else if (restockChoice == "default" || restockChoice == "10") {
            if(item.getAmount() == 10) {
                double calcDefAmount = 10 - item.getAmount();
                item.setPrice(item.getAmount() + calcDefAmount);
                System.out.println(item.getNameOfTheProduct() + "has now been restocked to " + item.getAmount() + "items");
            } else {
                System.out.println("There are already 10");
            }
        } else {
            System.out.println("There has been an error");
        }
    }


    private void changePrice(Item item) {

        System.out.println("What do you want to change the price to?");
        double newPrice = scan.nextDouble();

        item.setPrice(newPrice);

        System.out.println("The new Price is " + String.format("%.2f", item.getPrice()));
    }


    private void replaceItem(Item item) {

        System.out.println("With which item do you want to replace " + item.getNameOfTheProduct() + "\n" +
                "1. " + extra1.getNameOfTheProduct() + "\t" + "5. " + extra5.getNameOfTheProduct() + "\n" +
                "2. " + extra2.getNameOfTheProduct() + "\t" + "6. " + extra6.getNameOfTheProduct() + "\n" +
                "3. " + extra3.getNameOfTheProduct() + "\t" + "7. " + extra7.getNameOfTheProduct() + "\n" +
                "4. " + extra4.getNameOfTheProduct() + "\t" + "8. " + extra8.getNameOfTheProduct() + "\n");

        int replaceItem = scan.nextInt();
        Item temp = item;
        switch (replaceItem) {
            case 1: {
                item = extra1;
                extra1 = temp;
                break;
            } case 2: {
                item = extra2;
                extra2 = temp;
                break;
            } case 3: {
                item = extra3;
                extra3 = temp;
                break;
            } case 4: {
                item = extra4;
                extra6 = temp;
                break;
            } case 5: {
                item = extra5;
                extra5 = temp;
                break;
            } case 6: {
                item = extra6;
                extra6 = temp;
                break;
            } case 7: {
                item = extra7;
                extra7 = temp;
                break;
            } case 8: {
                item = extra8;
                extra8 = temp;
                break;
            } default: {
                System.out.println("Invalid input");
            }
        }

        System.out.println("Your item has been replaced with " + item.getNameOfTheProduct());

    }

    private void printMachine() {
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
                        "                                                        ░█████▒    "+cyan+"▓███▓    "+green+"▒███▓    "+cyan+"░████    "+green+"░████░   "+reset+"░███▓4▒▓5▓▒6▓███░                                                        \n" +
                        "                                                        ░█████▒    "+cyan+"████▓    "+green+"▒███▓    "+cyan+"▒████    "+green+"░████░   "+reset+"░███▓7▒▓8▓▒9████░                                                        \n" +
                        "                                                        ░█████▒    "+cyan+"████▓    "+green+"▒███▓    "+cyan+"▒████    "+green+"░████░   "+reset+"░██████▒#▒██████░                                                        \n" +
                        "                                                        ░█████▒▒▒▒▒ C1 ▒▒▒▒▒ C2 ▒▒▒▒▒▒ C3 ▒▒▒▒▒ C4 ▒▒▒▒░███████████████░                                                        \n" +
                        "                                                        ░█████▒     "+blue+"▒▒▒      "+violet+"▒▒▒      "+blue+"▒▒▒      "+violet+"▒▒▒▒    "+reset+"░███████████████░                                                        \n" +
                        "                                                        ░█████▒    "+blue+"████▓    "+violet+"▓███▓    "+blue+"▒████    "+violet+"░████░   "+reset+"░███▒▒▓▒████████░                                                        \n" +
                        "                                                        ░█████▒    "+blue+"████▓    "+violet+"▓███▓    "+blue+"▒████    "+violet+"░████░   "+reset+"░████▓▒█████████░                                                        \n" +
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

    private void printMachineWithPrice(Item item) {
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
                        "                 ##               ##                    ░█████▒    "+red+"▒▓▓▓   "+yellow+"  ▓▓▓  "+red+"    ░▓▓▓▓  "+yellow+"   ▓▓▓▓"+reset+"    ░███████████████░                                                        \n" +
                        "                 ###################                    ░█████▒   "+red+" ▓▓▓▓▒    "+yellow+"███▓  "+red+"   ▒████ "+yellow+"   ░████░ "+reset+"  ░███████████████░                                                        \n" +
                        "                                                        ░█████▒   "+red+" █▓██▓ "+yellow+"  ▓███▓ "+red+"    ▒████ "+yellow+"   ░████░ "+reset+"  ░████▓▓█████████░                                                        \n" +
                        "                                                        ░█████▓▒▒▒▒ A1 ▒▒▒▒▒ A2 ▒▒▒▒▒ A3 ▒▒▒▒▒▒ A4 ▒▒▒▒▒██           ▓█░                                                        \n" +
                        "                                                        ░█████▒                                        ░██ " + itemName + "▓█░                                                        \n" +
                        "                                                        ░█████▒   "+green+"  ░░░  "+yellow+"    ░░░  "+green+"    ░░░  "+yellow+"    ░░░  "+reset+"   ░██  $ " + itemPrice + "   ▓█░                                                        \n" +
                        "                                                        ░█████▒   "+green+" ████▓  "+yellow+"  ▓███▓ "+green+"   ▒████ "+yellow+"   ░████░ "+reset+"  ░██           ▓█░                                                        \n" +
                        "                                                        ░█████▒   "+green+" ████▓ "+yellow+"   ▒███▓ "+green+"   ▒████ "+yellow+"   ░████░ "+reset+"  ░████▓▒█████████░                                                        \n" +
                        "                                                        ░█████▓▒▒▒▒ B1 ▒▒▒▒▒ B2 ▒▒▒▒▒ B3 ▒▒▒▒▒▒ B4 ▒▒▒▒▒████▓▒█████████░                                                        \n" +
                        "                                                        ░█████▒                                        ░███▓1▒▓2▓▒3▓███░                                                        \n" +
                        "                                                        ░█████▒    "+cyan+"▓███▓    "+green+"▒███▓    "+cyan+"░████    "+green+"░████░   "+reset+"░███▓4▒▓5▓▒6▓███░                                                        \n" +
                        "                                                        ░█████▒    "+cyan+"████▓    "+green+"▒███▓    "+cyan+"▒████    "+green+"░████░   "+reset+"░███▓7▒▓8▓▒9████░                                                        \n" +
                        "                                                        ░█████▒    "+cyan+"████▓    "+green+"▒███▓    "+cyan+"▒████    "+green+"░████░   "+reset+"░██████▒#▒██████░                                                        \n" +
                        "                                                        ░█████▒▒▒▒▒ C1 ▒▒▒▒▒ C2 ▒▒▒▒▒▒ C3 ▒▒▒▒▒ C4 ▒▒▒▒░███████████████░                                                        \n" +
                        "                                                        ░█████▒     "+blue+"▒▒▒      "+violet+"▒▒▒      "+blue+"▒▒▒      "+violet+"▒▒▒▒    "+reset+"░███████████████░                                                        \n" +
                        "                                                        ░█████▒    "+blue+"████▓    "+violet+"▓███▓    "+blue+"▒████    "+violet+"░████░   "+reset+"░███▒▒▓▒████████░                                                        \n" +
                        "                                                        ░█████▒    "+blue+"████▓    "+violet+"▓███▓    "+blue+"▒████    "+violet+"░████░   "+reset+"░████▓▒█████████░                                                        \n" +
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



