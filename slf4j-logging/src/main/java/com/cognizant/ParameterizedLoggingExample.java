package com.cognizant;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParameterizedLoggingExample {

    private static final Logger logger =
            LoggerFactory.getLogger(ParameterizedLoggingExample.class);

    public static void main(String[] args) {
        String user = "Deepika";
        int id = 101;

        logger.info("User {} logged in with id {}", user, id);
    }
}