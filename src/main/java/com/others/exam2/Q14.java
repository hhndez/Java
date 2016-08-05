package com.others.exam2;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.System.out;

/**
 * Created by Optiplex on 03/08/16.
 */
public class Q14 {
    public static void main(String ...args) {
        Stream clients = Stream.of(
           new Client02("Will", "vps server", 200),
                new Client02("Rachel", "java program", 1200),
                new Client02("Anthony", "Configuration", 100),
                new Client02("Rachel", "PHP Script", 900));
         Map groups = (Map) clients.collect(Collectors.groupingBy(Client02::getName));
        System.out.println(groups);
    }
}
