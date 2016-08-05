package com.others.exam2;

import java.time.LocalDate;
import static java.lang.System.out;
/**
 * Created by Optiplex on 02/08/16.
 */
public class Q07 {

    public static void main(String ...args) {
        LocalDate date = LocalDate.parse("2014-12-31");
        date = date.plusDays(2);
        out.println(date);
/*
        LocalDate date1 = LocalDate.parse("2015-04-31");
        out.println(date1);
*/
    }
}
