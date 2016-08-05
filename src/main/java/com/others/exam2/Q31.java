package com.others.exam2;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Optiplex on 03/08/16.
 */
public class Q31 {
    public static void main(String ...args) throws IOException {
        //List lines = new ArrayList();
        List<String> lines = new ArrayList();
        Stream<String> stream = Files.lines(Paths.get("old.txt"), Charset.defaultCharset());
        stream.map(String::trim).filter(s -> !s.isEmpty()).forEach(lines::add);
        System.out.println(lines);


    }
}
