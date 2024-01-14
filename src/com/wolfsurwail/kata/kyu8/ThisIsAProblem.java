package com.wolfsurwail.kata.kyu8;

public class ThisIsAProblem {
    public String firstName;
    public String lastName;
    public String fullName;

    public ThisIsAProblem(String first, String last) {
        this.firstName = first;
        this.lastName = last;
        fullName = firstName + " " + lastName;
    }
}
