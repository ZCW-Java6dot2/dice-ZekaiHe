
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DiceTest {

    @Test
    // Testing Crap
    void tossAndSumTest() {
        //given
        Dice dice2 = new Dice(2);
        Integer expectedMax = 12;
        Integer expectedMin = 2;
        //when
        Integer toss = dice2.tossAndSum();
        //then
        Assertions.assertTrue(toss<=expectedMax);
        Assertions.assertTrue(toss>=expectedMin);
    }

    @Test
        // Testing Yahtzee
    void tossAndSumTest2() {
        //given
        Dice dice5 = new Dice(5);
        Integer expectedMax = 30;
        Integer expectedMin = 5;
        //when
        Integer toss = dice5.tossAndSum();
        //then
        Assertions.assertTrue(toss<=expectedMax);
        Assertions.assertTrue(toss>=expectedMin);
    }

    @Test
        // Testing getDice
    void getDice() {
        //given
        Dice dice = new Dice(2);
        Integer expected =2;
        //when
        Integer actual = dice.getNumberOfDice();
        //then
        Assertions.assertEquals(expected,actual);
    }
}
