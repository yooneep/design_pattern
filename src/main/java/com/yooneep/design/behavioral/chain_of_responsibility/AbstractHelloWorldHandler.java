package com.yooneep.design.behavioral.chain_of_responsibility;

import com.yooneep.design.HelloWorld;

/**
 * @author yooneep
 */
public abstract class AbstractHelloWorldHandler implements HelloWorld {

    private AbstractHelloWorldHandler next;

    public AbstractHelloWorldHandler setNext(AbstractHelloWorldHandler next) {
        this.next = next;
        return this;
    }

    public abstract void handle(StringBuffer stringBuffer);

    @Override
    public String helloWorld() {
        StringBuffer stringBuffer = new StringBuffer();
        handle(stringBuffer);
        if (next != null) {
            next.handle(stringBuffer);
        }
        return stringBuffer.toString();
    }
}
