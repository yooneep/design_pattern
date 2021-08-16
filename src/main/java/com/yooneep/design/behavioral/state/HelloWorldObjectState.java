package com.yooneep.design.behavioral.state;

/**
 * @author yooneep
 */
public class HelloWorldObjectState implements HelloWorldState{
    @Override
    public void append(HelloWorldStateContext helloWorldStateContext, String word) {
        helloWorldStateContext.append(word).append("!").setState(new HelloWorldFinalizedState());
    }
}
