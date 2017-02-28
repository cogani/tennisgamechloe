package tennisgame;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by nico on 28/02/17.
 */
public class TennisGameTest {
    @Test
    public void givenBothPlayerWithNoScorePoints_WhenScoreIsQueried_ThenResultWillBeLoveForBoth() {
        String expectedResult = "love,love";
        Player player1 = new Player();
        Player player2 = new Player();
        TennisGame tennisGame = new TennisGame(player1, player2);

        String actualResult = tennisGame.getScore();


        assertEquals(expectedResult, actualResult);
    }

    //  @Test
    public void givenAPlayer1WithScoreThirtyAndPlayer2WithScoreOfLove_WhenScoreIsWinByPlayer1_ThenResultWillBeFortyLove() {
        String expectedResult = "forty,love";
        Player player1 = new Player();
        Player player2 = new Player();
        TennisGame tennisGame = new TennisGame(player1, player2);

        setScore(player1, 3);

        String actualResult = tennisGame.getScore();

        assertEquals(expectedResult, actualResult);
    }

    //@Test
    public void givenAPlayer1WithScoreThirtyAndPlayer1WithScoreOfLove_WhenScoreIsWinByPlayer2_ThenResultWillBeLoveForty() {
        String expectedResult = "love,forty";
        Player player1 = new Player();
        Player player2 = new Player();
        TennisGame tennisGame = new TennisGame(player1, player2);

        setScore(player2, 3);

        String actualResult = tennisGame.getScore();

        assertEquals(expectedResult, actualResult);
    }

    // @Test
    public void givenAPlayerWithScoreForty_WhenScoreIsWinAndGenerateGreaterThanOpposition_ThenResultWillBeAdvantage() {
        String expectedResult = "Advantage for p1";
        Player player1 = new Player();
        Player player2 = new Player();
        TennisGame tennisGame = new TennisGame(player1, player2);

        setScore(player1, 4);

        String actualResult = tennisGame.getScore();

        assertEquals(expectedResult, actualResult);
    }

    // @Test
    public void givenAPlayerWithScoreForty_WhenScoreIsWinAndGenerateGreaterThanOpposition_ThenResultWillBeAdvantage2() {
        String expectedResult = "Advantage for p2";
        Player player1 = new Player();
        Player player2 = new Player();
        TennisGame tennisGame = new TennisGame(player1, player2);

        setScore(player1, 4);
        setScore(player2, 5);

        String actualResult = tennisGame.getScore();

        assertEquals(expectedResult, actualResult);
    }


    @Test
    public void givenAPlayerWithScoreAdvantage_WhenTheOtherOneScore_ThenResultWillBeDeuce() {
        String expectedResult = "deuce";
        Player player1 = new Player();
        Player player2 = new Player();
        TennisGame tennisGame = new TennisGame(player1, player2);

        setScore(player1, 3);
        setScore(player2, 3);

        String actualResult = tennisGame.getScore();

        assertEquals(expectedResult, actualResult);
    }

    @Ignore
    @Test
    public void givenAPlayerWithScoreAdvantage_WhenTheOtherOneScore_ThenResultWillBeDeuce1() {
        String result = "deuce";

        Player player1 = new Player();
        for (int i = 0; i <= 4; i++) {
            player1.score();
        }

        Player player2 = new Player();
        for (int i = 0; i <= 5; i++) {
            player2.score();
        }

        assertEquals("advantage", player2.getScore());

        if (player1.getScore() == player2.getScore())

        {

        }
    }


    private void setScore(Player player, int points) {
        for (int i = 0; i < points; i++) {
            player.score();
        }
    }

}