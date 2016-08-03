package com.others.exam2;

import java.time.LocalDate;

/**
 * Created by Optiplex on 02/08/16.
 */
public class Q07 {

    public static void main(String ...args) {
        LocalDate date = LocalDate.parse("2014-12-31");

        date = date.plusDays(2);
    }
}
