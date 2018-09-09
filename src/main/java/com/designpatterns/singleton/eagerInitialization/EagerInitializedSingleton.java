package com.designpatterns.singleton.eagerInitialization;

public class EagerInitializedSingleton {
    private final static EagerInitializedSingleton instance = new EagerInitializedSingleton();

    private EagerInitializedSingleton() {} //private contructor to avoid clieant application to use contructor

    public static EagerInitializedSingleton getInstance() {
        return instance;
    }
}
