/**
 * Citations and comments to come.
 * Need to see results of week 1 assignment first.
 */

 public class Team {

    //Defining Team class attributes
    private String teamName;
    private String[] players;
    private int playerCount;
    
    public Team(String teamName) {
        this.teamName = teamName;
        this.players = new String[20];
        this.playerCount = 0;
    } //end Team() argument constructor

    public void addPlayer(String player) {
        players[playerCount] = player;
        playerCount++;
    } //end addPlayer method

    public String[] getPlayers() {
        return players;
    } //end getPlayers method

    public int getPlayerCount() {
        return playerCount;
    } //end getPlayerCount method

    public String getTeamName() {
        return teamName;
    } //end getTeamName method

 } //end Team class