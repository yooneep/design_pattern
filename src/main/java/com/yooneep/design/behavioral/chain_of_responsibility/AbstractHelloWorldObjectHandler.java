package com.yooneep.design.behavioral.chain_of_responsibility;

/**
 * @author yooneep
 */
public class AbstractHelloWorldObjectHandler extends AbstractHelloWorldHandler {
    @Override
    public void handle(StringBuffer stringBuffer) {
        System.out.println("AbstractHelloWorldObjectHandler");
    }
}
