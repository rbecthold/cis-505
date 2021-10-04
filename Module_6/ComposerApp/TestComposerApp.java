/*
    Becthold, R. (2021). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.

    Krasso, R. (2021). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.
*/

import java.util.Scanner;

public class TestComposerApp {

    public static void main(String[] args) {
        System.out.println("Welcome to the Composer App\n");

        // create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // boolean exit to continue while loop until user prompts to exit at menu
        boolean exit = false;

        // Create new MemComposerDao object for use in while loop
        MemComposerDao memComposerDao = new MemComposerDao();

        while(!exit) {
            // Display menu options and receive input from user
            System.out.print("MENU OPTIONS\n  1. View Composers\n  2. Find Composer\n"
                +"  3. Add Composer\n  4. Exit\n\nPlease choose an option: ");
            String input = sc.next();
            System.out.println();

            switch(input) {
                // View Composers using MemComposerDao findAll() method
                case "1":
                for(Composer composer : memComposerDao.findAll()) {
                    System.out.print(composer.toString()+"\n");
                }
                break;

                // View Composer using MemComposerDao findBy() method
                case "2":
                System.out.print("Enter an id: ");
                // Get ID value to search with
                String idNum = sc.next();
                System.out.print("\n\n--DISPLAYING COMPOSER--\n");
                System.out.print(memComposerDao.findBy(Integer.valueOf(idNum)).toString()+"\n");
                break;

                // Add Composer using MemComposerDao insert() method
                case "3":
                // Get new ID value
                System.out.print("Enter an id: ");
                String newId = sc.next();
                sc.nextLine();
                // Get new Name value
                System.out.print("Enter a name: ");
                String newName = sc.nextLine();
                // Get new Genre value
                System.out.print("Enter a genre: ");
                String newGenre = sc.nextLine();
                System.out.println();
                // Create new Composer object and add to memComposerDao 'composers' List
                memComposerDao.insert(new Composer(Integer.valueOf(newId), newName, newGenre));
                break;

                // Exit from application
                case "4":
                exit = true;
                break;

                // Default case for invalid input
                default:
                System.out.println("  Please choose a valid option from the menu.\n");
                break;
            }
        }
        
        sc.close();

    } // end main
    
} // end TestComposerApp class