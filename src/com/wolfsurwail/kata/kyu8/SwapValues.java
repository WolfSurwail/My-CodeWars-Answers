package com.wolfsurwail.kata.kyu8;

public class SwapValues {
    public Object[] arguments;

    public SwapValues(final Object[] args){
        arguments=args;
    }

    public void swapValues() {
        Object temp = arguments[1];
        arguments[1] = arguments[0];
        arguments[0] = temp;
    }
}
