package com.yooneep.design.behavioral.observer;

import java.io.PrintStream;

/**
 * @author yooneep
 */
public class HelloWorldObserver implements Observer{

    private PrintStream printer = System.out;

    public void setPrinter(PrintStream printer) {
        this.printer = printer;
    }

    @Override
    public void update() {
        printer.println("Hello Observer!");
    }
}
