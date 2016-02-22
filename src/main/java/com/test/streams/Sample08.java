package com.test.streams;

import java.util.Set;

import static java.util.stream.Collectors.toSet;
import static java.lang.System.out;

/**
 * Created on 4/11/15.
 *
 * @author hhernandez
 */
public class Sample08 {

    public static void main(String ...args) {
        Album album = new Album();
        album.setMusicians(ArtistUtil.getSomeArtists());


        Set<String> origins = album.getMusicians().stream()
                .filter(artist -> artist.getName().startsWith("The"))
                .map(artist -> artist.getNationality())
                .collect(toSet());

        out.println("Size=" + origins.size());

    }

}
