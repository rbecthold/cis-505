/*
    Becthold, R. (2021). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.

    Krasso, R., (2021). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.

    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
    Comprehensive Version (12th ed.). Pearson Education, Inc.
*/

import java.util.Scanner;

public class TestCustomerAccountApp {

    public static void main(String[] args) {
        // prompt user for input (for account id)
        System.out.println("\nWelcome to the Customer Account App\n");
        System.out.print("Enter a customer ID:\n  ex: 1007, 1008, 1009>: ");

        // Ask for initial choice on Account id
        Scanner input = new Scanner(System.in);
        Customer customer = CustomerDB.getCustomer(input.nextInt());
        Account account = new Account();
        System.out.println();

        // two variables to store the decisions made in Account and Continue? menus
        String menuDecision;
        String continueDecision = "y";

        do{
            // display Account menu
            account.displayMenu();
            // record Account menu selection
            menuDecision = input.next();

            // switch over the possible Account menu selections and take the correct action
            switch(menuDecision) {
                // case for 'deposit' Account menu selection
                case "D": case "d":
                    System.out.print("\nEnter deposit amount: ");
                    account.deposit(input.nextDouble());
                    break;
                // case for 'withdraw' Account menu selection
                case "W": case "w":
                    System.out.print("\nEnter withdraw amount: ");
                    account.withdraw(input.nextDouble());
                    break;
                // case for 'display balance' Account menu selection
                case "B": case "b":
                    System.out.printf("\nAccount balance: $%,6.2f\n", account.getBalance());
                    break;
                // default case to handle any invalid input for Account menu selection
                default:
                    System.out.println("\nError: Invalid option");
                    break;
            }

            // display Continue? menu
            System.out.print("\nContinue? (y/n): ");
            // record Continue? menu selection
            continueDecision = input.next();

            System.out.println();
        } while(continueDecision.charAt(0) == 'y');

        // display current transaction date and account balance
        System.out.println(customer.toString());
        System.out.printf("Balance as of %s is $%,6.2f\n", account.getTransactionDate(), account.getBalance());

        System.out.println("\nEnd of line...");
        // close Scanner input
        input.close();

    } // end main
    
} // end TestCustomerAccountApp class