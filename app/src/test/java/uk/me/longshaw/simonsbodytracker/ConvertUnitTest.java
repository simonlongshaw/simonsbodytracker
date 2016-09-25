package uk.me.longshaw.simonsbodytracker;

        import junit.framework.Assert;

        import org.junit.Test;
        import static org.junit.Assert.*;
/**
 * Created by Simon on 9/17/2016.
 */
public class ConvertUnitTest {

    //region kgToPound
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
    public void kgToPound_isCorrect_with_null() {
        // Arrange
        try
        {
            // Act
            ConvertUnit.kgToPound(null);
            Assert.fail("Should have thrown Illegal Argument exception");
        }
        catch(IllegalArgumentException  e)
        {
            // Assert
        }
    }

    @Test
    public void kgToPound_isCorrect_with_NaN() {
        // Arrange
        try
        {
            // Act
            ConvertUnit.kgToPound(Double.NaN);
            Assert.fail("Should have thrown Illegal Argument exception");
        }
        catch(IllegalArgumentException  e)
        {
            // Assert
        }
    }

    @Test
    public void kgToPound_limited_to_400kg_green() {
        // Arrange
        Double expectedResult = 881.8399779540001;

        // Act
        Double result = ConvertUnit.kgToPound(399.99999);

        // Assert
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void kgToPound_limited_to_400kg_red() {
        // Arrange
        try
        {
            // Act
            ConvertUnit.kgToPound(400.0);
            Assert.fail("Should have thrown Illegal Argument exception");
        }
        catch(IllegalArgumentException  e)
        {
            // Assert
        }
    }

    @Test
    public void kgToPound_limited_to_0kg_red() {
        // Arrange
        try
        {
            // Act
            ConvertUnit.kgToPound(-0.01);
            Assert.fail("Should have thrown Illegal Argument exception");
        }
        catch(IllegalArgumentException  e)
        {
            // Assert
        }
    }

    //endregion

    //region poundToKg
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
    public void poundToKg_isCorrect_with_0() {
        // Arrange
        Double expectedResult = 0.0;

        // Act
        Double result = ConvertUnit.poundToKg(0.0);

        // Assert
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void poundToKg_isCorrect_with_null() {
        // Arrange
        try
        {
            // Act
            ConvertUnit.poundToKg(null);
            Assert.fail("Should have thrown Illegal Argument exception");
        }
        catch(IllegalArgumentException  e)
        {
            // Assert
        }
    }
    @Test
    public void poundToKg_isCorrect_with_NaN() {
        // Arrange
        try
        {
            // Act
            ConvertUnit.poundToKg(Double.NaN);
            Assert.fail("Should have thrown Illegal Argument exception");
        }
        catch(IllegalArgumentException  e)
        {
            // Assert
        }
    }

    @Test
    public void poundToKg_limited_to_880lb_green() {
        // Arrange
        Double expectedResult = 399.16533611539506;

        // Act
        Double result = ConvertUnit.poundToKg(879.9999);

        // Assert
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void poundToKg_limited_to_880lb_red() {
        // Arrange
        try
        {
            // Act
            ConvertUnit.poundToKg(880.0);
            Assert.fail("Should have thrown Illegal Argument exception");
        }
        catch(IllegalArgumentException  e)
        {
            // Assert
        }
    }

    @Test
    public void poundToKg_limited_to_0kg_red() {
        // Arrange
        try
        {
            // Act
            ConvertUnit.poundToKg(-0.01);
            Assert.fail("Should have thrown Illegal Argument exception");
        }
        catch(IllegalArgumentException  e)
        {
            // Assert
        }
    }
    //endregion poundToKg

    //region stoneToPound
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
    public void stoneToPound_isCorrect_with_0() {
        // Arrange
        Double expectedResult = 0.0;

        // Act
        Double result = ConvertUnit.stoneToPound(0.0);

        // Assert
        Assert.assertEquals(expectedResult, result);
    }
    @Test
    public void stoneToPound_isCorrect_with_null() {
        // Arrange
        try
        {
            // Act
            ConvertUnit.stoneToPound(null);
            Assert.fail("Should have thrown Illegal Argument exception");
        }
        catch(IllegalArgumentException  e)
        {
            // Assert
        }
    }
    @Test
    public void stoneToPound_isCorrect_with_NaN() {
        // Arrange
        try
        {
            // Act
            ConvertUnit.stoneToPound(Double.NaN);
            Assert.fail("Should have thrown Illegal Argument exception");
        }
        catch(IllegalArgumentException  e)
        {
            // Assert
        }
    }
    @Test
    public void stoneToPound_limited_to_63st_green() {
        // Arrange
        Double expectedResult = 881.9985999999999;

        // Act
        Double result = ConvertUnit.stoneToPound(62.9999);

        // Assert
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void stoneToPound_limited_to_63st_red() {
        // Arrange
        try
        {
            // Act
            ConvertUnit.stoneToPound(63.0);
            Assert.fail("Should have thrown Illegal Argument exception");
        }
        catch(IllegalArgumentException  e)
        {
            // Assert
        }
    }

    @Test
    public void stoneToPound_limited_to_0kg_red() {
        // Arrange
        try
        {
            // Act
            ConvertUnit.stoneToPound(-0.01);
            Assert.fail("Should have thrown Illegal Argument exception");
        }
        catch(IllegalArgumentException  e)
        {
            // Assert
        }
    }
    //endregion stoneToPound

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
    public void poundToStone_isCorrect_with_0() {
        // Arrange
        Double expectedResult = 0.0;

        // Act
        Double result = ConvertUnit.poundToStone(0.0);

        // Assert
        Assert.assertEquals(expectedResult, result);
    }
    @Test
    public void poundToStone_isCorrect_with_null() {
        // Arrange
        try
        {
            // Act
            ConvertUnit.poundToStone(null);
            Assert.fail("Should have thrown Illegal Argument exception");
        }
        catch(IllegalArgumentException  e)
        {
            // Assert
        }
    }
    @Test
    public void poundToStone_isCorrect_with_NaN() {
        // Arrange
        try
        {
            // Act
            ConvertUnit.poundToStone(Double.NaN);
            Assert.fail("Should have thrown Illegal Argument exception");
        }
        catch(IllegalArgumentException  e)
        {
            // Assert
        }
    }

    @Test
    public void poundToStone_limited_to_880lb_green() {
        // Arrange
        Double expectedResult = 62.85713571428572;

        // Act
        Double result = ConvertUnit.poundToStone(879.9999);

        // Assert
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void poundToStone_limited_to_880lb_red() {
        // Arrange
        try
        {
            // Act
            ConvertUnit.poundToStone(880.0);
            Assert.fail("Should have thrown Illegal Argument exception");
        }
        catch(IllegalArgumentException  e)
        {
            // Assert
        }
    }

    @Test
    public void poundToStone_limited_to_0kg_red() {
        // Arrange
        try
        {
            // Act
            ConvertUnit.poundToStone(-0.01);
            Assert.fail("Should have thrown Illegal Argument exception");
        }
        catch(IllegalArgumentException  e)
        {
            // Assert
        }
    }

    //region StonesAndPoundsToPounds
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
    public void StonesAndPoundsToPounds_isCorrect_with_0() {
        // Arrange
        Double expectedResult = 0.0;

        // Act
        Double result = ConvertUnit.StonesAndPoundsToPounds("0 0");

        // Assert
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void StonesAndPoundsToPounds_isCorrect_with_0_0() {
        // Arrange
        Double expectedResult = 0.0;

        // Act
        Double result = ConvertUnit.StonesAndPoundsToPounds("0 0.0");

        // Assert
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void StonesAndPoundsToPounds_lb_cannot_be_over_14() {
        // Arrange
        try
        {
            // Act
            Double result = ConvertUnit.StonesAndPoundsToPounds("1 14.0");
            Assert.fail("Should have thrown Illegal Argument exception");
        }
        catch(IllegalArgumentException  e)
        {
            // Assert
        }
    }


    @Test
    public void StonesAndPoundsToPounds_limited_to_64st_green() {
        // Arrange
        Double expectedResult = 881.9999;

        // Act
        Double result = ConvertUnit.StonesAndPoundsToPounds("62 13.9999");

        // Assert
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void StonesAndPoundsToPounds_limited_to64st_red() {
        // Arrange
        try
        {
            // Act
            Double result = ConvertUnit.StonesAndPoundsToPounds("64 0.0");
            Assert.fail("Should have thrown Illegal Argument exception");
        }
        catch(IllegalArgumentException  e)
        {
            // Assert
        }
    }

    @Test
    public void StonesAndPoundsToPounds_limited_to_0kg_red() {
        // Arrange
        try
        {
            // Act
            ConvertUnit.StonesAndPoundsToPounds("-0 0.0001");
            Assert.fail("Should have thrown Illegal Argument exception");
        }
        catch(IllegalArgumentException  e)
        {
            // Assert
        }
    }
    //endregion StonesAndPoundsToPounds
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
