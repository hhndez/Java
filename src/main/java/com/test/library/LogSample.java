package com.test.library;

import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.logging.Logger;

import static java.util.logging.Logger.getLogger;

/**
 * Created on 5/11/15.
 *
 * @author hhernandez
 */
public class LogSample {

    public static void main(String ...args) {

        Logger logger = null;//new getLogger(LogSample.class.getName());

        /**
         * OLD STYLE
         */
        if (logger.isLoggable(Level.INFO)) {
            logger.info("Something: " + expensiveOperation());
        }

        /**
         * LAMBDA STYLE
         */
        logger.info(() -> "Something: "+ expensiveOperation());


    }

    public static String expensiveOperation() {
        return "---";
    }

    public static void debug(Supplier<String> message) {
        if (isDebugEnabled()) {
            debug(message.get());
        }
    }

    private static void debug(String s) {

    }

    private static boolean isDebugEnabled() {
        return true;
    }
}
