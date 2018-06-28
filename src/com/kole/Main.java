package com.kole;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

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

        System.out.println("***************************************************");

        play(playList);

    }

    public static void play(LinkedList<Song> playList){
        ListIterator<Song> listIterator = playList.listIterator();
        displayMenu();
        boolean quit = false;

        while (!quit){
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    displayMenu();
                    break;
                case 1:
                    if (listIterator.hasNext()){
                        System.out.println("Now playing " + listIterator.next().toString());
                    }else {
                        System.out.println("Reached end of playlist");
                    }
                    break;
                case 2:
                    if (listIterator.hasPrevious()){
                        System.out.println("Now playing " + listIterator.previous().toString());
                    }else {
                        System.out.println("Reached start of playlist");
                    }
                    break;
                case 3:
                    if (listIterator.hasPrevious()){
                        listIterator.previous();
                        System.out.println("Replaying song " + listIterator.next().toString());
                    }else {
                        System.out.println("Reached end of the list");
                    }
                    break;
                case 4:
                    listSongs(playList);
                    break;
                case 5:
                    System.out.println("Removed last played song");
                    listIterator.remove();
                    break;
                case 6:
                    System.out.println("Quitting player");
                    quit=true;
                    break;
            }
        }
    }

    private static void displayMenu(){
        System.out.println("Please enter a choice");
        System.out.println("0 - to display this menu");
        System.out.println("1 = to play next song in list");
        System.out.println("2 - to play previous song in the list");
        System.out.println("3 - to replay current song");
        System.out.println("4 - to list songs in playlist");
        System.out.println("5 - to remove current song");
        System.out.println("6 - to quit this player");
    }

    private static void listSongs(LinkedList<Song> playList){
        ListIterator<Song> listIterator = playList.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
    }

    private static void playNextSong(LinkedList<Song> playList){
        ListIterator<Song> listIterator = playList.listIterator();
        if (listIterator.hasNext()){
            System.out.println("Now playing " + listIterator.next().toString());
        }else {
            System.out.println("Reached end of playlist");
        }
    }

    private static void playPreviousSong(LinkedList<Song> playList){
        ListIterator<Song> listIterator = playList.listIterator();
        if (listIterator.hasPrevious()){
            System.out.println("Now playing " + listIterator.previous().toString());
        }else {
            System.out.println("Reached start of playlist");
        }
    }
}
