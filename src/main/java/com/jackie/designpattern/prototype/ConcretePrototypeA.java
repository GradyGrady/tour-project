package com.jackie.designpattern.prototype;

/**
 * Created by jackie on 18/1/5.
 */
public class ConcretePrototypeA implements Prototype {
    @Override
    public Object clone() {
        Prototype prototype = new ConcretePrototypeA();
        return prototype;
    }
}
