/*
    Becthold, R. (2021). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.

    Krasso, R. (2021). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.
*/

public class FinanceCalculator {

    // Creating private static int value to record the number of months in a year for use in calculation
    private static int MONTHS_IN_YEAR = 12;


    /**
     * double method calculateFutureValue:
     *      Takes arguments needed for value calculation and outputs the computed result
     * @param monthlyPayment double
     * @param rate double
     * @param years int
     * @return calculated future value double
     */
    static double calculateFutureValue(double monthlyPayment, double rate, int years) {

        return monthlyPayment * years * MONTHS_IN_YEAR * (Math.pow(1 + (rate/100), years * MONTHS_IN_YEAR));

    } // End calculateFutureValue
    
} // End FinanceCalculator class