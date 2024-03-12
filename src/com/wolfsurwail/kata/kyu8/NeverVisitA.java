package com.wolfsurwail.kata.kyu8;

import java.util.HashMap;

public class NeverVisitA {
    public static String subtractSum(int n) {
        HashMap<Integer, String> fruitMap = new HashMap<>();
        fruitMap.put(1, "kiwi");
        fruitMap.put(2, "pear");
        fruitMap.put(3, "kiwi");
        fruitMap.put(4, "banana");
        fruitMap.put(5, "melon");
        fruitMap.put(6, "banana");
        fruitMap.put(7, "melon");
        fruitMap.put(8, "pineapple");
        fruitMap.put(9, "apple");
        fruitMap.put(10, "pineapple");
        fruitMap.put(11, "cucumber");
        fruitMap.put(12, "pineapple");
        fruitMap.put(13, "cucumber");
        fruitMap.put(14, "orange");
        fruitMap.put(15, "grape");
        fruitMap.put(16, "orange");
        fruitMap.put(17, "grape");
        fruitMap.put(18, "apple");
        fruitMap.put(19, "grape");
        fruitMap.put(20, "cherry");
        fruitMap.put(21, "pear");
        fruitMap.put(22, "cherry");
        fruitMap.put(23, "pear");
        fruitMap.put(24, "kiwi");
        fruitMap.put(25, "banana");
        fruitMap.put(26, "kiwi");
        fruitMap.put(27, "apple");
        fruitMap.put(28, "melon");
        fruitMap.put(29, "banana");
        fruitMap.put(30, "melon");
        fruitMap.put(31, "pineapple");
        fruitMap.put(32, "melon");
        fruitMap.put(33, "pineapple");
        fruitMap.put(34, "cucumber");
        fruitMap.put(35, "orange");
        fruitMap.put(36, "apple");
        fruitMap.put(37, "orange");
        fruitMap.put(38, "grape");
        fruitMap.put(39, "orange");
        fruitMap.put(40, "grape");
        fruitMap.put(41, "cherry");
        fruitMap.put(42, "pear");
        fruitMap.put(43, "cherry");
        fruitMap.put(44, "pear");
        fruitMap.put(45, "apple");
        fruitMap.put(46, "pear");
        fruitMap.put(47, "kiwi");
        fruitMap.put(48, "banana");
        fruitMap.put(49, "kiwi");
        fruitMap.put(50, "banana");
        fruitMap.put(51, "melon");
        fruitMap.put(52, "pineapple");
        fruitMap.put(53, "melon");
        fruitMap.put(54, "apple");
        fruitMap.put(55, "cucumber");
        fruitMap.put(56, "pineapple");
        fruitMap.put(57, "cucumber");
        fruitMap.put(58, "orange");
        fruitMap.put(59, "cucumber");
        fruitMap.put(60, "orange");
        fruitMap.put(61, "grape");
        fruitMap.put(62, "cherry");
        fruitMap.put(63, "apple");
        fruitMap.put(64, "cherry");
        fruitMap.put(65, "pear");
        fruitMap.put(66, "cherry");
        fruitMap.put(67, "pear");
        fruitMap.put(68, "kiwi");
        fruitMap.put(69, "pear");
        fruitMap.put(70, "kiwi");
        fruitMap.put(71, "banana");
        fruitMap.put(72, "apple");
        fruitMap.put(73, "banana");
        fruitMap.put(74, "melon");
        fruitMap.put(75, "pineapple");
        fruitMap.put(76, "melon");
        fruitMap.put(77, "pineapple");
        fruitMap.put(78, "cucumber");
        fruitMap.put(79, "pineapple");
        fruitMap.put(80, "cucumber");
        fruitMap.put(81, "apple");
        fruitMap.put(82, "grape");
        fruitMap.put(83, "orange");
        fruitMap.put(84, "grape");
        fruitMap.put(85, "cherry");
        fruitMap.put(86, "grape");
        fruitMap.put(87, "cherry");
        fruitMap.put(88, "pear");
        fruitMap.put(89, "cherry");
        fruitMap.put(90, "apple");
        fruitMap.put(91, "kiwi");
        fruitMap.put(92, "banana");
        fruitMap.put(93, "kiwi");
        fruitMap.put(94, "banana");
        fruitMap.put(95, "melon");
        fruitMap.put(96, "banana");
        fruitMap.put(97, "melon");
        fruitMap.put(98, "pineapple");
        fruitMap.put(99, "apple");
        fruitMap.put(100, "pineapple");

        while (true) {
            int sum = 0;
            int temp = n;
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }
            n -= sum;

            if (fruitMap.containsKey(n)) {
                return fruitMap.get(n);
            }
        }
    }
}