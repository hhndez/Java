package com.others.exam2;

/**
 * Created by Optiplex on 03/08/16.
 */
public class Q21 {

    public static void main(String args[]) {
        /*
        Validator checker = new Validator<String>() {
            public boolean test(String s) {
                return s.matches("[A]{1}[a-zA-Z]+");
            }
        }; */

        Validator<String> checker = in -> in.matches("");

    }
}

interface Validator<T> {
    public boolean test(T t);
}
