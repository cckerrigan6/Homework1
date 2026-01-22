import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class SonnetTest {
    private Sonnet sonnet;
    @BeforeEach //creates a sonnet for each test
    void setSonnet(){
        sonnet = new Sonnet("Let me test to see if my program works with a shorter string");
    }
    @Test //check that getSonnet() returns something (non-null)
    void checkGetSonnetIsNotNull(){
        String test = sonnet.getSonnet();
        assertNotNull(test);
    }
    @Test //test checkWord() if user inputs a correct guess
    void testCheckWordCorrect(){
        sonnet.getSonnet();
        String correctInput = sonnet.randomWord;
        boolean test = sonnet.checkWord(correctInput);
        assertTrue(test);
        assertEquals(1, sonnet.getCorrect());
        assertEquals(0, sonnet.getError());
    }
    @Test //test checkWord() if user inputs an incorrect guess
    void testCheckWordIncorrect(){
        sonnet.getSonnet();
        boolean test = sonnet.checkWord("!!");
        assertFalse(test);
        assertEquals(0, sonnet.getCorrect());
        assertEquals(1, sonnet.getError());
    }
    @Test //test isGameOver() after three correct guesses
    void testIsGameOverThreeCorrect(){
        sonnet.getSonnet();
        String test = sonnet.randomWord;
        sonnet.checkWord(test);
        sonnet.checkWord(test);
        sonnet.checkWord(test);
        assertTrue(sonnet.isGameOver());
    }
    @Test //test isGameOver() after three incorrect guesses
    void testIsGameOverThreeIncorrect(){
        sonnet.getSonnet();
        sonnet.checkWord("!!");
        sonnet.checkWord("!!");
        sonnet.checkWord("!!");
        assertTrue(sonnet.isGameOver());
    }
}