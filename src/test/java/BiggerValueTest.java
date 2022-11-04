import org.testng.Assert;
import org.testng.annotations.Test;
import project_utils.BiggerValue;
import project_utils.SumArray;

public class BiggerValueTest {

    @Test

    public void testBiggerValue_HappyPath(){
        int a = 3333;
        int b = 9999;
        int expectedResult = 9999;


        int actualResult = new BiggerValue().biggerValue(a,b);

        Assert.assertEquals(actualResult,expectedResult);

    }

}
