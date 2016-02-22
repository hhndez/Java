package com.test.strings;

import static java.lang.System.*;

/**
 * Created by hhernandez on 18/09/15.
 */
public class Test {

    public static void main(String ...args) {
        String s = "JAVA";
        s = s + "rocks";
        s = s.substring(4,8);

        out.println(s);
    }
}
