package com.wolfsurwail.kata.kyu7;

import java.util.Arrays;

public class ComplementaryDNA {
    public static String makeComplement(String dna) {
        char[] chars = dna.toCharArray();
        StringBuilder s = new StringBuilder();
        for (char aChar : chars) {
            if (aChar == 'A') {
                s.append('T');
            } else if (aChar == 'T') {
                s.append('A');
            } else if (aChar == 'C') {
                s.append('G');
            } else {
                s.append('C');
            }
        }
        return s.toString();
    }
}
