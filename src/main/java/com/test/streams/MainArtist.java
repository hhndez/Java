package com.test.streams;

import java.util.ArrayList;
import java.util.List;
import static java.lang.System.out;

/**
 * Created on 4/11/15.
 *
 * @author hhernandez
 */
public class MainArtist {

    /**
     *
     * @param args
     */
    public static void main(String ...args) {
        List<Artist> allArtist = ArtistUtil.getSomeArtists();

        /**
         * No hace nada por que es lazy.
         */
        allArtist.stream().filter(artist -> artist.isFrom("London"));

        /**
         * Tampoco hace nada.
         */
        allArtist.stream().filter(
                artist ->  {
                    out.println(artist.getName());
                    return artist.isFrom("London");
                }
        );

        long count = allArtist.stream().filter(artist -> {
            out.println(artist.getName());
            return artist.isFrom("London");
        }).count();

        out.println("Numero de ocurrencias:" + count);

    }
}
