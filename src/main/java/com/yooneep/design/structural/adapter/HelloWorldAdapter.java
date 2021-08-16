package com.yooneep.design.structural.adapter;

import com.yooneep.design.HelloWorld;

/**
 * @author yooneep
 */
public class HelloWorldAdapter implements HelloWorld{

    private HelloAdapterDesignPattern helloDesignPattern;

    public HelloWorldAdapter(HelloAdapterDesignPattern helloDesignPattern) {
        this.helloDesignPattern = helloDesignPattern;
    }

    @Override
    public String helloWorld() {
        return helloDesignPattern.helloDesignPattern();
    }
}
