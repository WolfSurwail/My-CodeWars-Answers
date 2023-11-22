package com.wolfsurwail.kata.kyu8;

public class WillThereBeEnoughSpace {
    public static int enough(int cap, int on, int wait){
        return (cap - on) >= wait ? 0 : (on - wait);
    }
}
