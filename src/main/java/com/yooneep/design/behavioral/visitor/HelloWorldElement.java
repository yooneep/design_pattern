package com.yooneep.design.behavioral.visitor;

/**
 * @author yooneep
 */
public interface HelloWorldElement {

    public void accept(HelloWorldVisitor visitor);
}
