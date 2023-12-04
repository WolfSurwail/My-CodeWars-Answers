package com.wolfsurwail.kata.kyu7;

public class MoneyMoneyMoney {
    public static int calculateYears(double principal, double interest,  double tax, double desired) {
        int years = 0;
        while (principal < desired) {
            principal += (principal - (principal * tax)) + ((principal - (principal * tax))*interest) - (principal - (principal * tax));
            years++;
        }
        return years;
    }
}
