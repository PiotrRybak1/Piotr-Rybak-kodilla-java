package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beatify(String a,String b, String c,PoemDecorator poemDecorator) {
        String beautyChain = poemDecorator.decorate(a,b,c);
        System.out.println("Beauty result equals: " + beautyChain);
    }
};
