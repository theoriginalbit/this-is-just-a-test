package com.theoriginalbit.tijat;

/**
 * A simple testable class.
 */
@SuppressWarnings("WeakerAccess")
public class ThisIsJustAClass {
    private final String custom;

    /**
     * Creates an instance of this class with a custom string for {@link #getHelloCustom()}.
     *
     * @param custom a custom string
     */
    public ThisIsJustAClass(String custom) {
        this.custom = custom;
    }

    /**
     * Get a greeting string that greets the world.
     *
     * @return the greeting
     */
    public String getHelloWorld() {
        return "Hello, World";
    }

    /**
     * Get a greeting string that greets the supplied name.
     *
     * @param name the name to greet
     * @return the greeting
     */
    public String getHello(String name) {
        return "Hello, " + name;
    }

    /**
     * Get a greeting string that greets the custom string provided in {@link #ThisIsJustAClass(String)}.
     *
     * @return the greeting
     */
    public String getHelloCustom() {
        return "Hello, " + custom;
    }
}
