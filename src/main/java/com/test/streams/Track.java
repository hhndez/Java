package com.test.streams;

/**
 * Created on 4/11/15.
 *
 * @author hhernandez
 */
public class Track {

    private String name;

    private int lenght;

    public Track(final String name, final int length) {
        this.name = name;
        this.lenght = length;
    }

    public final String getName() {
        return name;
    }

    public final int getLenght() {
        return lenght;
    }
}
