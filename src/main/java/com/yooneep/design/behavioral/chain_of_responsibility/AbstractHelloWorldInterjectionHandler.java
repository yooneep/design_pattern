package com.yooneep.design.behavioral.chain_of_responsibility;

/**
 * @author yooneep
 */
public class AbstractHelloWorldInterjectionHandler extends AbstractHelloWorldHandler {
    @Override
    public void handle(StringBuffer stringBuffer) {
        System.out.println("AbstractHelloWorldInterjectionHandler");
    }
}
