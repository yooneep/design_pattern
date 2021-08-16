package com.yooneep.design.creational.factory_method;

import com.yooneep.design.HelloWorld;

/**
 * <pre>
 * Difference from abstract factory is the abstracting point:
 * 1. Abstracting point of abstract factory is factory.
 * 2. Abstracting point of factory method is generated object.
 *
 * </pre>
 * @author yooneep
 */
public class HelloWorldFactory {

    public HelloWorld createHelloWorld(){
        return new HelloWorld() {
            @Override
            public String helloWorld() {
                return "Hello World!";
            }
        };
    }
}
