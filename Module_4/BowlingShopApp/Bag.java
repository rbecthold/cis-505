/*
    Becthold, R. (2021). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.

    Krasso, R. (2021). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.
*/

public class Bag extends Product {

    /**
     * Creating the following private data fields to represent the team's attributes:
     *     type -> represents the Bag's type (i.e., how many balls it can hold)
     */
    private String type;

    /**
     * Constructor method with no arguments
     * @return gives a Bag object with the default values
     */
    public Bag() {
        super();
        this.type = "";
    } // end Bag default constructor

    /**
     * GET method for the 'type' attribute
     * @return type String
     */
    public String getType() {
        return type;
    } // end getType

    /**
     * SET method for the 'type' attribute
     * @param type String
     */
    public void setType(String type) {
        this.type = type;
    } // end setType

    /**
     * Overriding public toString method
     * @return formatted String representation of the Bag's attributes
     */
    @Override
    public String toString() {
        return super.toString()+"\nType: "+type;
    } // end toString

} // end Bag class