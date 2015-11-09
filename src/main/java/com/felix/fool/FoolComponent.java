package com.felix.fool;

import ch.qos.logback.classic.ClassicConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by fsoewito on 11/9/2015.
 *
 */
public class FoolComponent {
    private static final Logger LOGGER = LoggerFactory.getLogger(FoolComponent.class);

    public void fool(){
        String name = "Wasabi";
        String discriminatorKey = "foolKey";
        String discriminatorVal = new SimpleDateFormat("HHmmssSSS").format(new Date());
        MDC.put(discriminatorKey, discriminatorVal);
        LOGGER.info(ClassicConstants.FINALIZE_SESSION_MARKER, "In foo my name is {}.", name);
        MDC.remove(discriminatorKey);
    }
}
