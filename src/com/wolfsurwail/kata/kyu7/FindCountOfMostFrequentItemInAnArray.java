package com.wolfsurwail.kata.kyu7;

import java.util.HashMap;
import java.util.Map;

public class FindCountOfMostFrequentItemInAnArray {
    public static int mostFrequentItemCount(int[] collection) {
        if (collection.length == 0) {
            return 0;
        }

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : collection) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int maxFrequency = 0;
        for (int frequency : frequencyMap.values()) {
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
            }
        }

        return maxFrequency;
    }
}
