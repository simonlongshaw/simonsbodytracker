package uk.me.longshaw.simonsbodytracker;

        import org.junit.Test;
        import static org.junit.Assert.*;
/**
 * Created by Simon on 9/17/2016.
 */
public class ConvertUnitTest {

    @Test
    public void pound_isCorrect() throws Exception {

        Double result = ConvertUnit.pound(12.6);
        assertEquals((Double) 27.77796, result);
    }

    @Test
    public void printPound_isCorrect() throws Exception {

        String result = ConvertUnit.printPound(12.6);
        assertEquals("27.78 lb", result);
    }

    @Test
    public void printStone_isCorrect() throws Exception {

        String result = ConvertUnit.printStone(83.6);
        assertEquals("13 st 2 lb", result);
    }
}
