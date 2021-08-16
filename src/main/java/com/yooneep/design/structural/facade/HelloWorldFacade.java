package com.yooneep.design.structural.facade;

import com.yooneep.design.HelloWorld;
import helloworld.creational.builder.HelloWorldBuilder;

/**
 * @author yooneep
 */
public class HelloWorldFacade {

    private HelloWorldFacade(){
    }

    /**
     * facade is usually used with singleton
     */
    public static HelloWorldFacade instance(){
        return HelloWorldFacadeInstanceHolder.INSTANCE;
    }

    private static class HelloWorldFacadeInstanceHolder {
        private final static HelloWorldFacade INSTANCE = new HelloWorldFacade();
    }

    public HelloWorld facadeHelloWorld(){
        return HelloWorldBuilder.builder()
                .interjection("Hello")
                .object("Facade").getHelloWorld();
    }

}
