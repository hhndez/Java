package com.samples;

import java.io.Console;

/**
 * Created by Optiplex on 25/07/16.
 */
public class ConsoleSample {

    public static void main(String ... args) {
        Console c = System.console();
        char [] oldPassword = c.readPassword("Password:");
    }
}
