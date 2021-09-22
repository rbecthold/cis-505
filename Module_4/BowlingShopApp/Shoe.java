/*
    Becthold, R. (2021). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.

    Krasso, R. (2021). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.
*/

public class Shoe extends Product {
    /**
     * Creating the following private data fields to represent the team's attributes:
     *     size -> represents the Shoe's size
     */
    private double size;

    /**
     * Constructor method with no arguments
     * @return gives a Shoe object with the default values
     */
    public Shoe() {
        super();
        this.size = 0.0;
    } // end Shoe default constructor

    /**
     * GET method for the 'size' attribute
     * @return size double
     */
    public double getSize() {
        return size;
    } // end getSize

    /**
     * SET method for the 'size' attribute
     * @param size double
     */
    public void setSize(double size) {
        this.size = size;
    } // end setSize

    /**
     * Overriding public toString method
     * @return formatted String representation of the Shoe's attributes
     */
    @Override
    public String toString() {
        return super.toString()+"\nSize: "+String.valueOf(size);
    } // end toString

} // end Shoe class