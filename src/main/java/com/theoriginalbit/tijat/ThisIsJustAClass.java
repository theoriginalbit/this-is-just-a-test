package com.theoriginalbit.tijat;

@SuppressWarnings("WeakerAccess")
public class ThisIsJustAClass {
    private final String custom;

    public ThisIsJustAClass(String custom) {
        this.custom = custom;
    }

    public String getHelloWorld() {
        return "Hello, World";
    }

    public String getHello(String name) {
        return "Hello, " + name;
    }

    public String getHelloCustom() {
        return "Hello, " + custom;
    }
}
