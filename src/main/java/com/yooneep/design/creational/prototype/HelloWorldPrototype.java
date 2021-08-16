package com.yooneep.design.creational.prototype;

import com.yooneep.design.HelloWorld;

/**
 * @author yooneep
 */
public class HelloWorldPrototype implements HelloWorld {

    private String helloWorld;

    public HelloWorldPrototype(String helloWorld) {
        this.helloWorld = helloWorld;
    }

    public HelloWorld clone() {
        return new HelloWorldPrototype(this.helloWorld);
    }

    @Override
    public String helloWorld() {
        return helloWorld;
    }

    public final static HelloWorldPrototype PROTOTYPE = new HelloWorldPrototype("Hello Prototype!");
}
