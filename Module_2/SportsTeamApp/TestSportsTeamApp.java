/*
    Becthold, R. (2021). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.

    Krasso, R., (2021). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.

    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
    Comprehensive Version (12th ed.). Pearson Education, Inc.
*/

import java.util.Scanner;

public class TestSportsTeamApp {
    
    public static void main(String[] args) {

        // Initialize a new Scanner object for user input
        Scanner input = new Scanner(System.in);

        System.out.println("\n  Welcome to the Sports Team App\n");

        // while loop for adding multiple Teams
        char continueDecision = 'y';
        while(continueDecision == 'y') {

            // get user input for teamName
            System.out.print("  Enter a team name: ");
            String teamName = input.nextLine();

            // get user input for player names array
            System.out.println("\n  Enter the player names:");
            System.out.print("    hint: use commas for multiple players; no spaces>: ");
            String players = input.nextLine();

            // Initialize new Team object using the given attributes
            Team team = new Team(teamName);
            String[] names = players.split(",");
            for(int nameIndex = 0; nameIndex < names.length; nameIndex++) {
                team.addPlayer(names[nameIndex]);
            }

            // Print summary of Team information to console
            System.out.println("\n  --Team Summary--");
            System.out.printf("  Team name: %s\n", team.getTeamName());
            System.out.printf("  Number of players in team: %d\n", team.getPlayerCount());
            System.out.print("  Players on team: ");
            for(int playerIndex = 0; playerIndex < team.getPlayerCount(); playerIndex++) {
                System.out.print(team.getPlayers()[playerIndex]);
                if(playerIndex + 1 < team.getPlayerCount()) {
                    System.out.print(",");
                }
                else {
                    System.out.println("\n");
                }
            }

            // Ask user whether more Team objects need to be created
            System.out.print("  Continue? (y/n): ");
            continueDecision = input.nextLine().charAt(0);

            // Loop again for a new team or break from the loop
            if(continueDecision == 'y') {
                System.out.println();
            }
            else {
                System.out.println("\n\n  End of line...");
            }
        }

        // Close and release input Scanner object
        input.close();

    }// end main

} //end TestSportsTeamApp