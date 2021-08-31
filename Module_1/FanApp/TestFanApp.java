/*
    Becthold, R. (2021). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.
*/

public class TestFanApp {

    public static void main(String[] args) {
        // Initialize a new Fan using the default constructor
        Fan fan1 = new Fan();

        // Initialize a new Fan using the argument constructor
        Fan fan2 = new Fan(Fan.MEDIUM, true, 8.0, "blue");

        // Use the overridden Fan.toString() method to print fan attributes
        System.out.println(fan1.toString()+"\n");
        System.out.println(fan2.toString());
    } // end main

} // end TestFanApp