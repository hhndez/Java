package com.others.exam2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;

/**
 * Created by Optiplex on 03/08/16.
 */
public class Q22 {
    public static void main(String... args){
        List<Trade> list = new ArrayList<>();
        list.add(new Trade(4, 1000));
        list.add(new Trade(9, 1220));
        list.add(new Trade(1, 12000));

        Trade highQ = list.get(0);

        BiPredicate<Trade,Trade> highest = (t1, t2) -> t1.getQuantity() > t2.getQuantity();
/*
        for (int x = 1; if (highest.test(list.get(x - 1), list.get(x)))) {
         highQ  = list.get(x);
        }*/
    }
}

class Trade {
    int quantity;;
    double price;
    double total;
    Trade(int q, double p) {
        quantity = q;
        price = p;
        total = p*q;
    }

    public int getQuantity() { return quantity; }

    public String toString() {
        return quantity + "," + price + "," + total;
    }
}
