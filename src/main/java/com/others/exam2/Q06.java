package com.others.exam2;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

/**
 * Created by Optiplex on 02/08/16.
 */
public class Q06 {
    public static void main(String ... args) {
        /*
        Map map = new HashMap<>();
        map.put(1, "1");
        Stream ds = map.values().stream().map(s -> Double.parseDouble(s));
        System.out.println(ds.findFirst().get()); */

        //El codigo anterior no funciona, ya que map no tiene declarado que tipo debe ser.
        //Para que funcione debe ser asi..
        Map<Double, String> map = new HashMap();
        map.put(1d, "1");
        Stream ds = map.values().stream().map(s -> Double.parseDouble(s));
        System.out.println(ds.findFirst().get());


    }
}
