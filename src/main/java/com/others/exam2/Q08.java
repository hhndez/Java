package com.others.exam2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Optiplex on 03/08/16.
 */
public class Q08 {

    public static void main(String ... args) throws IOException {
        Path path = Paths.get("newFile.tx");
        Files.move(path, Paths.get("old.txt"));
    }
}
