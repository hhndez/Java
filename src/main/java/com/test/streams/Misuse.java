package com.test.streams;

import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

/**
 * Created on 4/11/15.
 *
 * @author hhernandez
 */
public class Misuse {
    public void misuse(Album album) {

        List<Artist> musicians = album.getMusicians().stream()
                .collect(toList());

        List<Artist> bands = musicians.stream()
                .filter(artist -> artist.getName().startsWith("The"))
                .collect(toList());

        Set<String> origins = bands.stream()
                .map(artist -> artist.getNationality())
                .collect(toSet());
    }

    public void betterUse(Album album) {
        Set<String> origins = album.getMusicians().stream()
                .filter(artist -> artist.getName().startsWith("The"))
                .map( artist -> artist.getNationality())
                .collect(toSet());
    }


}
