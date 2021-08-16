package com.yooneep.design.behavioral.mediator;

import com.yooneep.design.HelloWorld;
import com.yooneep.design.SplitHelloWorld;

/**
 * @author yooneep
 */
public class HelloWorldInterjection implements SplitHelloWorld.HelloWorldInterjection, HelloWorld {

    private HelloWorldMediator helloWorldMediator;

    private static final String SEPARATOR = " ";

    private static final String TERMINATOR = "!";

    public void setHelloWorldMediator(HelloWorldMediator helloWorldMediator) {
        this.helloWorldMediator = helloWorldMediator;
    }

    @Override
    public String interjection() {
        return "Hello";
    }

    @Override
    public String helloWorld() {
        return interjection() + SEPARATOR + helloWorldMediator.object() + TERMINATOR;
    }
}
