package com.yooneep.design.behavioral.strategy;

/**
 * @author yooneep
 */
public class DesignPatternHelloWorldStrategy implements HelloWorldStrategy{
    @Override
    public String helloWorld() {
        return "Hello Strategy!";
    }
}
