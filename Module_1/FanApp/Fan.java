/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
        Comprehensive Version (12th ed.). Pearson Education, Inc.

    Becthold, R. (2021). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.
*/



public class Fan {

    // Define int constant values to represent fan speeds.
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    /**
     * Creating the following private data fields to represent the fan's attributes:
     *     speed  -> represents the current speed of the fan
     *     on     -> represents the current power status of the fan
     *     radius -> represents the radius of the fan
     *     color  -> represents the color of the fan
     */
    private int speed;
    private boolean on;
    private double radius;
    private String color;





    /**
     * GET method for the 'speed' attribute
     * @return Returns the current value of the 'speed' attribute.
     */
    public int getSpeed() {
        return speed;
    } // end getSpeed

    /**
     * SET method for the 'speed' attribute
     * @param newSpeed int
     */
    public void setSpeed(int newSpeed) {
        if(newSpeed >= 0 && newSpeed <= 3) {
            speed = newSpeed;
        }
        else {
            speed = STOPPED;
        }
    } // end setSpeed

    /**
     * GET method for the 'on' attribute
     * @return Returns the current value of the 'on' attribute.
     */
    public boolean getOn() {
        return on;
    } // end getOn

    /**
     * SET method for the 'on' attribute
     * @param newOn boolean
     */
    public void setOn(boolean newOn) {
        on = newOn;
    } // end setOn

    /**
     * GET method for the 'radius' attribute
     * @return Returns the current value of the 'radius' attribute.
     */
    public double getRadius() {
        return radius;
    } // end getRadius

    /**
     * SET method for the 'radius' attribute
     * @param newRadius double
     */
    public void setRadius(double newRadius) {
        if(newRadius > 0.0) {
            radius = newRadius;
        }
    } // end setRadius

    /**
     * GET method for the 'color' attribute
     * @return Returns the current value of the 'color' attribute.
     */
    public String getColor() {
        return color;
    } // end getColor

    /**
     * SET method for the 'color' attribute
     * @param newColor String
     */
    public void setColor(String newColor) {
        color = newColor;
    } // end setColor





    /**
     * Constructor method with no arguments, which returns a default Fan object.
     * @return gives a Fan object with the following attributes
     *     speed = STOPPED
     *     on = false
     *     radius = 6.0
     *     color = "white"
     */
    public Fan() {
        speed = STOPPED;
        on = false;
        radius = 6.0;
        color = "white";
    } // end Fan default constructor

    /**
     * Constructor method with 4 arguments, which returns a Fan object with the given attributes.
     * @param speed int -> [STOPPED:0, SLOW:1, MEDIUM:2, FAST:3]
     * @param on boolean
     * @param radius double
     * @param color String
     * @return gives a Fan object with the specified attributes
     */
    public Fan(int newSpeed, boolean newOn, double newRadius, String newColor) {
        // Set 'speed' attribute to input value with logic to catch invalid speeds.
        if(newSpeed >= 0 && newSpeed <= 3) {
            speed = newSpeed;
        }
        else {
            speed = STOPPED;
        }

        // Set 'radius' attribute to input value with logic to catch invalid radii.
        if(newRadius > 0) {
            radius = newRadius;
        }
        else {
            radius = 6.0;
        }

        // Set 'on' attribute to input value.
        on = newOn;

        // Set 'color' attribute to input value.
        color = newColor;
    } // end Fan argument constructor


    /**
     * Overriding public toString() method
     * @return String displaying fan attributes in an easily-readable manner.
     */
    @Override
    public String toString() {
        // if on == true, print attributes in the following format:
        if(on) {
            return "The fan speed is set to " + String.valueOf(speed)
                + " with a color of " + color + " and a radius of " + String.valueOf(radius) + ".";
        }

        // if on != true, print attributes in the following format:
        else {
            return "The fan is " + color + " with a radius of "
                + String.valueOf(radius) + " and the fan is off.";
        }
    } // end toString override

} // end Fan