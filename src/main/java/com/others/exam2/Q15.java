package com.others.exam2;

import com.sun.tools.corba.se.idl.constExpr.Not;

import java.io.IOException;

/**
 * Created by Optiplex on 03/08/16.
 */
public class Q15 {
    public static void main(String... args) throws NotInRangeException {
        Employee d = new Employee();
        int i = 4;
        d.setAge(i);
        System.out.println("age:" + d.age);
    }
}

class NotInRangeException extends IOException {
    NotInRangeException() {
        super ("not in valid range");
    }
}

class Employee {
    int age;
    public boolean setAge(int ae) throws NotInRangeException {
        if (ae < 18 || ae > 60) {
            throw new NotInRangeException();
        } else {
            age = ae;
            return true;
        }
    }
}

