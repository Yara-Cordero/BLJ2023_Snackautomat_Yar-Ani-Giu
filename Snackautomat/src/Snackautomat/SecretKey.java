package Snackautomat;

import java.util.Scanner;

public class SecretKey {
    /**
     *  }else {
     *                switch (inputItemPos){
     *                    case "a1":{
     *                        purchaseItem(maltesers, getMoney());
     *                        break;
     *                    }case "a2":{
     *                        purchaseItem(mms, getMoney());
     *                        break;
     *                    }case "a3":{
     *                        purchaseItem(snickers, getMoney());
     *                        break;
     *                    }case "a4":{
     *                        purchaseItem(twix, getMoney());
     *                        break;
     *                    }case "b1":{
     *                        purchaseItem(paprikaChips, getMoney());
     *                        break;
     *                    }case "b2":{
     *                        purchaseItem(haribo, getMoney());
     *                        break;
     *                    }case "b3":{
     *                        purchaseItem(kaugummi, getMoney());
     *                        break;
     *                    }case "b4":{
     *                        purchaseItem(oreos, getMoney());
     *                        break;
     *                    }case "c1":{
     *                        purchaseItem(blueTakis, getMoney());
     *                        break;
     *                    }case "c2":{
     *                        purchaseItem(balisto, getMoney());
     *                        break;
     *                    }case "c3":{
     *                        purchaseItem(natureChips, getMoney());
     *                        break;
     *                    }case "c4":{
     *                        purchaseItem(redTakis, getMoney());
     *                        break;
     *                    }case "d1":{
     *                        purchaseItem(cola, getMoney());
     *                        break;
     *                    }case "d2":{
     *                        purchaseItem(wasserStill, getMoney());
     *                        break;
     *                    }case "d3":{
     *                        purchaseItem(capriSun, getMoney());
     *                        break;
     *                    }case "d4":{
     *                        purchaseItem(fanta, getMoney());
     *                        break;
     *                    } default:{
     *                        System.out.println("Enter a valid Input");
     *                    }
     */
    public void replaceItem() {
        Scanner in = new Scanner(System.in);
        System.out.println("Which item do you want to replace?");
        String itemPos = in.nextLine();

        

    }

    private void changePrice(){
        System.out.println("Enter the name of the item you want to change the price of:");
        String itemName = scan.nextLine();
        System.out.println("Enter the new price");
        double newPrice = scan.nextDouble();
        scan.nextLine();    //consume new line left-over

        boolean found = false;
        for(String[] item : vendigItems){
            if(item[0].toLowerCase().equals(itemName)){
                item[1] = Double.toString(newPrice);
                found = true;
                System.out.println("The price of " + item[0] + " has been updated to " + newPrice);
                break;
            }
        }
        if (!found){
            System.out.println("Item not found in the vending machine.");
        }
    }
}
