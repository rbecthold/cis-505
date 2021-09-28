/*
    Becthold, R. (2021). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.

    Krasso, R. (2021). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.
*/

import java.util.Scanner;

public class ValidatorIO {
    
    /**
     * getInt method to validate and return a user/file Integer input value
     * @param sc Scanner
     * @param prompt String
     * @return Integer from input
     */
    public static Integer getInt(Scanner sc, String prompt) {
        Integer input = 0;
        boolean isValid = false;

        while(!isValid) {
            System.out.print(prompt);

            if(sc.hasNextInt()) {
                input = sc.nextInt();
                isValid = true;
            }
            else {
                System.out.println("\n Error! Invalid integer value.");
            }
            sc.nextLine();
        }

        return input;
    } // end getInt

    /**
     * getDouble method to validate and return a user/file Double value
     * @param sc Scanner
     * @param prompt String
     * @return Double from input
     */
    public static Double getDouble(Scanner sc, String prompt) {
        Double input = 0.0;
        boolean isValid = false;

        while(!isValid) {
            System.out.print(prompt);

            if(sc.hasNextDouble()) {
                input = sc.nextDouble();
                isValid = true;
            }
            else {
                System.out.println("\n Error! Invalid double value.");
            }
            sc.nextLine();
        }

        return input;
    } // end getDouble

    /**
     * getSTring method to return a user/file String value
     * @param sc Scanner
     * @param prompt String
     * @return String from input
     */
    public static String getString(Scanner sc, String prompt) {
        System.out.print(prompt);
        String input = sc.next();
        sc.nextLine();
        return input;
    } // end getString

} // end ValidatorIO class