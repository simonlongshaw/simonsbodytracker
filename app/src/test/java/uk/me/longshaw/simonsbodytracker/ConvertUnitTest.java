package uk.me.longshaw.simonsbodytracker;

        import junit.framework.Assert;

        import org.junit.Test;
        import static org.junit.Assert.*;
/**
 * Created by Simon on 9/17/2016.
 */
public class ConvertUnitTest {

    @Test
    public void kgToPound_isCorrect() {
        // Arrange
        Double expectedResult = 27.77796;

        // Act
        Double result = ConvertUnit.kgToPound(12.6);

        // Assert
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void kgToPound_isCorrect_with_0() {
        // Arrange
        Double expectedResult = 0.0;

        // Act
        Double result = ConvertUnit.kgToPound(0.0);

        // Assert
        Assert.assertEquals(expectedResult, result);
}

    @Test
    public void poundToKg_isCorrect() {
        // Arrange
        Double expectedResult = 12.5646375759775;

        // Act
        Double result = ConvertUnit.poundToKg(27.7);

        // Assert
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void kgToPoundToKg_isCorrect() {
        // Arrange
        Double expectedResult = 12.6;

        // Act
        Double pound = ConvertUnit.kgToPound(expectedResult);
        Double result = ConvertUnit.poundToKg(pound);

        // Assert
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void poundToKgToPound_isCorrect() {
        // Arrange
        Double expectedResult = 27.699999999999996;

        // Act
        Double kg = ConvertUnit.poundToKg(expectedResult);
        Double result = ConvertUnit.kgToPound(kg);

        // Assert
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void stoneToPound_isCorrect() {
        // Arrange
        Double expectedResult = 259.0;

        // Act
        Double result = ConvertUnit.stoneToPound(18.5);

        // Assert
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void stoneToPound_null_isCorrect() {
        // Arrange
        try
        {
            // Act
            ConvertUnit.stoneToPound(null);
            Assert.fail("Should have thrown Arithmetic exception");
        }
        catch(ArithmeticException e)
        {
            // Assert
        }
    }


    @Test
    public void stoneToPound_NaN_isCorrect() {
        // Arrange
        try
        {
            // Act
            ConvertUnit.stoneToPound(Double.NaN);
            Assert.fail("Should have thrown Arithmetic exception");
        }
        catch(ArithmeticException e)
        {
            // Assert
        }
    }

    @Test
    public void poundToStone_isCorrect() {
        // Arrange
        Double expectedResult = 18.5;

        // Act
        Double result = ConvertUnit.poundToStone(259.0);

        // Assert
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void StonesAndPoundsToPounds_isCorrect() {
        // Arrange
        Double expectedResult = 259.5;

        // Act
        Double result = ConvertUnit.StonesAndPoundsToPounds("18 7.5");

        // Assert
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void StonesAndPoundsToPounds_noStone_isCorrect() {
        // Arrange
        Double expectedResult = 7.5;

        // Act
        Double result = ConvertUnit.StonesAndPoundsToPounds("0 7.5");

        // Assert
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void StonesAndPoundsToPounds_invalid_isCorrect() {
        // Arrange
        try
        {
            // Act
            ConvertUnit.StonesAndPoundsToPounds("what!");
            Assert.fail("Should have thrown Illegal Argument exception");
        }
        catch(IllegalArgumentException  e)
        {
            // Assert
        }
    }

    @Test
    public void cmToInchDec_isCorrect() {
        // Arrange
        Double expectedResult = 9.842519685;

        // Act
        Double result = ConvertUnit.cmToInchDec(25.0);

        // Assert
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void printPound_isCorrect() {
        // Arrange
        String expectedResult = "27.8 lb";

        // Act
        String result = ConvertUnit.printPound(12.6);

        // Assert
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void printStone_isCorrect() {
        // Arrange
        String expectedResult = "13 st 2.3 lb";

        // Act
        String result = ConvertUnit.printStone(83.6);

        // Assert
        Assert.assertEquals(expectedResult, result);
    }
}
