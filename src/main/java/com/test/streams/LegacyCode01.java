package com.test.streams;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.toSet;

/**
 * Created on 4/11/15.
 *
 * @author hhernandez
 */
public class LegacyCode01 {

    public Set<String> findLongTracks(List<Album> albums) {
        Set<String> trackNames = new HashSet();
        for(Album album : albums) {
            for (Track track : album.getTrackList()) {
                if (track.getLenght() > 60) {
                    String name = track.getName();
                    trackNames.add(name);
                }

            }
        }
        return trackNames;
    }

    public Set<String> findLongTracks1(List<Album> albums) {
        Set<String> trackNames = new HashSet();
        albums.stream()
                .forEach(album -> {
                    album.getTrackList()
                            .forEach(track -> {
                                if (track.getLenght() > 60) {
                                    trackNames.add(track.getName());
                                }
                            });
                });
        return trackNames;
    }

    public Set<String> findLongTracks2(List<Album> albums) {
        Set<String> trackNames = new HashSet();
        albums.stream()
                .forEach(album -> {
                    album.getTrackList().stream()
                            .filter(track -> track.getLenght() > 60)
                            .map(track -> track.getName())
                            .forEach(name -> trackNames.add(name));
                });
        return trackNames;
    }

    public Set<String> findLongTracks3(List<Album> albums) {
        Set<String> trackNames = new HashSet();

        albums.stream()
                .flatMap(album -> album.getTrackList().stream())
                .filter(track -> track.getLenght() > 60)
                .map(track -> track.getName())
                .forEach( name -> trackNames.add(name));
        return trackNames;
    }

    public Set<String> findLongTracks4(List<Album> albums) {
        return albums.stream()
                .flatMap(album -> album.getTrackList().stream())
                .filter(track -> track.getLenght() > 60)
                .map( track -> track.getName())
                .collect(toSet());
    }

}
