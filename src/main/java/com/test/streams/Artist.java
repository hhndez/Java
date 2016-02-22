package com.test.streams;

/**
 * Created on 4/11/15.
 *
 * @author hhernandez
 */
public class Artist {

    private String name;

    private String place;

    private String nationality;

    public Artist(final String name, final String place) {
        this.name = name;
        this.place = place;
    }

    public boolean isFrom(final String place) {
        if (this.place != null && this.place.equals(place)) {
            return true;
        }
        return false;
    }

    public final String getName() {
        return this.name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

}
