package com.test.streams;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

/**
 * Created on 4/11/15.
 *
 * @author hhernandez
 */
public class ArtistUtil {

    public static List<Artist> getSomeArtists() {
        List<Artist> artists = new ArrayList();

        artists.add(new Artist("John", "London"));
        artists.add(new Artist("Ringo", "London"));
        artists.add(new Artist("Maldita Vecindad", "Mexico"));
        artists.add(new Artist("The Beatles", "London"));


        return artists;
    }

    public static List<Track> getSomeTracks() {
        return asList(new Track("Bakai", 524),
                new Track("Violets for your furs", 378),
                new Track("Time Was", 451));
    }

}
