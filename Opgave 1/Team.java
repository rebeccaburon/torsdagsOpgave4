public class Team {
    private String teamName;
    private int rank;
    private String playerName;

    public Team(String teamName, int rank, String playerName) {
        this.teamName = teamName;
        this.rank = rank;
        this.playerName = playerName;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Team: " + teamName + " Rank: " + rank + " Player name: " + playerName;
    }
}