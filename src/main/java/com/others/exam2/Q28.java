package com.others.exam2;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by Optiplex on 03/08/16.
 */
public class Q28 {
    public static void main(String...args) {
        try {
            throw new IOException();
        } catch(IOException e) {
            e = new FileNotFoundException("No file");
            System.out.println(e.getMessage());
        }
    }
}
