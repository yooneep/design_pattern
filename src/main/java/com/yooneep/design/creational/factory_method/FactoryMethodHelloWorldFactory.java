package com.yooneep.design.creational.factory_method;

import com.yooneep.design.HelloWorld;

/**
 * @author yooneep
 */
public class FactoryMethodHelloWorldFactory extends HelloWorldFactory{

    @Override
    public HelloWorld createHelloWorld() {
        return new HelloWorld() {
            @Override
            public String helloWorld() {
                return "Hello Factory Method!";
            }
        };
    }
}
