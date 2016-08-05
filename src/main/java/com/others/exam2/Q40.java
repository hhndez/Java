package com.others.exam2;

/**
 * Created by Optiplex on 03/08/16.
 */
public class Q40 {
    public static void main(String ...args) {
        In in = new In(){};
        In[] ins = {new Imp(), in};
        for (In i : ins) {
            System.out.println(i + " ");
        }
    }
}

class Imp implements In {
    public String toString() {
        return "IMP";
    }
}

interface In {
    /*
    public default String toString() {
        return "IN";
    }*/
}
