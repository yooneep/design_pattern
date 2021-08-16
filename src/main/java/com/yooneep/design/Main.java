package com.yooneep.design;

import com.yooneep.design.behavioral.chain_of_responsibility.AbstractHelloWorldHandler;
import com.yooneep.design.behavioral.chain_of_responsibility.AbstractHelloWorldInterjectionHandler;
import com.yooneep.design.behavioral.chain_of_responsibility.AbstractHelloWorldObjectHandler;
import com.yooneep.design.behavioral.command.Command;
import com.yooneep.design.behavioral.command.HelloWorldPrintCommand;
import com.yooneep.design.behavioral.interpreter.HelloWorldInterpreter;
import com.yooneep.design.behavioral.iterator.HelloWorldCharacterIterator;
import com.yooneep.design.behavioral.mediator.HelloWorldInterjection;
import com.yooneep.design.behavioral.mediator.HelloWorldMediator;
import com.yooneep.design.behavioral.mediator.HelloWorldObject;
import com.yooneep.design.behavioral.memento.HelloWorldMementoOriginator;
import com.yooneep.design.behavioral.observer.HelloWorldObserver;
import com.yooneep.design.behavioral.observer.Subject;
import com.yooneep.design.behavioral.state.HelloWorldStateContext;
import com.yooneep.design.behavioral.strategy.DesignPatternHelloWorldStrategy;
import com.yooneep.design.behavioral.strategy.HelloWorldStrategyContext;
import com.yooneep.design.behavioral.template_method.TemplateMethodHelloWorld;
import com.yooneep.design.behavioral.visitor.HelloWorldCharacterElements;
import com.yooneep.design.behavioral.visitor.HelloWorldCharacterVisitor;
import com.yooneep.design.creational.abstractfactory.AbstractFactory;
import com.yooneep.design.creational.abstractfactory.SplitHelloWorldFactory;
import com.yooneep.design.creational.builder.HelloWorldBuilder;
import com.yooneep.design.creational.factory_method.FactoryMethodHelloWorldFactory;
import com.yooneep.design.creational.prototype.HelloWorldPrototype;
import com.yooneep.design.creational.singleton.HelloWorldSingleton;
import com.yooneep.design.structural.adapter.HelloAdapterDesignPattern;
import com.yooneep.design.structural.adapter.HelloWorldAdapter;
import com.yooneep.design.structural.bridge.DesignPatternWorldImpl;
import com.yooneep.design.structural.bridge.HelloWorldBridge;
import com.yooneep.design.structural.composite.CompositeHelloWorld;
import com.yooneep.design.structural.decorator.HelloWorldDecorator;
import com.yooneep.design.structural.facade.HelloWorldFacade;
import com.yooneep.design.structural.flyweight.HelloWorldFlyWeightFactory;
import com.yooneep.design.structural.proxy.HelloWorldProxy;

/**
 * @author yooneep
 */
public class Main {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {

        System.out.println("We are creational patterns!");

        System.out.println("1. Abstract Factory: ");

        SplitHelloWorldFactory abstractFactory = AbstractFactory.select(AbstractFactory.Type.DesignPattern);
        HelloWorld abstractFactoryHelloWorld = new SplitHelloWorld(abstractFactory.createHelloWorldInterjection(),
                abstractFactory.createHelloWorldObject());
        System.out.println(abstractFactoryHelloWorld.helloWorld());

        System.out.println("2. Builder: ");
        HelloWorld builderHelloWorld = HelloWorldBuilder.builder()
                .interjection("Hello")
                .object("Builder").getHelloWorld();
        System.out.println(builderHelloWorld.helloWorld());

        System.out.println("3. Factory Method: ");
        /**
         * Difference between "abstract factory" and "factory method" is the abstracting point:
         *  1. Abstracting point of abstract factory is factory.
         *  2. Abstracting point of factory method is generated object.
         */
        FactoryMethodHelloWorldFactory factoryMethodHelloWorldFactory = new FactoryMethodHelloWorldFactory();
        HelloWorld factoryMethodHelloWorld = factoryMethodHelloWorldFactory.createHelloWorld();
        System.out.println(factoryMethodHelloWorld.helloWorld());

        System.out.println("4. Prototype: ");
        HelloWorld prototypeHelloWorld = HelloWorldPrototype.PROTOTYPE.clone();
        System.out.println(prototypeHelloWorld.helloWorld());

        System.out.println("5. Singleton: ");
        HelloWorld singletonHelloWorld = HelloWorldSingleton.instance();
        System.out.println(singletonHelloWorld.helloWorld());

        System.out.println("====================================");
        System.out.println("We are structural patterns!");

        System.out.println("6. Adapter: ");
        HelloWorld adapterHelloWorld = new HelloWorldAdapter(new HelloAdapterDesignPattern());
        System.out.println(adapterHelloWorld.helloWorld());

