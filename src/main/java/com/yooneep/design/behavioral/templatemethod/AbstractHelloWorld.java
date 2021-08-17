package com.yooneep.design.behavioral.templatemethod;

import com.yooneep.design.HelloWorld;

/**
 * @author yooneep
 */
public abstract class AbstractHelloWorld implements HelloWorld{

    @Override
    public String helloWorld() {
        StringBuffer accum = new StringBuffer();
        accum.append(getInterjection());
        accum.append(getSeparator());
        accum.append(getObject());
        accum.append(getTerminator());
        return accum.toString();
    }

    public abstract String getInterjection();

    public abstract String getSeparator();

    public abstract String getObject();

    public abstract String getTerminator();
}
