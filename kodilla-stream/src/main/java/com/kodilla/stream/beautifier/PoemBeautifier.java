package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String textToBeautify, PoemDecorator decorator) {
        System.out.println(decorator.decorate(textToBeautify));
    }
}
