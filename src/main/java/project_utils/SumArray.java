package project_utils;

public class SumArray {


//    Написать алгоритм SumArray, который возвращает сумму всех чисел массива
//
//    Test Data:
//    {0, 1, 2, 3, 4, 5} → 15
//    {-7, -3} → -10

    public int sumArray(int[] numArray) {
        if (numArray != null) {
            int result = 0;

            for (int i : numArray) {
                result += i;
            }
            return result;
        }
        return 0;
    }
}



