/**
 * Created by nico on 28/02/17.
 */

package tennisgame;

public class Player {
    private final String name;
    private String[] scores = {"love", "fifteen", "thirty", "forty"};

    private int scoresIndex;

    public Player(String name) {
        this.name = name;
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

    public String getName() {
        return name;
    }
}
