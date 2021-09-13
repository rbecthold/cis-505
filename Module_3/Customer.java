/*
    Becthold, R. (2021). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.

    Krasso, R., (2021). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.
*/

public class Customer {
    
    /**
     * Creating the following private data fields to represent the team's attributes:
     *     name     -> represents the Customer's name
     *     address  -> represents the Customer's street address
     *     city     -> represents the Customer's city of residence
     *     zip      -> represents the Customer's ZIP code
     */
    private String name;
    private String address;
    private String city;
    private String zip;


    /**
     * Constructor method with no arguments, which returns a Customer object with the default (null) attributes.
     * @return gives a Customer object with default values
     */
    public Customer() {
    } // end Customer default constructor

    /**
     * Constructor method with 4 arguments, which returns a Customer object with the given attributes.
     * @param name String
     * @param address String
     * @param city String
     * @param zip String
     * @return gives a Customer object with the specified attributes
     */
    public Customer(String name, String address, String city, String zip) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.zip = zip;
    } // end Customer argument constructor


    /**
     * GET method for the 'name' attribute
     * @return name String
     */
    public String getName() {
        return name;
    } // end getName

    /**
     * GET method for the 'address' attribute
     * @return address String
     */
    public String getAddress() {
        return address;
    } // end getAddress

    /**
     * GET method for the 'city' attribute
     * @return city String
     */
    public String getCity() {
        return city;
    } // end getCity

    /**
     * GET method for the 'zip' attribute
     * @return zip String
     */
    public String getZip() {
        return zip;
    } // end getZip


    /**
     * Overriding public toString method
     * @param customer Customer
     * @return formatted String representation of the customer attributes
     */
    @Override
    public String toString() {
        return "--Customer Details--\nName: " + this.name + "\nAddress: " + this.address
        + "\nCity: " + this.city + "\nZip: " + this.zip + "\n";
    } // end toString

} // end Customer class