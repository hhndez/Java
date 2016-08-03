package com.others.exam2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Optiplex on 02/08/16.
 */
public class Q32 {

    public static void main(String ... args) {
        try {
            String thisLine = "";
            BufferedReader br = new BufferedReader(new FileReader("//testing.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("File");
        } catch (IOException e ) {
            System.out.println("IOEX");
        } catch (Exception e) {

        }
    }
}
