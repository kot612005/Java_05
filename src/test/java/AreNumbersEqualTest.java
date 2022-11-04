import org.testng.Assert;
import org.testng.annotations.Test;
import project_utils.AreNumbersEqual;


public class AreNumbersEqualTest {

    @Test
    public void testAreNumbersEqual_HappyPath() {

       int expectedResult = 0;

       int actualResult = new AreNumbersEqual().areNumbersEqual(89,89);

       Assert.assertEquals(actualResult,expectedResult);


    }

    @Test
    public void testAreNumbersEqualFirstNegative() {

        int expectedResult = -1;

        int actualResult = new AreNumbersEqual().areNumbersEqual(-89,89);

        Assert.assertEquals(actualResult,expectedResult);


    }

    @Test
    public void testAreNumbersEqualSecondNegative() {

        int expectedResult = 1;

        int actualResult = new AreNumbersEqual().areNumbersEqual(89,-89);

        Assert.assertEquals(actualResult,expectedResult);


    }

    @Test
    public void testAreNumbersEqualBothNegative() {

        int expectedResult = 0;

        int actualResult = new AreNumbersEqual().areNumbersEqual(-89,-89);

        Assert.assertEquals(actualResult,expectedResult);


    }
}

