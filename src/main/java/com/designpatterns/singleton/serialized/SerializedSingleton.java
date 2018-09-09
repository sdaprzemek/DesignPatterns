package com.designpatterns.singleton.serialized;

import java.io.Serializable;

public class SerializedSingleton implements Serializable {
    private static final long serialVersionUID = -938842627647262323L;

    private SerializedSingleton(){}

    private static class SingletonHelper {
        private static final SerializedSingleton instance = new SerializedSingleton();
    }

    public static SerializedSingleton getInstance() {
        return SingletonHelper.instance;
    }

    protected Object readResolve() { //without this method we get two instance with diff hashCode
        return getInstance();
    }
}
