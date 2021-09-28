/*
    Becthold, R. (2021). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.

    Krasso, R. (2021). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.
*/

import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;

public class TestExpenseTracker {

    public static void main(String[] args) {

        System.out.println("\nWelcome to the Expense Tracker\n");

        // create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // create String object to hold user's decision to continue or not
        String continueString = "y";

        // loop while user wants to continue
        while(continueString.equalsIgnoreCase("y")) {

            // display menu options and store user decision in an int object
            int input = ValidatorIO.getInt(sc, "\nMENU OPTIONS\n  1. View Transactions\n  2. Add Transactions"
                                            +"\n  3. View Expense\n\nPlease choose an option: ");

            // switch over user input menu selection
            switch(input) {
                // if user enters 1, display all Transactions in expenses.txt
                case 1:
                    try {
                        System.out.println("\nMONTHLY EXPENSES");
                        ArrayList<Transaction> transactions = TransactionIO.findAll();

                        for(Transaction tran : transactions) {
                            System.out.printf("\n Date: %s\n Description: %s\n Amount: $%6.2f\n", tran.getDate(), tran.getDescription(), tran.getAmount());
                        }
                    }
                    catch(IOException e) {
                        System.out.println("\n Exception: "+e.getMessage());
                    }
                    break;

                // if user enters int 2, user can enter arbitrarily many Transactions to expenses.txt
                case 2:
                    String cont = "y";
                    ArrayList<Transaction> lTransactions = new ArrayList<Transaction>();

                    while(cont.equalsIgnoreCase("y")) {
                        String description = ValidatorIO.getString(sc, "\n Enter the description: ");
                        double amount = ValidatorIO.getDouble(sc, " Enter the amount: ");
                        Transaction tran = new Transaction();
                        tran.setDescription(description);
                        tran.setAmount(amount);
                        lTransactions.add(tran);
                        cont = ValidatorIO.getString(sc, "\nAdd another transaction? (y/n): ");
                    }
                    try {
                        TransactionIO.bulkInsert(lTransactions);
                    }
                    catch(IOException e) {
                        System.out.println("\n Exception: "+e.getMessage());
                    }
                    break;

                // if user enters int 3, display the total monthly expenses value of all Transactions in expenses.txt
                case 3:
                    try {
                        ArrayList<Transaction> transactions = TransactionIO.findAll();
                        double monthlyExpense = 0.0;

                        for(Transaction tran : transactions) {
                            monthlyExpense += tran.getAmount();
                        }

                        System.out.printf("\n Your total monthly expense is $%6.2f\n", monthlyExpense);
                    }
                    catch(IOException e) {
                        System.out.println("\n Exception: "+e.getMessage());
                    }
                    break;
            }

            continueString = ValidatorIO.getString(sc, "\nContinue? (y/n): ");
        }

    } // end main
    
} // end TestExpenseTracker class