package com.test.library;

import com.test.streams.Album;
import com.test.streams.ArtistUtil;

import java.util.IntSummaryStatistics;
import static java.lang.System.*;
/**
 * Created on 6/11/15.
 *
 * @author hhernandez
 */
public class LongFunctionMain {

    public static void main(String ...args) {

        Album album = new Album();
        album.setTrackList(ArtistUtil.getSomeTracks());

        IntSummaryStatistics trackLengthStats =
                album.getTrackList().stream()
                .mapToInt(track -> track.getLenght())
                .summaryStatistics();

        out.printf("MAx: %d, Min: %d, Ave: %f, Sum: %d",
                trackLengthStats.getMax(),
                trackLengthStats.getMin(),
                trackLengthStats.getAverage(),
                trackLengthStats.getSum());


    }
}
