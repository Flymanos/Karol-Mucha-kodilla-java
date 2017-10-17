package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautifier("kurczak", (string -> "ABC" + string + "ABC"));
        poemBeautifier.beautifier("prezydent", (string -> string.toUpperCase()));
        poemBeautifier.beautifier("JaNuSh", string -> string.toLowerCase());
        poemBeautifier.beautifier("Grzegorz", string -> string.replace("r", "R"));
    }
}