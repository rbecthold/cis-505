/*
    Becthold, R. (2021). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.

    Krasso, R., (2021). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.

    JavaTpoint. (2021). Get Current Date and Time in Java. https://www.javatpoint.com/java-get-current-date

    Jenkov, J. (2021, March 9). Java SimpleDateFormat. http://tutorials.jenkov.com/java-internationalization/simpledateformat.html
*/

import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Account {

    /**
     * Creating the following private data fields to represent the team's attributes:
     *     balance -> represents the Account's current balance
     */
    private double balance = 200.00;

    /**
     * GET method for the 'balance' attribute
     * @return balance double
     */
    public double getBalance() {
        return balance;
    } // end getBalance


    /**
     * Public deposit method, increases the Account's balance by the input amount
     * @param amt double
     */
    public void deposit(double amt) {
        this.balance += amt;
    } // end deposit


    /**
     * Public withdraw method, decreases the Account's balance by the input amount if the funds are available
     * @param amt double
     */
    public void withdraw(double amt) {
        if(this.balance >= amt) {
            this.balance -= amt;
        }
    } // end withdraw


    /**
     * Public displayMenu method, prints Account menu options to console
     */
    public void displayMenu() {
        System.out.print("Account Menu\nEnter <D/d> for deposit\nEnter <W/w> for withdraw\nEnter <B/b> for balance\n  Enter option>: ");
    } // end displayMenu


    /**
     * Public getTransactionDate method, returns the current date formatted as 'MM-dd-yyyy'
     * @return date String
     */
    public String getTransactionDate() {
        Date date = Calendar.getInstance().getTime();
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
        return dateFormat.format(date);
    } // end getTransactionDate
    
} // end Account class