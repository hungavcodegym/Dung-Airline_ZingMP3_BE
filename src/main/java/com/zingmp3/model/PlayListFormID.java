package com.zingmp3.model;

import lombok.Data;

import java.util.ArrayList;

@Data
public class PlayListFormID {
    private int id;
    private String playlistName;
    private String playlistDescription;
    private String avatarPlaylist;
    private Iterable<Long> songs = new ArrayList<>();
}
