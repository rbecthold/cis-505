/*
    Becthold, R. (2021). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.

    Krasso, R. (2021). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.
*/

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Transaction {

    /**
     * Creating the following private data fields to represent the team's attributes:
     *     date -> represents the date the Transaction occurred
     *     description -> represents the Transaction's description
     *     amount -> represents the Transaction's total amount
     */
    private String date;
    private String description;
    private double amount;

    /**
     * Transaction constructor method with 0 arguments
     * @return gives a new Transaction object with default values
     */
    public Transaction() {
        date = String.valueOf(new SimpleDateFormat("MM-dd-yyyy").format(Calendar.getInstance().getTime()));
        description = "";
        amount = 0.0;
    } // end Transaction default constructor

    /**
     * Transaction constructor with 3 arguments
     * @param date String
     * @param description String
     * @param amount double
     * @return gives a new Transaction object with the specified attribute values
     */
    public Transaction(String date, String description, double amount) {
        this.date = date;
        this.description = description;
        this.amount = amount;
    } // end Transaction argument constructor

    /**
     * GET method for the 'date' attribute
     * @return date String
     */
    public String getDate() {
        return date;
    } // end getDate

    /**
     * SET method for the 'date' attribute
     * @param date String
     */
    public void setDate(String date) {
        this.date = date;
    } // end setDate

    /**
     * GET method for the 'description' attribute
     * @return description String
     */
    public String getDescription() {
        return description;
    } // end getDescription

    /**
     * SET method for the 'description' attribute
     * @param description String
     */
    public void setDescription(String description) {
        this.description = description;
    } // end setDescription

    /**
     * GET method for the 'amount' attribute
     * @return amount double
     */
    public double getAmount() {
        return amount;
    } // end getAmount

    /**
     * SET method for the 'amount' attribute
     * @param amount double
     */
    public void setAmount(double amount) {
        this.amount = amount;
    } // end setAmount

    /**
     * Overriding toString method
     * @return formatted String representation of the Transaction's attributes
     */
    @Override
    public String toString() {
        return "Date: "+date+"\nDescription: "+description+"\nAmount: "+String.valueOf(amount)+"\n";
    } // end toString

} // end Transaction class