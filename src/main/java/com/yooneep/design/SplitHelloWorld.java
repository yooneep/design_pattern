package com.yooneep.design;

/**
 * Split "Hello World" to "Hello"(interjection) and "World"(object) so that you can configure it separately.
 *
 * @author yooneep
 */
public class SplitHelloWorld implements HelloWorld {

    private HelloWorldInterjection helloWorldInterjection;

    private HelloWorldObject helloWorldObject;

    private static final String SEPARATOR = " ";

    private static final String TERMINATOR = "!";

    public SplitHelloWorld(HelloWorldInterjection helloWorldInterjection, HelloWorldObject helloWorldObject) {
        this.helloWorldInterjection = helloWorldInterjection;
        this.helloWorldObject = helloWorldObject;
    }

    @Override
    public String helloWorld() {
        return helloWorldInterjection.interjection() + SEPARATOR + helloWorldObject.object() + TERMINATOR;
    }

    public interface HelloWorldInterjection {

        public String interjection();
    }

    public interface HelloWorldObject {

        public String object();
    }

    public static class DefaultInterjection implements HelloWorldInterjection {

        @Override
        public String interjection() {
            return "Hello";
        }
    }

}
