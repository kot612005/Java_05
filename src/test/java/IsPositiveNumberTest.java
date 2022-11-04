import org.testng.Assert;
import org.testng.annotations.Test;
import project_utils.BiggerValue;
import project_utils.IsPositiveNumber;

public class IsPositiveNumberTest {

    @Test

    public void testIsPositiveNumber_HappyPath() {
        int number = 555;

        boolean expectedResult = true;


        boolean actualResult = new IsPositiveNumber().isPositiveNumber(number);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test

    public void testIsNegativeNumber_HappyPath() {
        int number = -555;

        boolean expectedResult = false;


        boolean actualResult = new IsPositiveNumber().isPositiveNumber(number);

        Assert.assertEquals(actualResult,expectedResult);
    }

@Test
    public void testIsZeroNumber_HappyPath() {
        int number = 0;

        boolean expectedResult = true;


        boolean actualResult = new IsPositiveNumber().isPositiveNumber(number);

        Assert.assertEquals(actualResult,expectedResult);
    }

}


