/*
    Becthold, R. (2021). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.

    Krasso, R. (2021). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.
*/

import java.util.List;

public interface GenericDao<E, K> {

    List<E> findAll();
    E findBy(K key);
    void insert(E entity);
    
} // end GenericDao interface