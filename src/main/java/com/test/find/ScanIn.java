package com.test.find;

import java.util.Scanner;

import static java.lang.System.*;

/**
 * Created by hhernandez on 21/09/15.
 */
public class ScanIn {
    /**
     * Correr como
     * java ScanIn "\d\d"
     * 1b2c334f456
     * @param args
     */
    public static void main (String ...args) {
        out.print("input: ");
        out.flush();
        try {
            Scanner s = new Scanner(in);
            String token;
            do {
                token = s.findInLine(args[0]);
                out.println("found " + token);
            } while (token != null);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
