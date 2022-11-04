import org.testng.Assert;
import org.testng.annotations.Test;
import project_utils.OddEven;

public class OddEveTest {

    @Test
    public void testZeroNumber_HappyPath(){
        int number = 0;
        String expectedResult = "Even";

        String actualResult = new OddEven().oddEven(number);

        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void testEvenNumber_HappyPath(){
        int number = 222222;
        String expectedResult = "Even";

        String actualResult = new OddEven().oddEven(number);

        Assert.assertEquals(actualResult, expectedResult);

    }
    @Test
    public void testOddNumber_HappyPath(){
        int number = -345;
        String expectedResult = "Odd";

        String actualResult = new OddEven().oddEven(number);

        Assert.assertEquals(actualResult, expectedResult);

    }
    @Test
    public void testGreaterThanIntegerMax_Negative(){
        long number = Integer.MAX_VALUE + 1L;
        String expectedResult = "Undefined";

        String actualResult = new OddEven().oddEven(number);

        Assert.assertEquals(actualResult, expectedResult);

    }

}
