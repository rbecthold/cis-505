/*
    Becthold, R. (2021). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.

    Krasso, R. (2021). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.
*/

public class Product {
    
    /**
     * Creating the following private data fields to represent the team's attributes:
     *     code -> represents the Product's id code
     *     description -> represents the Product's description
     *     price -> represents the Product's price
     */
    private String code;
    private String description;
    private double price;

    /**
     * Constructor method with no arguments.
     * @return gives a Product object with default values
     */
    public Product() {
        this.code = "";
        this.description = "";
        this.price = 0.0;
    } // end Product default constructor

    /**
     * GET method for the 'code' attribute
     * @return code String
     */
    public String getCode() {
        return code;
    } // end getCode

    /**
     * SET method for the 'code' attribute
     * @param code String
     */
    public void setCode(String code) {
        this.code = code;
    } // end setCode

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
     * GET method for the 'price' attribute
     * @return price double
     */
    public double getPrice() {
        return price;
    } // end getPrice

    /**
     * SET method for the 'price' attribute
     * @param price double
     */
    public void setPrice(double price) {
        this.price = price;
    } // end setPrice

    /**
     * Overriding public toString method
     * @return formatted String representation of the Product's attributes
     */
    @Override
    public String toString() {
        return "Product Code: "+code+"\nDescription: "+description+"\nPrice: $ "+String.valueOf(price);
    } // end toString

} // end Product class