package com.others.exam2;

/**
 * Created by Optiplex on 03/08/16.
 */
public interface Q76 {

    int groupID = 10;

    //default boolean equals(Object obj) {
    default boolean equalss(Object obj) {
        return this.groupID == ((Q76)obj).groupID;
    }

    static void println() {
        System.out.println("A");
    }

}
