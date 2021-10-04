/*
    Becthold, R. (2021). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.

    Krasso, R. (2021). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.
*/

public class Composer {

    /**
     * Creating the following private data fields to represent the team's attributes:
     *     id -> represents the Composer object's ID
     *     name -> represents the Composer's name
     *     genre -> represents the Composer's genre
     */
    private Integer id;
    private String name;
    private String genre;

    /**
     * Composer constructor method with 0 arguments
     * @return gives a new Composer object with default attribute values
     */
    public Composer() {
        this(0,"","");
    } // end Composer default constructor

    /**
     * Composer constructor method with 3 arguments
     * @param id Integer
     * @param name String
     * @param genre String
     * @return gives a new Composer object with the specified attribute values
     */
    public Composer(Integer id, String name, String genre) {
        this.id = id;
        this.name = name;
        this.genre = genre;
    } // end Composer argument constructor

    /**
     * GET method for the 'id' attribute
     * @return id Integer
     */
    public Integer getId() {
        return id;
    } // end getId

    /**
     * SET method for the 'id' attribute
     * @param id Integer
     */
    public void setId(Integer id) {
        this.id = id;
    } // end setId

    /**
     * GET method for the 'name' attribute
     * @return name String
     */
    public String getName() {
        return name;
    } // end getName

    /**
     * SET method for the 'name' attribute
     * @param name String
     */
    public void setName(String name) {
        this.name = name;
    } // end setName

    /**
     * GET method for the 'genre' attribute
     * @return genre String
     */
    public String getGenre() {
        return genre;
    } // end getGenre

    /**
     * SET method for the 'genre' attribute
     * @param genre String
     */
    public void setGenre(String genre) {
        this.genre = genre;
    } // end setGenre

    /**
     * Overriding toString method
     * @return gives formatted String output of the Composer's attributes
     */
    @Override
    public String toString() {
        return String.format("ID: %d\nName: %s\nGenre: %s\n", id, name, genre);
    } // end toString

} // end Composer class