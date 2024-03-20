package com.wolfsurwail.kata.kyu7;

public class a80sKids2HelpALFFindHisSpaceship {
    public static String findSpaceship(String map) {
        String[] lines = map.split("\n");
        for (int i = 0; i < lines.length; i++) {
            int index = lines[i].indexOf('X');
            if (index != -1) {
                return "[" + index + ", " + (lines.length - i - 1) + "]";
            }
        }
        return "Spaceship lost forever.";
    }

}
