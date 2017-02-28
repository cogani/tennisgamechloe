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

        if (player1.getScoresIndex() >= 3 && player2.getScoresIndex() == 3) {
            return "deuce";
        }
        if (player1.getScoresIndex() < 3 && player2.getScoresIndex() < 3) {
            return player1.getScore() + "," + player2.getScore();
        }
        // Advantage situation
        if (player1.getScoresIndex() >= player2.getScoresIndex() + 1)
            return "Advantage for p1";
        else if (player2.getScoresIndex() >= player1.getScoresIndex() + 1)
            return "Advantage for p2";

        // Advantage situation
        if (player1.getScoresIndex() == player2.getScoresIndex())
            return "deuce";


        else return player1.getScore() + "," + player2.getScore();
    }
}
