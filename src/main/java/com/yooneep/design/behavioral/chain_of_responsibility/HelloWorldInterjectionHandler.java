package com.yooneep.design.behavioral.chain_of_responsibility;

/**
 * @author yooneep
 */
public class HelloWorldInterjectionHandler extends HelloWorldHandler {
    @Override
    public void handle(StringBuffer stringBuffer) {
        stringBuffer.append("Hello ");
    }
}
