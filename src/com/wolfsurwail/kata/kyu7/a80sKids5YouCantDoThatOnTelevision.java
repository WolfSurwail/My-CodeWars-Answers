package com.wolfsurwail.kata.kyu7;

public class a80sKids5YouCantDoThatOnTelevision {
    public static String bucketOf(String said) {
        return said.toLowerCase().matches(".*(water|wet|wash)+.*") && said.toLowerCase().matches(".*(i don\\'t know|slime)+.*") ? "sludge" : said.toLowerCase().matches(".*(water|wet|wash)+.*") ? "water" : said.toLowerCase().matches(".*(i don\\'t know|slime)+.*") ? "slime" : "air";
    }
}
