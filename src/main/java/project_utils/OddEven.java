package project_utils;

public class OddEven {

    //В классе OddEven создать алгоритм oddEven(), который принимает на вход целое число,
    // возвращает “Odd”,  если число нечетное, и “Even”, если число четное.
    //
    //Test Data:
    //-345 →  “Odd”
    //0 →  “Even”
    //222222 →  “Even”

    public String oddEven(long number) {
        String even = "Even";
        String odd = "Odd";
        String undefined = "Undefined";
        if (number <= Integer.MAX_VALUE && number >= Integer.MIN_VALUE) {
            if (number % 2 == 0) {
                return even;
            } else {
                return odd;
            }
        }
        return undefined;

    }

}
