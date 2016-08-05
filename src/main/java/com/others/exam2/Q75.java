package com.others.exam2;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

/**
 * Created by Optiplex on 03/08/16.
 */
public class Q75 {
    public static void main(String ... args) {
        List list = Arrays.asList("North", "South", "West", "East");

        //Originalmente se declara el UnaryOperator sin tipo
        //Por lo que asume que se trata de un Object, pero el Object
        //no tiene el metodo toUpperCase, por lo que marca error de compilacion.
        //UnaryOperator func = (low) -> low.toUpperCase();

        UnaryOperator<String> func = (low) -> low.toUpperCase();
        list.replaceAll(func);

        System.out.println(list);
    }
}
