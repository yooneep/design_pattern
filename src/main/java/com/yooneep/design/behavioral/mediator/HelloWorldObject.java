package com.yooneep.design.behavioral.mediator;

import com.yooneep.design.HelloWorld;
import com.yooneep.design.SplitHelloWorld;

/**
 * @author yooneep
 */
public class HelloWorldObject implements SplitHelloWorld.HelloWorldObject, HelloWorld {

    private HelloWorldMediator helloWorldMediator;

    private static final String separator = " ";

    private static final String terminator = "!";

    public void setHelloWorldMediator(HelloWorldMediator helloWorldMediator) {
        this.helloWorldMediator = helloWorldMediator;
    }

    @Override
    public String object() {
        return "Mediator";
    }

    @Override
    public String helloWorld() {
        return helloWorldMediator.interjection() + separator + object() + terminator;
    }
}
