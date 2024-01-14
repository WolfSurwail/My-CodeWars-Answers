package com.wolfsurwail.kata.kyu8;
import static java.util.Arrays.deepToString;


public class CSVRepresentationOfArray {
    public static String toCsvText(int[][] array){
        return deepToString(array).replaceAll(" |]]|\\Q[]\\E|\\Q[[\\E", "").replace("],[", "\n");
    }
}
