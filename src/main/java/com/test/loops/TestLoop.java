package com.test.loops;

/**
 * Created by hhernandez on 21/09/15.
 */
public class TestLoop {

    public static void main(String ... args) {

        for (;;) {

            break;

        }

        int i = 0;
        for (thing(); test(i);add()) {
            System.out.println("HI");
            i++;
        }
    }

    private static void thing() {
        System.out.println("hi");
    }

    private static boolean test(int i) {
        if (i < 10)
        return true;
        return false;
    }

    private static void add() {
        System.out.println("WORLD");
    }
}
