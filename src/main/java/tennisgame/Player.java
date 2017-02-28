/**
 * Created by nico on 28/02/17.
 */

package tennisgame;

public class Player {
    private String[] scores = {"love", "fifteen", "thirty", "forty"};


    private int scoresIndex;

    public Player() {
        scoresIndex = 0;
    }

    public String getScore() {
        return scores[scoresIndex];
    }

    public void score() {
        scoresIndex++;
    }

    public int getScoresIndex() {
        return scoresIndex;
    }
}
