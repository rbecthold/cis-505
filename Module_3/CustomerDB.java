/*
    Becthold, R. (2021). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.

    Krasso, R., (2021). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.
*/

public class CustomerDB {

    /**
     * Public getCustomer method, returns a new Customer object with attributes based on 'id' input
     * @param id int
     * @return new Customer object that is default if id does not match, test data if id matches
     */
    public static Customer getCustomer(int id) {
        if(id == 1007) {
            return new Customer("Tom Stanley", "224 Country Ln.", "Omaha", "68144");
        }
        else if(id == 1008) {
            return new Customer("Nicole Jackson", "1423 Pine Rd.", "Atlanta", "30310");
        }
        else if(id == 1009) {
            return new Customer("Jeffrey Nelson", "2241 Maple Dr.", "Dallas", "75087");
        }
        else {
            return new Customer();
        }
    } // end getCustomer
    
} // end CustomerDB class