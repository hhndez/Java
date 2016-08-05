package com.others.exam2;

import java.util.Locale;

import static java.lang.System.*;
/**
 * Created by Optiplex on 03/08/16.
 */
public class Q01 {
    public static void main(String ... args) {
        Locale loc = new Locale("EN", "France");
        out.println(loc.getDisplayLanguage(Locale.GERMAN));
    }

}
