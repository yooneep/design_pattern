package com.yooneep.design.structural.bridge;

import com.yooneep.design.HelloWorld;

/**
 * @author yooneep
 */
public class HelloWorldBridge implements HelloWorld{

    private HelloWorldImpl helloWorldImpl;

    public HelloWorldBridge(HelloWorldImpl helloWorldImpl) {
        this.helloWorldImpl = helloWorldImpl;
    }

    @Override
    public String helloWorld() {
        return helloWorldImpl.generate();
    }
}
