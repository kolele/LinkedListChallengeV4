package com.kole;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public void addSongToPlayList(int songIndex, LinkedList<Song> playList){
        songIndex-=1;
        if (songIndex>=0 && songIndex<=this.songs.size()){
            System.out.println("Added song " + this.songs.get(songIndex).getName() + " to the playlist");
            playList.add(songIndex,this.songs.get(songIndex));
        }else {
            System.out.println("Song with index " + songIndex + " is not on this album");
        }
    }

    public void addSongToPlayList(String songName, LinkedList<Song> playList){
        if (findSong(songName)!=null){
            System.out.println("Added " + songName + " to the playlist");
            playList.add(findSong(songName));
        }else {
            System.out.println("Song " + songName + " does not exist on this album");
        }
    }

    public void addSongToAlbum(String songName, double songDuration){
        if (findSong(songName)==null){
            System.out.println("Added song " + songName + " to this album");
            this.songs.add(new Song(songName,songDuration));
        }else {
            System.out.println("Song " + songName + " already exists on this album");
        }
    }

    private Song findSong (String songName){
        for (Song tempSong : this.songs){
            if (tempSong.getName().equals(songName)){
                return tempSong;
            }
        }return null;
    }
}
