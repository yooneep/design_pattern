package com.yooneep.design.behavioral.templatemethod;

import com.yooneep.design.HelloWorld;

/**
 * @author yooneep
 */
public abstract class AbstractHelloWorld implements HelloWorld{

    @Override
    public String helloWorld() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getInterjection());
        stringBuilder.append(getSeparator());
        stringBuilder.append(getObject());
        stringBuilder.append(getTerminator());
        return stringBuilder.toString();
    }

    public abstract String getInterjection();

    public abstract String getSeparator();

    public abstract String getObject();

    public abstract String getTerminator();
}
