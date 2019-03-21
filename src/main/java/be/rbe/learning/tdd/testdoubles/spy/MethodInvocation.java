package be.rbe.learning.tdd.testdoubles.spy;

import java.util.ArrayList;
import java.util.List;

public class MethodInvocation {

    private List<Object> params = new ArrayList<>();
    private Object returnedValue = null;
    private String method;

    public List<Object> getParams() {
        return params;
    }

    public MethodInvocation addParam(Object param) {
        getParams().add(param);
        return this;
    }

    public Object getReturnedValue() {
        return returnedValue;
    }

    public String getMethod() {
        return method;
    }

    public MethodInvocation setMethod(String method) {
        this.method = method;
        return this;
    }
}