        System.out.println("7. Bridge: ");
        HelloWorld bridgeHelloWorld = new HelloWorldBridge(new DesignPatternWorldImpl());
        //leave bridgeHelloWorld' output to compositeHelloWorld

        System.out.println("8. Composite: ");
        HelloWorld compositeHelloWorld = new CompositeHelloWorld(bridgeHelloWorld, new CompositeHelloWorld.DefaultHelloWorld());
        System.out.println(compositeHelloWorld.helloWorld());

        System.out.println("9. Decorator: ");
        HelloWorldDecorator decoratorHelloWorld = new HelloWorldDecorator(new HelloWorldDecorator.DefaultHelloWorld());
        System.out.println(decoratorHelloWorld.helloDecorator());

        System.out.println("10. Facade: ");
        HelloWorld facadeHelloWorld = HelloWorldFacade.instance().facadeHelloWorld();
        System.out.println(facadeHelloWorld.helloWorld());

        System.out.println("11. Flyweight: ");
        HelloWorld flyWeightHelloWorld = HelloWorldFlyWeightFactory.instance().createHelloWorld("Hello Flyweight!");
        System.out.println(flyWeightHelloWorld.helloWorld());

        System.out.println("12. Proxy: ");
        HelloWorld proxyHelloWorld = new HelloWorldProxy(new HelloWorldProxy.DefaultHelloWorld());
        System.out.println(proxyHelloWorld.helloWorld());

        System.out.println("====================================");
        System.out.println("We are behavioral patterns!");

        System.out.println("13. Chain of Responsibility: ");
        AbstractHelloWorldHandler helloWorldChainOfResponsibility = new AbstractHelloWorldInterjectionHandler().setNext(new AbstractHelloWorldObjectHandler());
        System.out.println(helloWorldChainOfResponsibility.helloWorld());

        System.out.println("14. Command: ");
        Command helloWorldCommand = new HelloWorldPrintCommand();
        helloWorldCommand.execute();

        System.out.println("15. Interpreter: ");
        HelloWorldInterpreter helloWorldInterpreter = new HelloWorldInterpreter();
        helloWorldInterpreter.interpret("println('Hello Interpreter!')");

        System.out.println("16. Iterator: ");
        HelloWorldCharacterIterator helloWorldCharacterIterator = new HelloWorldCharacterIterator("Hello Iterator!".toCharArray());
        while (helloWorldCharacterIterator.hasNext()) {
            System.out.print(helloWorldCharacterIterator.next());
        }
        System.out.println();

        System.out.println("17. Mediator: ");
        HelloWorldInterjection helloWorldInterjection = new HelloWorldInterjection();
        HelloWorldObject helloWorldObject = new HelloWorldObject();
        HelloWorldMediator helloWorldMediator = new HelloWorldMediator(helloWorldInterjection, helloWorldObject);
        helloWorldInterjection.setHelloWorldMediator(helloWorldMediator);
        helloWorldObject.setHelloWorldMediator(helloWorldMediator);
        System.out.println(helloWorldObject.helloWorld());

        System.out.println("18. Memento: ");
        HelloWorldMementoOriginator helloWorldMementoOriginator = new HelloWorldMementoOriginator();
        HelloWorldMementoOriginator.Memento memento = helloWorldMementoOriginator.set("Hello Memento!").saveToMemento();
        helloWorldMementoOriginator.set("Hello Whatever!");
        helloWorldMementoOriginator.restoreFromMemento(memento);
        System.out.println(helloWorldMementoOriginator.helloWorld());

        System.out.println("19. Observer: ");
        Subject subject = new Subject().attach(new HelloWorldObserver());
        subject.notifyObservers();

        System.out.println("20. State: ");
        HelloWorldStateContext helloWorldStateContext = new HelloWorldStateContext();
        HelloWorld stateHelloWorld = helloWorldStateContext.appendWord("Hello").appendWord("State");
        System.out.println(stateHelloWorld.helloWorld());

        System.out.println("21. Strategy: ");
        HelloWorldStrategyContext helloWorldStrategyContext = new HelloWorldStrategyContext(new DesignPatternHelloWorldStrategy());
        System.out.println(helloWorldStrategyContext.helloWorld());

        System.out.println("22. Template Method: ");
        HelloWorld templateMethodHelloWorld = new TemplateMethodHelloWorld();
        System.out.println(templateMethodHelloWorld.helloWorld());

        System.out.println("23. Visitor: ");
        HelloWorldCharacterElements helloWorldCharacterElements = new HelloWorldCharacterElements("Hello Visitor!".toCharArray());
        HelloWorldCharacterVisitor helloWorldCharacterVisitor = new HelloWorldCharacterVisitor();
        helloWorldCharacterElements.accept(helloWorldCharacterVisitor);
        System.out.println(helloWorldCharacterVisitor.helloWorld());

    }
}
