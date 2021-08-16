package com.yooneep.design.creational.abstractfactory;

import com.yooneep.design.SplitHelloWorld;

/**
 * @author yooneep
 */
public class JavaSplitHelloWorldFactory implements SplitHelloWorldFactory {

    @Override
    public SplitHelloWorld.HelloWorldInterjection createHelloWorldInterjection() {
        return new SplitHelloWorld.DefaultInterjection();
    }

    @Override
    public SplitHelloWorld.HelloWorldObject createHelloWorldObject() {
        return new JavaHelloWorldObject();
    }

    class JavaHelloWorldObject implements SplitHelloWorld.HelloWorldObject {

        @Override
        public String object() {
            return "Java";
        }
    }
}
