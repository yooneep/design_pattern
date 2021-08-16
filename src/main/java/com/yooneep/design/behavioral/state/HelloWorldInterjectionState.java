package com.yooneep.design.behavioral.state;

/**
 * @author yooneep
 */
public class HelloWorldInterjectionState implements HelloWorldState {
    @Override
    public void append(HelloWorldStateContext helloWorldStateContext, String word) {
        helloWorldStateContext.append(word).append(" ").setState(new HelloWorldObjectState());
    }
}
