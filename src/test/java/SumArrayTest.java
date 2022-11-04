import org.testng.Assert;
import org.testng.annotations.Test;
import project_utils.SumArray;

import java.lang.reflect.Array;

public class SumArrayTest {
    @Test

    public void testSumArray_HappyPath(){
        int [] numArray = {0, 1, 2, 3, 4, 5};
        int expectedResult = 15;


        int actualResult = new SumArray().sumArray(numArray);
        Assert.assertEquals(actualResult,expectedResult);

    }
    @Test

    public void testNegativeValues(){
        int [] numArray = {-7, -3};
        int expectedResult = -10;


        int actualResult = new SumArray().sumArray(numArray);
        Assert.assertEquals(actualResult,expectedResult);

    }

    @Test

    public void testZeroLengthArray(){
        int [] numArray = {};
        int expectedResult = 0;


        int actualResult = new SumArray().sumArray(numArray);
        Assert.assertEquals(actualResult,expectedResult);

    }

    @Test

    public void testNullArray(){
        int [] numArray = null;
        int expectedResult = 0;


        int actualResult = new SumArray().sumArray(numArray);
        Assert.assertEquals(actualResult,expectedResult);

    }
}
