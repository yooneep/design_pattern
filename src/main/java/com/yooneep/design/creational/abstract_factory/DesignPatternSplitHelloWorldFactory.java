package com.yooneep.design.creational.abstract_factory;

import com.yooneep.design.SplitHelloWorld;

/**
 * @author yooneep
 */
public class DesignPatternSplitHelloWorldFactory implements SplitHelloWorldFactory {

    @Override
    public SplitHelloWorld.HelloWorldInterjection createHelloWorldInterjection() {
        return new SplitHelloWorld.DefaultInterjection();
    }

    @Override
    public SplitHelloWorld.HelloWorldObject createHelloWorldObject() {
        return new DesignPatternHelloWorldObject();
    }

    class DesignPatternHelloWorldObject implements SplitHelloWorld.HelloWorldObject {

        @Override
        public String object() {
            return "Abstract Factory";
        }
    }
}
