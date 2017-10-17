package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautifier(String string, PoemDecorator poemDecorator){
        System.out.println(poemDecorator.decorate(string));
    }
}
