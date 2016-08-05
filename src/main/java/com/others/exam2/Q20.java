package com.others.exam2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/**
 * Created by Optiplex on 03/08/16.
 */
public class Q20 {
    public static void main(String ... args) throws IOException {
        File folder = new File("src");
        File file = new File("old.txt");

        //Necesita ser objeto de tipo PAth
        //Files.readAllLines(folder);

        //Necesita ser objeto de tipo PAth
        //Files.list(folder);

        Files.lines(file.toPath()).forEach(System.out::println);

        Files.list(folder.toPath()).forEach(System.out::println);


    }
}
