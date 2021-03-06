package com.yooneep.design.behavioral.mediator;

import com.yooneep.design.SplitHelloWorld;

/**
 * @author yooneep
 */
public class HelloWorldMediator {

    private SplitHelloWorld.HelloWorldInterjection helloWorldInterjection;

    private SplitHelloWorld.HelloWorldObject helloWorldObject;

    public HelloWorldMediator(SplitHelloWorld.HelloWorldInterjection helloWorldInterjection, SplitHelloWorld.HelloWorldObject helloWorldObject) {
        this.helloWorldInterjection = helloWorldInterjection;
        this.helloWorldObject = helloWorldObject;
    }

    public String interjection() {
        return helloWorldInterjection.interjection();
    }

    public String object() {
        return helloWorldObject.object();
    }

}
