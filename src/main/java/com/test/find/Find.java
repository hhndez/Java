package com.test.find;

import java.util.regex.*;
import static java.lang.System.out;
import static java.lang.System.*;

/**
 * Created by hhernandez on 21/09/15.
 */
public class Find {
    public static void find(String ... args) {
        out.println();
        out.println("Patron:" + args[0]);
        Pattern p = Pattern.compile(args[1]);
        Matcher m = p.matcher(args[2]);
        while(m.find()) {
            out.print(m.start() + " " + m.end() + " " + m.group() + "\n");
        }
    }

    public static void main (String ... args) {
        //+ uno o mas
        //* cero o mas
        //? cero o uno

        String titulo = "simple";
        String pattern = "abc";
        String source = "avsfvasdfabcwefewafabc";
        find(titulo, pattern, source);

        ////////////////////////
        titulo = "Digitos...";
        pattern = "\\d";
        source = "9a8d70sd98f723708";
        find(titulo, pattern, source);

        titulo = "NO Digitos...";
        pattern = "\\D";
        source = "9a8d70sd98f723708";
        find(titulo, pattern, source);

        titulo = "";
        pattern = "a?";
        source = "aba";
        find(titulo, pattern, source);

        titulo = "dot methacharacter";
        pattern = "a.c";
        source = "ac abc a c";
        find(titulo, pattern, source);

        titulo ="Operator ^ carat";
        pattern = "proj1([^,])*";
        source = "proj3.txt,proj1sched.pdf,proj1,prof2,proj1.java";
        find(titulo, pattern, source);

    }

}
