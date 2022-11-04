import org.testng.Assert;
import org.testng.annotations.Test;
import project_utils.ConditionalActions;

public class ConditionalActionsTest {

    @Test

    public void testIsMultipleOf7And9 () {
        int m = 0;
        String expectedResult = "Good Number";

        String actualResult = new ConditionalActions().conditionalActions(m);

        Assert.assertEquals(actualResult,expectedResult);
    }

   @Test
    public void testIsMultipleOf9 () {
        int m = 81;
        String expectedResult = "Bad Number";

        String actualResult = new ConditionalActions().conditionalActions(m);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testIsMultipleOf11 () {
        int m = 121;
        String expectedResult = "Poor Number";

        String actualResult = new ConditionalActions().conditionalActions(m);

        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testNoSatisfyConditions () {
        int m = 15;
        String expectedResult = "-1";

        String actualResult = new ConditionalActions().conditionalActions(m);

        Assert.assertEquals(actualResult,expectedResult);
    }


}



