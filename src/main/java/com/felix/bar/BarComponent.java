package com.felix.bar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by fsoewito on 11/9/2015.
 *
 */
public class BarComponent {
    private static final Logger LOGGER = LoggerFactory.getLogger(BarComponent.class);

    public void bar() {
        String name = "lordofthejars";
        LOGGER.info("Hello from Bar.");
        LOGGER.debug("In bar my name is {}.", name);
    }
}
