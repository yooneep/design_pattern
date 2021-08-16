package com.yooneep.design.structural.flyweight;

import com.yooneep.design.HelloWorld;

/**
 * @author yooneep
 */
public class HelloWorldFlyWeight implements HelloWorld {

    private final String value;

    public HelloWorldFlyWeight(String value) {
        this.value = value;
    }

    @Override
    public String helloWorld() {
        return value;
    }

}
