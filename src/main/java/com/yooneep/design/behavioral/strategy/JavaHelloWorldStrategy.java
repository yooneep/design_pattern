package com.yooneep.design.behavioral.strategy;

/**
 * @author yooneep
 */
public class JavaHelloWorldStrategy implements HelloWorldStrategy{
    @Override
    public String helloWorld() {
        return "Hello Java!";
    }
}
