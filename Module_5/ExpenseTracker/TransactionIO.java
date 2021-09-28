/*
    Becthold, R. (2021). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.

    Krasso, R. (2021). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.
*/

import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.IOException;
import java.io.PrintWriter;

public class TransactionIO {

    /**
     * Creating the following private static data fields to represent the team's attributes:
     *     FILE_NAME -> represents the location of the Transaction file name
     *     file -> represents the File object for the FILE_NAME file
     */
    private static String FILE_NAME = "expenses.txt";
    private static File file = new File(FILE_NAME);

    /**
     * bulkInsert method to insert an ArrayList of Transactions into the Transactions file
     * @param transactions ArrayList<Transaction>
     * @throws IOException
     */
    public static void bulkInsert(ArrayList<Transaction> transactions) throws IOException {

        PrintWriter output = null;

        if(file.exists()) {
            output = new PrintWriter(new FileOutputStream(new File(FILE_NAME), true));
        }
        else {
            output = new PrintWriter(FILE_NAME);
        }

        for(Transaction tran : transactions) {
            output.print(tran.getDate()+" ");
            output.print(tran.getDescription()+" ");
            output.println(tran.getAmount());
        }

        output.close();

    } // end bulkInsert

    /**
     * findAll method to transform and return all Transaction objects contained within the Transaction file
     * @return ArrayList<Transaction>
     * @throws IOException
     */
    public static ArrayList<Transaction> findAll() throws IOException {

        Scanner input = new Scanner(file);
        ArrayList<Transaction> transactions = new ArrayList<Transaction>();

        while(input.hasNext()) {
            transactions.add(new Transaction(input.next(), input.next(), input.nextDouble()));
        }

        input.close();
        return transactions;

    } // end findAll
    
} // end TransactionIO class