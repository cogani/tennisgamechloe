package tennisgame;

/**
 * Created by nico on 28/02/17.
 */
public class TennisGame {

    private final Player player1;
    private final Player player2;

    public TennisGame(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public String getScore() {
        if (player1.getScoresIndex() >= 3 && player2.getScoresIndex() >= 3) {
            if (Math.abs(player2.getScoresIndex() - player1.getScoresIndex()) >= 2) {
                return getLeadPlayer().getName() + " won";
            } else if (player1.getScoresIndex() == player2.getScoresIndex()) {
                return "deuce";
            } else {
                return "advantage " + getLeadPlayer().getName();
            }
        } else {
            if (Math.abs(player2.getScoresIndex() - player1.getScoresIndex()) >= 2) {
                return "Win " + getLeadPlayer().getName();
            } else {
                return player1.getScore() + ", " + player2.getScore();
            }
        }
    }

    public Player getLeadPlayer() {
        return (player1.getScoresIndex() > player2.getScoresIndex()) ? player1 : player2;
    }

}
