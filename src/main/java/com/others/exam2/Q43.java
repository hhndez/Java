package com.others.exam2;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

/**
 * Created by Optiplex on 03/08/16.
 */
public class Q43 {
    public static void main(String ...args) {
        Set list = new HashSet();

        list.add(new Trade43(1, 1000, "John"));
        list.add(new Trade43(5, 200, "Alice"));
        list.add(new Trade43(4, 250, "Lisa"));


        //Consumer discount = t -> t.total *= 0.9;
        Consumer<Trade43> discount = t -> t.total *= 0.9;

        list.stream().forEach(discount);
        list.stream().forEach(System.out::println);
    }
}

class Trade43 {
    int quantity;
    double price, total;
    String buyer;

    Trade43(int q, double p, String b) {
        quantity = q;
        price = p;
        total = p*q;
        buyer = b;
    }

    public String toString() {
        return total + " ";
    }
}
