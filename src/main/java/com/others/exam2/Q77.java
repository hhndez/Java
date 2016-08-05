package com.others.exam2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.lang.System.out;

/**
 * Created by Optiplex on 03/08/16.
 */
public class Q77 {
    public static void main(String ... args) {
        List clients = new ArrayList<>();
        clients.add(new Client1("Will", "vps server", 200));
        clients.add(new Client1("Rachel", "java program", 1200));
        clients.add(new Client1("Raj", "PHP server", 750));

        Collections.sort(clients, Comparator.comparing(Client1::getName));
        out.println(clients);
    }
}

class Client1 {
    double budget;
    String name, project;

    Client1(String n, String pr, double p) {
        budget = p;
        name = n;
        project = pr;
    }

    public String getName() { return name;}
    public String toString() {  return name + "," + budget;}
}