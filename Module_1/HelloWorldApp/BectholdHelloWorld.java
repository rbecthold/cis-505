/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by R. Krasso 2021
    Additional modifications by R. Becthold 2021
*/

public class BectholdHelloWorld {

    /**
     * Method with two arguments, which prints 'Hello World from' followed by the user's name.
     * @param firstName String
     * @param lastName String
     * @return prints the results to the console window.
     */
    public static void helloWorld(String firstName, String lastName) {
        System.out.printf(String.format("Hello World from %s %s.\n", firstName, lastName));
    } // end helloWorld

    public static void main(String[] args) {
        String lFirstName = "Robert"; // Define user's first name.
        String lLastName = "Becthold"; // Define user's last name.
        helloWorld(lFirstName, lLastName); // Call the helloWorld() method with the values stored in lFirstName and lLastName.
    } // end main

} // end BectholdHelloWorld