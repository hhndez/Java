package com.test.init;

import static java.lang.System.out;

/**
 * Created by hhernandez on 15/09/15.
 */
public class Init {

    static {
        out.println("Static");
    }

    Init() {

        out.println("Constructor vacio");
        //out.println("Valor de x=" + x); Error de compilacion por el scope de x.
    }

    Init(String args) {
        out.println("Construtor args");
    }

    {
        int x = 5;
        out.println("Nueva instancia");
    }

    public static void main(String ... args) {
        out.println("Main");

        new Init();
        new Init("test");
    }

    {
        //out.println("X=" + x++); Error de compilacion por el scope de x.
    }
}
