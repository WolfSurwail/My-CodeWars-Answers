package com.wolfsurwail.kata.kyu7;

public class TheOfficeIIBoredomScore {
    public static String boredom(Person[] staff) {
        int s = 0;
        for (Person person : staff) {
            switch (person.department) {
                case "accounts": s += 1; break;
                case "finance": s += 2; break;
                case "canteen": s += 10; break;
                case "regulation": s += 3; break;
                case "trading", "change": s += 6; break;
                case "IS": s += 8; break;
                case "retail": s += 5; break;
                case "cleaning": s += 4; break;
                case "pissing about": s += 25; break;
            }
        }
        return s <= 80 ? "kill me now" : s >= 100 ? "party time!!" : "i can handle this";
    }

    public class Person {
        public final String name;        // name of the staff member
        public final String department;  // department they work in

        public Person(String name, String department) {
            this.name = name;
            this.department = department;
        }
    }
}
