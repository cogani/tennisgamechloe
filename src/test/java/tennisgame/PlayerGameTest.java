package tennisgame;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by nico on 28/02/17.
 */
public class PlayerGameTest {

    @Test
    public void givenAPlayerWithNoScorePoints_WhenScoreIsQueried_ThenResultWillBeLove() {
        /**
         A - Arrange
         A - Act
         A - Assert
         */
        String result = "love";
        Player player = new Player("Player");

        // Not Act section

        assertEquals(result, player.getScore());
    }


    @Test
    public void givenAPlayerWithLoveAScorePoint_WhenScoreIsQueried_ThenResultWillBeFifteen() {
        String result = "fifteen";
        Player player = new Player("Player");

        player.score();

        assertEquals(result, player.getScore());
    }

    @Test
    public void givenAPlayerWithFifteenScorePoint_WhenScoreIsQueried_ThenResultWillBeThirty() {
        String result = "thirty";
        Player player = new Player("Player");

        player.score();
        player.score();

        assertEquals(result, player.getScore());
    }

    @Test
    public void givenAPlayerWithThirtyScorePoint_WhenScoreIsQueried_ThenResultWillBeForty() {
        String result = "forty";
        Player player = new Player("Player");

        player.score();
        player.score();
        player.score();

        assertEquals(result, player.getScore());
    }

}