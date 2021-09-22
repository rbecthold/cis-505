/*
    Becthold, R. (2021). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.

    Krasso, R. (2021). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.
*/


public class Ball extends Product {
    
    /**
     * Creating the following private data fields to represent the team's attributes:
     *     color -> represents the Ball's color
     */
    private String color;

    /**
     * Constructor method with no arguments
     * @return gives a Ball object with the default values
     */
    public Ball() {
        super();
        this.color = "";
    } // end Ball default constructor

    /**
     * GET method for the 'color' attribute
     * @return color String
     */
    public String getColor() {
        return color;
    } // end getColor

    /**
     * SET method for the 'color' attribute
     * @param color String
     */
    public void setColor(String color) {
        this.color = color;
    } // end setColor

    /**
     * Overriding public toString method
     * @return formatted String representation of the Ball's attributes
     */
    @Override
    public String toString() {
        return super.toString()+"\nColor: "+color;
    } // end toString

} // end Ball class