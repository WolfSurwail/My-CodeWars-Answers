package com.wolfsurwail.kata.kyu8;
import java.util.ArrayList;
import java.util.List;

public class FilteringEvenNumbersBugFixes {
    public static List<Integer> filterOddNumber (List<Integer> listOfNumbers) {
        List<Integer> res = new ArrayList<>(listOfNumbers);
        for (int i = 0; i < res.size(); i++)
        {
            if (res.get(i)%2 == 0)
            {
                res.remove(i);
                i--;
            }
        }
        return res;
    }
}
