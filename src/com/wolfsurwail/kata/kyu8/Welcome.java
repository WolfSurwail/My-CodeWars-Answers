package com.wolfsurwail.kata.kyu8;

import java.util.HashMap;
import java.util.Map;

public class Welcome {
    public static String greet(String language){
        Map<String, String> languageDatabase = new HashMap<>();
        languageDatabase.put("english", "Welcome");
        languageDatabase.put("czech", "Vitejte");
        languageDatabase.put("danish", "Velkomst");
        languageDatabase.put("dutch", "Welkom");
        languageDatabase.put("estonian", "Tere tulemast");
        languageDatabase.put("finnish", "Tervetuloa");
        languageDatabase.put("flemish", "Welgekomen");
        languageDatabase.put("french", "Bienvenue");
        languageDatabase.put("german", "Willkommen");
        languageDatabase.put("irish", "Failte");
        languageDatabase.put("italian", "Benvenuto");
        languageDatabase.put("latvian", "Gaidits");
        languageDatabase.put("lithuanian", "Laukiamas");
        languageDatabase.put("polish", "Witamy");
        languageDatabase.put("spanish", "Bienvenido");
        languageDatabase.put("swedish", "Valkommen");
        languageDatabase.put("welsh", "Croeso");

        return languageDatabase.getOrDefault(language, "Welcome");
    }
}
