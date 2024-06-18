package com.mycompany.softwaresales;
import javax.swing.JOptionPane;


/*
A software company sells a package that retails for $99. Quantity discounts are given 
according to the following table:
 Quantity     Discount
 10–19          20%
 20–49          30%
 50–99          40%
 100 or more    50%
               
This program asks the user to enter the number of packages purchased. The pro
gram then displays the amount of the discount (if any) and the total amount of the 
purchase after the discount.
 */



public class SoftwareSales {

    public static void main(String[] args) {
        int numberOfPackages;
        final double pricePerPackage = 99; //USD
        double totalAmountOfPurchase;
        double discount;
        double discountInUSD;
        String input;
        
        input = JOptionPane.showInputDialog("How many packages did you purchase? ");
        numberOfPackages = Integer.parseInt(input);
        
        totalAmountOfPurchase = pricePerPackage * numberOfPackages;
        
        if(numberOfPackages>=10 && numberOfPackages<=19)
        {
            discount = 20;
            discountInUSD = totalAmountOfPurchase - ((discount/100) * totalAmountOfPurchase);
            JOptionPane.showMessageDialog(null,"Total amount" + "of purchase: " + totalAmountOfPurchase + " USD" + 
                    "\n You got a discount of: " + discount + "%" + "\nAmount payable after discount: " + discountInUSD + " USD");
        }
        
        else if(numberOfPackages>=20 && numberOfPackages<=49)
        {
            discount = 30;
            discountInUSD = totalAmountOfPurchase - ((discount/100) * totalAmountOfPurchase);
           JOptionPane.showMessageDialog(null,"Total amount" + "of purchase: " + totalAmountOfPurchase + " USD" + 
                    "\n You got a discount of: " + discount + "%" + "\nAmount payable after discount: " + discountInUSD + " USD");
        }
        
        else if(numberOfPackages>=50 && numberOfPackages<=99)
        {
            discount = 40;
            discountInUSD = totalAmountOfPurchase - ((discount/100) * totalAmountOfPurchase);
           JOptionPane.showMessageDialog(null,"Total amount" + "of purchase: " + totalAmountOfPurchase + " USD" + 
                    "\n You got a discount of: " + discount + "%" + "\nAmount payable after discount: " + discountInUSD + " USD");
        }
        
        else if(numberOfPackages>=100)
        {
            discount = 50;
            discountInUSD = totalAmountOfPurchase - ((discount/100) * totalAmountOfPurchase);
            JOptionPane.showMessageDialog(null,"Total amount" + "of purchase: " + totalAmountOfPurchase + " USD" + 
                    "\n You got a discount of: " + discount + "%" + "\nAmount payable after discount: " + discountInUSD + " USD");
        }
        
        else
        {
            JOptionPane.showMessageDialog(null,"Total amount of purchase: " + totalAmountOfPurchase + " USD");
        }
        
        
    }
}
