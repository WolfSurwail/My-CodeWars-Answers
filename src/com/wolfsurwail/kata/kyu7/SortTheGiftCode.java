package com.wolfsurwail.kata.kyu7;

public class SortTheGiftCode {
    public String sortGiftCode(String code){
        char[] chars = code.toCharArray();
        java.util.Arrays.sort(chars);
        StringBuilder s = new StringBuilder();
        for (char aChar : chars) {
            s.append(aChar);
        }
        return s.toString();
    }
}
