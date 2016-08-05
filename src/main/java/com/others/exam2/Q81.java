package com.others.exam2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;

import static java.lang.System.out;
/**
 * Created by Optiplex on 03/08/16.
 */
public class Q81 {
    public static void main(String ...args) {
        List strings = new ArrayList();
        strings.add("Shane");
        strings.add("Rachel");
        strings.add("Raj");

        //Mal al no poner tipo
        //BiFunction func = (s1, s2) -> Integer.compare(s1.length(), s2.length());
        BiFunction<String,String,Integer> func = (s1, s2) -> Integer.compare(s1.length(), s2.length());

        //Collections.sort(strings, func::apply);

        out.println(strings);
    }

}
