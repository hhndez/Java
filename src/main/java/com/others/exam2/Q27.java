package com.others.exam2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by Optiplex on 03/08/16.
 */
public class Q27 {
    public static void main(String args[]) {
        List list = new ArrayList();
        list.add(10);
        list.add(20);
        list.add(30);

        Consumer<Integer> cons = i-> System.out.print(i + " ");
        list.forEach(cons);
    }
}
