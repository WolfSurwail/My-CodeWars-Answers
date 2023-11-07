package com.wolfsurwail.kata.kyu6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MexicanWave {
    public static String[] wave(String str) {
        int index = 0;
        String[] waveStringArray = new String[str.length()];
        if (str.isEmpty()) {
            return new String[0];
        }
        for (int i = 0; i < str.length(); i++) {
            if (Character.isWhitespace(str.charAt(i))) {
                continue;
            }
            if(str.charAt(i) != ' ') {
                String waveString = str.substring(0,i) + Character.toUpperCase(str.charAt(i)) + str.substring(i+1);
                waveStringArray[index] = waveString;
                index++;
            }
        }
        String[] newWaveStringArray = new String[index];
        System.arraycopy(waveStringArray,0,newWaveStringArray,0,index);
        return newWaveStringArray;
    }
}
