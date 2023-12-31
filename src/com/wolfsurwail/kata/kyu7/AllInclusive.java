package com.wolfsurwail.kata.kyu7;
import java.util.List;
public class AllInclusive {
    public static boolean containAllRots(String string, List<String> arr) {
        for(int i = 0; i < string.length(); i++)
            if(!arr.contains(string.substring(i)+string.substring(0,i)))
                return false;
        return true;
    }
}
