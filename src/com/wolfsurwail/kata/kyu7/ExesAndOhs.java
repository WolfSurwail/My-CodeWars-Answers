package com.wolfsurwail.kata.kyu7;

public class ExesAndOhs {
        public static boolean getXO (String str) {
            char[] chars = str.toLowerCase().toCharArray();
            int countX = 0;
            int countO = 0;
            for (char c: chars) {
                if (c == 'x') {
                    countX++;
                } else if (c == 'o') {
                    countO++;
                }
            }
            return countX == countO;
        }
}
