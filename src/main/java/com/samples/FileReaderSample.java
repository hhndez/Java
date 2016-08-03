package com.samples;

import java.io.FileReader;
import java.io.IOException;

import static java.lang.System.*;
/**
 * Created by Optiplex on 25/07/16.
 */
public class FileReaderSample {
    public static void main(String ... args) throws IOException {
        FileReader fr = new FileReader("src/main/resources/new.txt");
        out.println(fr.read());
        fr.close();
    }
}
