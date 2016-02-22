package com.test.streams;

import java.util.List;

/**
 * Created on 4/11/15.
 *
 * @author hhernandez
 */
public class Album {

    private List<Artist> artists;

    private List<Track> trackList;

    public List<Artist> getMusicians() {
        return artists;
    }

    public final void setMusicians(final List<Artist> artists) {
        this.artists = artists;
    }

    public List<Track> getTrackList() {
        return trackList;
    }

    public void setTrackList(List<Track> trackList) {
        this.trackList = trackList;
    }
}
