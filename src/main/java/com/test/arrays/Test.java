package com.test.arrays;

/**
 * Created by hhernandez on 18/09/15.
 */
public class Test {

    public static final void main(final String ... args) throws Exception {
        int [][] array = new int[2][3];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++ ) {
                System.out.print(i + "" + j + " ");
            }
                System.out.println("");
        }


    }
}
