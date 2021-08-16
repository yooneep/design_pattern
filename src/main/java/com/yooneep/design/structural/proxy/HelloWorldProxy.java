package com.yooneep.design.structural.proxy;

import com.yooneep.design.HelloWorld;
import org.apache.commons.lang3.StringUtils;

/**
 * @author yooneep
 */
public class HelloWorldProxy implements HelloWorld {

    private HelloWorld helloWorld;

    public HelloWorldProxy(HelloWorld helloWorld) {
        this.helloWorld = helloWorld;
    }

    @Override
    public String helloWorld() {
        return StringUtils.substringBefore(helloWorld.helloWorld()," ")+" Proxy!";
    }

    public static class DefaultHelloWorld implements HelloWorld {

        @Override
        public String helloWorld() {
            return "Hello World!";
        }
    }
}
