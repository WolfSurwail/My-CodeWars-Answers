package com.wolfsurwail.kata.kyu8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumMixedArray {
    public int sum(List<?> mixed) {
        int sum = 0;

        for (Object element : mixed)
        {
            if (element instanceof Integer)
            {
                sum += (Integer) element;
            }
            else if (element instanceof String){
                sum += Integer.parseInt( (String) element );
            }
        }
        return sum;
    }
}
