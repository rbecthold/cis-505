/*
    Becthold, R. (2021). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.

    Krasso, R., (2021). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.
*/

 public class Team {

    /**
     * Creating the following private data fields to represent the team's attributes:
     *     teamName    -> represents the name of the team
     *     players     -> represents the names of the team's players
     *     playerCount -> represents the number of players on the team
     */
    private String teamName;
    private String[] players;
    private int playerCount;
    
    /**
     * Constructor method with 1 argument, which returns a Fan object with the given attributes.
     * @param teamName String
     * @return gives a Team object with the specified name
     */
    public Team(String teamName) {
        this.teamName = teamName;
        this.players = new String[20];
        this.playerCount = 0;
    } //end Team() argument constructor

    /**
     * GET method for the 'players' attribute
     * @return Returns the current value of the 'players' attribute.
     */
    public String[] getPlayers() {
        return players;
    } //end getPlayers method

    /**
     * GET method for the 'playerCount' attribute
     * @return Returns the current value of the 'playerCount' attribute.
     */
    public int getPlayerCount() {
        return playerCount;
    } //end getPlayerCount method

    /**
     * GET method for the 'teamName' attribute
     * @return Returns the current value of the 'teamName' attribute.
     */
    public String getTeamName() {
        return teamName;
    } //end getTeamName method

    /**
     * Void addPlayer method, appends the String player name to the 'players' array.
     * @param player
     */
    public void addPlayer(String player) {
        players[playerCount] = player;
        playerCount++;
    } //end addPlayer method

 } //end Team class