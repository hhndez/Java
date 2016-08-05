package com.others.exam2;

import java.io.File;
import java.io.IOException;

/**
 * Created by Optiplex on 03/08/16.
 */
public class Q16 {
    public static void main(String args[]) throws IOException {
        File file1 = new File("java7.txt");

        //System.out.println(file1.renameTo("java8.txt"));

        System.out.println(file1.renameTo(new File("java8.txt")));
    }
}
