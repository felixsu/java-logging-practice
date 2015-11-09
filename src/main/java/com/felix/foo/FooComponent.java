package com.felix.foo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by fsoewito on 11/9/2015.
 *
 */
public class FooComponent {
    private static final Logger LOGGER = LoggerFactory.getLogger(FooComponent.class);

    public void foo() {
        String name = "Alex";
        LOGGER.info("Hello from Foo.");
        LOGGER.debug("In foo my name is {}.", name);
    }
}
