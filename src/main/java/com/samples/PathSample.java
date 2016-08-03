package com.samples;

import java.nio.file.Path;
import java.nio.file.Paths;

import static java.lang.System.out;
/**
 * Created by Optiplex on 25/07/16.
 */
public class PathSample {

    public static void main(String ... args) {
        Path p1 = Paths.get("in\\new");
        Path p2 = Paths.get("file.txt");
        out.println(p1.resolve(p2));
    }


}
