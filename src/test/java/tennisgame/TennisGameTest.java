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
        String expectedResult = "love, love";
        Player player1 = new Player("Player1");
        Player player2 = new Player("Player2");
        TennisGame tennisGame = new TennisGame(player1, player2);

        String actualResult = tennisGame.getScore();


        assertEquals(expectedResult, actualResult);
    }

    //  @Test
    public void givenAPlayer1WithScoreThirtyAndPlayer2WithScoreOfLove_WhenScoreIsWinByPlayer1_ThenResultWillBeFortyLove() {
        String expectedResult = "forty,love";
        Player player1 = new Player("Player1");
        Player player2 = new Player("Player2");
        TennisGame tennisGame = new TennisGame(player1, player2);

        setScore(player1, 3);

        String actualResult = tennisGame.getScore();

        assertEquals(expectedResult, actualResult);
    }

    //@Test
    public void givenAPlayer1WithScoreThirtyAndPlayer1WithScoreOfLove_WhenScoreIsWinByPlayer2_ThenResultWillBeLoveForty() {
        String expectedResult = "love,forty";
        Player player1 = new Player("Player1");
        Player player2 = new Player("Player2");
        TennisGame tennisGame = new TennisGame(player1, player2);

        setScore(player2, 3);

        String actualResult = tennisGame.getScore();

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void givenPlayer1WithScoreForty_WhenScoreIsWinAndGenerateGreaterThanOpposition_ThenResultWillBeAdvantage() {
        String expectedResult = "Win Player1";
        Player player1 = new Player("Player1");
        Player player2 = new Player("Player2");
        TennisGame tennisGame = new TennisGame(player1, player2);

        setScore(player1, 4);

        String actualResult = tennisGame.getScore();

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void givenPlayer2WithScoreForty_WhenScoreIsWinAndGenerateGreaterThanOpposition_ThenResultWillBeAdvantage() {
        String expectedResult = "Win Player2";
        Player player1 = new Player("Player1");
        Player player2 = new Player("Player2");
        TennisGame tennisGame = new TennisGame(player1, player2);

        setScore(player2, 4);

        String actualResult = tennisGame.getScore();

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void givenAPlayerWithScoreForty_WhenScoreIsWinAndGenerateGreaterThanOpposition_ThenResultWillBeAdvantage2() {
        String expectedResult = "advantage Player2";
        Player player1 = new Player("Player1");
        Player player2 = new Player("Player2");
        TennisGame tennisGame = new TennisGame(player1, player2);

        setScore(player1, 3);
        setScore(player2, 4);

        String actualResult = tennisGame.getScore();

        assertEquals(expectedResult, actualResult);
    }


    @Test
    public void givenAPlayerWithScoreAdvantage_WhenTheSameOneScoreAPoint_ThenThisPlayerWins() {
        String expectedResult = "Player1 won";
        Player player1 = new Player("Player1");
        Player player2 = new Player("Player2");
        TennisGame tennisGame = new TennisGame(player1, player2);

        setScore(player1, 5);
        setScore(player2, 3);

        String actualResult = tennisGame.getScore();

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void givenAPlayerWithScoreAdvantage_WhenTheOtherOneScore_ThenResultWillBeDeuce() {
        String expectedResult = "deuce";
        Player player1 = new Player("Player1");
        Player player2 = new Player("Player2");
        TennisGame tennisGame = new TennisGame(player1, player2);

        setScore(player1, 3);
        setScore(player2, 3);

        String actualResult = tennisGame.getScore();

        assertEquals(expectedResult, actualResult);
    }


    private void setScore(Player player, int points) {
        for (int i = 0; i < points; i++) {
            player.score();
        }
    }

}