package com.wolfsurwail.kata.kyu8;

import java.util.ArrayList;
import java.util.List;

public class FindMultiplesOfANumber {
    public static int[] find(int base, int limit) {
        List<Integer> m = new ArrayList<>();
        for (int i = base; i <= limit; i += base) {
            m.add(i);
        }
        int[] r = new int[m.size()];
        for (int i = 0; i < m.size(); i++) {
            r[i] = m.get(i);
        }
        return r;
    }
}
