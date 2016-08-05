package com.others.exam2;

import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Created by Optiplex on 02/08/16.
 */
public class Q02 {

    public static void main(String ...args) {

        Stream clients = Stream.of(new Client02("Will", "vps server", 200),
                new Client02("Rachel", "java program", 1200),
                new Client02("Anthony", "Conf", 1000));

        //Predicate func = e -> {
        Predicate<Client02> func = e -> {
            System.out.println(e.getName() + " ");
            return e.getBudget() > 1000.0;
        };

        clients.noneMatch(func);

    }
}


class Client02 {
    double budget;
    String name, project;
    Client02(String n, String pr, double p) {
        budget = p;
        name = n;
        project = pr;

    }

    public String getName() {
        return name;
    }
    public double getBudget() {
        return budget;
    }
    public String toString() {
        return name + "," + budget;
    }
}