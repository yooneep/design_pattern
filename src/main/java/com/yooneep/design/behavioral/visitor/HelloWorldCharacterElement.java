package com.yooneep.design.behavioral.visitor;

/**
 * @author yooneep
 */
public class HelloWorldCharacterElement implements HelloWorldElement{

    private char ch;

    public HelloWorldCharacterElement(char ch) {
        this.ch = ch;
    }

    public char getCh() {
        return ch;
    }

    @Override
    public void accept(HelloWorldVisitor visitor) {
        visitor.visit(this);
    }
}
