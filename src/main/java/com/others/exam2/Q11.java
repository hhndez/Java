package com.others.exam2;

import java.time.LocalDate;
import java.time.Period;

import static java.lang.System.*;
/**
 * Created by Optiplex on 03/08/16.
 */
public class Q11 {
    public static void main(String ...args) {
        LocalDate start = LocalDate.of(1989, 11, 28);
        LocalDate end = LocalDate.of(2015, 11, 28);
        Period p = Period.between(start, end);
        out.println(p.getYears());
        out.println(p);
    }
}
