package com.test.streams;

import java.util.Comparator;
import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

/**
 * Created on 4/11/15.
 *
 * @author hhernandez
 */
public class Sample06 {

    /**
     * Obtiene el minimo de una coleccion.
     * @param args
     */
    public static void main(String ...args) {
        List<Track> tracks = ArtistUtil.getSomeTracks();

        /**
         * OLD STYLE.
         */
        Track shortestTrack = tracks.get(0);
        for (Track track : tracks) {
            if (track.getLenght() < shortestTrack.getLenght()) {
                shortestTrack = track;
            }
        }
        assertEquals(tracks.get(1), shortestTrack);


        /**
         * NEW STYLE.
         */
        shortestTrack = tracks.stream().min(Comparator.comparing(track -> track.getLenght())).get();
        assertEquals(tracks.get(1), shortestTrack);

    }
}
