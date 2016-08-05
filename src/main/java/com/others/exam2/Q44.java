package com.others.exam2;

/**
 * Created by Optiplex on 03/08/16.
 */
public class Q44 {
    static class OCAJP {
        public static void main(String ... args) {
            System.out.println("Inner class");
        }
    }
}

class Q44e {
    public static void main(String ... args) {
        Q44.OCAJP.main();
    }
}
