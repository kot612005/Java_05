import org.testng.Assert;
import org.testng.annotations.Test;
import project_utils.StringMethods;

public class StringMethodsTest {

    @Test
    public void testCountAs_HappyPath () {
        String text = "Abracadabra";
        String expectedResult = "5, 6";

        String actualResult = new StringMethods().countAs2(text);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCountAs_HappyPath_2 () {
        String text = "Homenum Revelio";
        String expectedResult = "0, 15";

        String actualResult = new StringMethods().countAs2(text);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCountAs_HappyPath_3 () {
        String text = "3 tarAmasAlatA";
        String expectedResult = "6, 8";

        String actualResult = new StringMethods().countAs2(text);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCountAs_Negative () {
        String text = "";
        String expectedResult = "Invalid value";

        String actualResult = new StringMethods().countAs2(text);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCountAs_StringIsNull_Negative () {
        String text = null;
        String expectedResult = "null";

        String actualResult = new StringMethods().countAs2(text);

        Assert.assertEquals(actualResult, expectedResult);
    }

}
