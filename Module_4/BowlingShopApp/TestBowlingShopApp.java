/*
    Becthold, R. (2021). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.

    Krasso, R. (2021). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.
*/

import java.util.Scanner;

public class TestBowlingShopApp {

    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        System.out.println("\nWelcome to the Bowling Shop\n\n");

        /**
         * Create String object to hold user input
         * Must not start as empty String, or the first comparison
         * of the while loop will not run.
         */
        String selection = " ";

        // Create new GenericQueue<Product> products to store Product information
        GenericQueue<Product> products = new GenericQueue<Product>();

        // Loop over menu selection until user selects option 'x'
        while(selection.charAt(0) != 'x') {

            // Show menu options
            displayMenu();

            // Get and store user input
            selection = String.valueOf(input.nextLine().charAt(0));

            // Fill products queue with matching Products
            products = ProductDB.getProducts(selection);

            System.out.println("\n--Product Listing--");
            
            // Loop through products queue and output items to console
            while(products.size() > 0) {
                System.out.println(products.dequeue().toString()+"\n");
            }
        }

        // Close Scanner object
        input.close();

    } // end main

    /**
     * displayMenu method to print menu options to console
     */
    public static void displayMenu() {

        System.out.print("MENU OPTIONS\n  1. <b> Bowling Balls"
            +"\n  2. <a> Bowling Bags\n  3. <s> Bowling Shoes"
            +"\n  4. <x> To exit\n\nPlease choose an option: ");

    } // end displayMenu

} // end TestBowlingShopApp class