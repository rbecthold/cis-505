/*
    Becthold, R. (2021). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.

    Krasso, R. (2021). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.
*/

public class FinanceCalculator {

    private static int MONTHS_IN_YEAR = 12;

    static double calculateFutureValue(double monthlyPayment, double rate, int years) {

        int numMonths = years * MONTHS_IN_YEAR;
        double interestRate = 1 + (rate/100);
        double presentValue = monthlyPayment * numMonths;
        double futureValue = presentValue * (Math.pow(interestRate, numMonths));

        return futureValue;
    }
    
} // end FinanceCalculator class