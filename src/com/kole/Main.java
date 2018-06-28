package com.kole;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Album> albums = new ArrayList<>();
        LinkedList<Song> playList = new LinkedList<>();

        Album album = new Album("Reload", "Metallica");

        albums.add(album);

        System.out.println("***************************************************");

        album.addSongToAlbum("Fuel", 4.30);
        album.addSongToAlbum("Slither", 5.13);
        album.addSongToAlbum("Bad Seed", 4.05);
        album.addSongToAlbum("Prince Charming", 6.05);

        album = new Album("Sol Invictus", "Faith No More");

        albums.add(album);

        System.out.println("***************************************************");

        album.addSongToAlbum("Superhero", 5.16);
        album.addSongToAlbum("Motherfucker", 3.31);
        album.addSongToAlbum("Matador", 6.09);
        album.addSongToAlbum("Cone Of Shame", 4.40);

        System.out.println("***************************************************");

        albums.get(0).addSongToPlayList("Fuel", playList);
        albums.get(0).addSongToPlayList("Slither", playList);
        albums.get(0).addSongToPlayList("Bad Seed", playList);
        albums.get(1).addSongToPlayList("Superhero", playList);
        albums.get(1).addSongToPlayList("Matador", playList);
        albums.get(1).addSongToPlayList("Cone Of Shame", playList);





    }
}
