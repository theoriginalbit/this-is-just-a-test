package com.theoriginalbit.tijat;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThisIsJustAClassTest {
    private ThisIsJustAClass instance;

    @Before
    public void setUp() {
        instance = new ThisIsJustAClass("java");
    }

    @Test
    public void test_helloWorld() {
        assertEquals("Hello, World", instance.getHelloWorld());
    }

    @Test
    public void test_helloMars() {
        assertEquals("Hello, Mars", instance.getHello("Mars"));
    }

    @Test
    public void test_helloCustom() {
        assertEquals("Hello, java", instance.getHelloCustom());
    }
}
