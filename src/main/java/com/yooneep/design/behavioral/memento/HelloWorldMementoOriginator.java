package com.yooneep.design.behavioral.memento;

import com.yooneep.design.HelloWorld;

/**
 * @author yooneep
 */
public class HelloWorldMementoOriginator implements HelloWorld{

    private String state;

    public HelloWorldMementoOriginator set(String state) {
        this.state = state;
        return this;
    }

    public Memento saveToMemento() {
        return new Memento(state);
    }

    public void restoreFromMemento(Memento memento) {
        state = memento.getSavedState();
    }

    @Override
    public String helloWorld() {
        return state;
    }

    public static class Memento {
        private final String state;

        public Memento(String stateToSave) {
            state = stateToSave;
        }

        public String getSavedState() {
            return state;
        }
    }
}
