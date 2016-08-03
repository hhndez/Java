package com.others.exam2;

import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Created by Optiplex on 02/08/16.
 */
public class Q02 {

    public static void main(String ...args) {

        Stream clients = Stream.of(new Client("Will", "vps server", 200),
                new Client("Rachel", "java program", 1200),
                new Client("Anthony", "Conf", 1000));

        Predicate func = e -> {
            System.out.println("---" );
            return true;
        };

        clients.noneMatch(func);

    }
}


class Client {
    Client(String n, String pr, double p) {

    }
}