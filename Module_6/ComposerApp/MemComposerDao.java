/*
    Becthold, R. (2021). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.

    Krasso, R. (2021). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.
*/

import java.util.ArrayList;
import java.util.List;

public class MemComposerDao implements ComposerDao {
    /**
     * Creating the following private data fields to represent the team's attributes:
     *     composers -> represents the ArrayList of Composer objects
     */
    private List<Composer> composers;

    /**
     * MemComposerDao constructor method with 0 arguments
     * @return gives a new MemComposerDao object with a default populated 'composers' List
     */
    public MemComposerDao() {
        composers = new ArrayList<Composer>();
        composers.add(new Composer(1001, "Ludwig van Beethoven", "Classical"));
        composers.add(new Composer(1002, "Johann Sebastian Bach", "Classical"));
        composers.add(new Composer(1003, "Wolfgang Amadeus Mozart", "Classical"));
        composers.add(new Composer(1004, "Johannes Brahms", "Classical"));
        composers.add(new Composer(1005, "Pyotr Ilyich Tchaikovsky", "Classical"));
    } // end MemComposerDao default constructor

    /**
     * Overriding GenericDao findAll method
     * @return composers List<Composer>
     */
    @Override
    public List<Composer> findAll() {
        return composers;
    } // end findAll

    /**
     * Overriding GenericDao findBy method
     * @param id Integer
     * @return composer Composer that matches given 'id', or default Composer
     */
    @Override
    public Composer findBy(Integer id) {
        for(Composer composer : composers) {
            if(composer.getId().equals(id)) {
                return composer;
            }
        }
        return new Composer();
    } // end findBy

    /**
     * Overriding the GenericDao insert method
     * @param composer Composer
     */
    @Override
    public void insert(Composer composer) {
        composers.add(composer);
    } // end insert

} // end MemComposerDao class