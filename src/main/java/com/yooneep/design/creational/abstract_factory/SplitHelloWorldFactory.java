package com.yooneep.design.creational.abstract_factory;

import com.yooneep.design.SplitHelloWorld;

/**
 * @author yooneep
 */
public interface SplitHelloWorldFactory {

    public SplitHelloWorld.HelloWorldInterjection createHelloWorldInterjection();

    public SplitHelloWorld.HelloWorldObject createHelloWorldObject();
}
