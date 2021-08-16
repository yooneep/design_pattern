package com.yooneep.design.behavioral.strategy;

import com.yooneep.design.HelloWorld;

/**
 * @author yooneep
 */
public class HelloWorldStrategyContext implements HelloWorld{

    private HelloWorldStrategy helloWorldStrategy;

    public HelloWorldStrategyContext(HelloWorldStrategy helloWorldStrategy) {
        this.helloWorldStrategy = helloWorldStrategy;
    }

    @Override
    public String helloWorld() {
        return helloWorldStrategy.helloWorld();
    }
}
