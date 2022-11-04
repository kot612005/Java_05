import org.testng.Assert;
import org.testng.annotations.Test;
import project_utils.OddIndices;

public class OddIndicesTest {

   // Написать алгоритм OddIndices, который принимает массив целых чисел,
    // и возвращает массив значений нечетных индексов
    //Test Data:
    //Input = {-45, 590, 234, 985, 12, 68}
    //Expected Result =  {590, 985, 68}

    @Test
    public void testArrayOddIndices_HappyPath(){
        int [] array = {-45, 590, 234, 985, 12, 68};
        int [] expectedResult = {590, 985, 68};


        int [] actualResult = new OddIndices().oddIndices(array);

        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void testArrayOddIndices_Empty(){
        int [] array = {};
        int [] expectedResult = {};


        int [] actualResult = new OddIndices().oddIndices(array);

        Assert.assertEquals(actualResult, expectedResult);

    }
    @Test
    public void testArrayOddIndices_Null() {
        int[] array = null;
        int[] expectedResult = {};


        int[] actualResult = new OddIndices().oddIndices(array);

        Assert.assertEquals(actualResult, expectedResult);

    }
    @Test
    public void testArrayOddIndices_Try(){
        int [] array = {0, 1, 2, 3, 4, 5, 6};
        int [] expectedResult = {1, 3, 5};


        int [] actualResult = new OddIndices().oddIndices(array);

        Assert.assertEquals(actualResult, expectedResult);

    }

}
