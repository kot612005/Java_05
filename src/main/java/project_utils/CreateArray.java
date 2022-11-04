package project_utils;

public class CreateArray {


    public int[] createIntArray (int a, int b, int c, int d, int e) {
        return  new int [] {a, b, c, d, e};
    }


    public double[] createDoubleArray(double a, double b, double c, double d, double e) {
       return new double [] {a, b, c, d, e};
    }


    public String [] createStringArray ( String a, String b,String c,String d,String e ){
        String[] array = {a, b, c, d, e};
        return array;

    }
//Написать метод createArrayFromText(), который принимает
// на вход предложение из нескольких слов и возвращает массив из этих слов.

    public String [] createArrayFromText(String sentence){
        return sentence.split(" ");
    }


}
