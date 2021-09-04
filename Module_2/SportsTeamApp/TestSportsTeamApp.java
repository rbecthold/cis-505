/**
 * Citations and comments to come.
 * Need to see results of week 1 assignment first.
 */

import java.util.Scanner;

public class TestSportsTeamApp {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n  Welcome to the Sports Team App\n");
        System.out.print("  Enter a team name: ");
        String teamName = input.nextLine();

        System.out.println("\n  Enter the player names:");
        System.out.print("    hint: use commas for multiple players; no spaces>: ");
        String players = input.nextLine();

        Team team = new Team(teamName);
        String[] names = players.split(",");
        for(int i = 0; i < names.length; i++) {
            team.addPlayer(names[i]);
        }

        System.out.println("\n  --Team Summary--");
        System.out.printf("  Team name: %s\n", team.getTeamName());
        System.out.printf("  Number of players in team: %d\n", team.getPlayerCount());
        System.out.print("  Players on team: ");
        for(int i = 0; i < team.getPlayerCount(); i++) {
            System.out.print(team.getPlayers()[i]);
            if(i+1 < team.getPlayerCount()) {
                System.out.print(",");
            }
            else {
                System.out.println("\n");
            }
        }

        /*
        TODO: Add in functionality to make the code loop so you can add (& display) multiple teams
        */

        input.close();
    }

} //end TestSportsTeamApp