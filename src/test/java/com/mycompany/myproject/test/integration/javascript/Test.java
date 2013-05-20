package com.mycompany.myproject.test.integration.javascript;

import org.vertx.testtools.TestVerticle;

import static org.vertx.testtools.VertxAssert.testComplete;

public class Test extends TestVerticle {

    @org.junit.Test
    public void test() {
        com.mycompany.myproject.Say say = new com.mycompany.myproject.Say();
        say.hi();
        testComplete();

    }
}


