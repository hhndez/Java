package com.samples;

import java.time.LocalDate;
import java.time.Period;
import static java.lang.System.out;
/**
 * Created by Optiplex on 25/07/16.
 */
public class LocalDateSample {
    public static void main(String ... args){
        Period period = Period.of(1,2,1);
        LocalDate loc = LocalDate.of(2015,1,1);
        int days = period.getDays();
        out.println("Months: " + period.getMonths());
        out.println("Days:" + days);
        loc = loc.plusDays(period.getDays());
        out.println("result:" + loc);
    }
}
