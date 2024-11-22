/**
 *@file ŞevvalBilğinProje2
 * @descriptionkullanıcıların şarkı,çalma listesi ve albümleri beğenip takip
 * edecekleri,aynı zamanda şarkıları indirebileceleri bir müzik yayın
 * uygulamasıdır.
 * @assignment 2.Proje
 * @date 25.11.2022
 * @author Şevval Bilğin// sevval.bilgin@stu.fsm.edu.tr
 */
package com.mycompany.test;

public abstract class User {

    private String user_name;
    private String user_type;
    private int number_of_created_playlists;
    public Playlist[] users_playlists = new Playlist[10];

    public User(String user_name) {
        this.user_name = user_name;

        if (this instanceof PremiumUser) {
            this.users_playlists = new Playlist[10];
        }
        if (this instanceof StandardUser) {
            this.users_playlists = new Playlist[3];
        }
    }

    public abstract void printInfo();

    public void printUsersPlaylist() {
        for (int i = 0; i < users_playlists.length; i++) {
            if (users_playlists[i] != null) {
                users_playlists[i].printInfo();
                System.out.println("-----------------------------");
            }
        }
    }

    public void removeSong(Song song, Playlist playlist) {
        if (playlist.getUser() == this) {

            for (int i = 0; i < playlist.getSong_list().length; i++) {
                if (playlist.getSong_list()[i].equals(song)) {
                    playlist.getSong_list()[i] = null;
                    playlist.getSong_list()[i].equals(playlist.getSong_list()[i - 1]);
                }
            }

        } else {
            System.out.println(this.getUser_name() + " cant remove a song,because this user is not the owner of playlist!!");
            System.out.println("-----------------------------");
        }
    }

    public void addSong(Song song, Playlist playlist) {
        if (playlist.getUser() == this) {
            for (int i = 0; i < playlist.getSong_list().length; i++) {
                if (playlist.getSong_list()[i] == null) {
                    playlist.getSong_list()[i] = song;
                    playlist.setNumber_of_songs(playlist.getNumber_of_songs() + 1);
                    break;
                }

            }

        } else {
            System.out.println(this.getUser_name() + " cant add a song to the playlist because this user is not the owner of playlist!!");
            System.out.println("-----------------------------");
        }
    }

    public void searchinArtistsName(Artist[] artistList, String searched_word) {
        int sayi = 0;
        searched_word = searched_word.toLowerCase();
        for (int i = 0; i < artistList.length; i++) {
            String str = artistList[i].getName().toLowerCase();

            if ((str.contains(searched_word))) {
                sayi++;
                if (artistList[i] != null) {
                    for (int j = 0; j < artistList[i].getNumber_of_albums(); j++) {

                        System.out.print("In " + artistList[i].getAlbums()[j].getName() + " album,There're");
                        System.out.println(artistList[i].getAlbums()[j].getNumber_of_songs() + " songs");
                    }
                }
            }

        }
        System.out.println("There're " + sayi + " Artists that contains " + " ' " + searched_word + " ' word");
        System.out.println("-------------------------------------");
    }

    public void searchFirstlettersOfArtistName(Artist[] artistList, String searched_word) {
        int sayi = 0;
        searched_word = searched_word.toLowerCase();
        for (int i = 0; i < artistList.length; i++) {
            String str = artistList[i].getName().toLowerCase();

            if ((str.contains(searched_word)) && (str.substring(0, searched_word.length()).equalsIgnoreCase(searched_word))) {
                sayi++;
                if (artistList[i] != null) {
                    for (int j = 0; j < artistList[i].getNumber_of_albums(); j++) {

                        System.out.print("In " + artistList[i].getName() + "'s " + artistList[i].getAlbums()[j].getName() + " album,There're ");
                        System.out.println(artistList[i].getAlbums()[j].getNumber_of_songs() + " songs");
                    }
                }
            }

        }
        System.out.println("There're " + sayi + " Artists that starts with " + " ' " + searched_word + " ' word");
        System.out.println("-------------------------------------");
    }

    public void searchLasttlettersOfArtistName(Artist[] artistList, String searched_word) {
        int sayi = 0;
        searched_word = searched_word.toLowerCase();
        for (int i = 0; i < artistList.length; i++) {
            String str = artistList[i].getName().toLowerCase();

            if ((str.contains(searched_word)) && (str.substring(str.length() - searched_word.length(), str.length()).equalsIgnoreCase(searched_word))) {
                sayi++;
                if (artistList[i] != null) {
                    for (int j = 0; j < artistList[i].getNumber_of_albums(); j++) {

                        System.out.print("In " + artistList[i].getName() + "'s " + artistList[i].getAlbums()[j].getName() + " album,There're ");
                        System.out.println(artistList[i].getAlbums()[j].getNumber_of_songs() + " songs");
                    }
                }
            }

        }
        System.out.println("There're " + sayi + " Artists that ends with " + " ' " + searched_word + " ' word");
        System.out.println("-------------------------------------");
    }

    public void likeSong(Song song) {
        song.increment_number_of_likes(this);

    }

    public void likeAlbum(Album album) {
        album.increment_number_of_likes(this);
    }

    public void likePlaylist(Playlist playlist) {
        playlist.increment_likes(this);

    }

    public void followPlaylist(Playlist playlist) {
        playlist.increment_number_of_followers(this);
        playlist.addUsertoFolloweduserslist(this);
    }

    public void followAlbum(Album album) {

        album.increment_number_of_followers(this);
    }

    public void followArtist(Artist artist) {
        artist.increment_number_of_followers();
        artist.addFollowers(this);
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_type() {
        return user_type;
    }

    public void setUser_type(String user_type) {
        this.user_type = user_type;
    }

    public int getNumber_of_created_playlists() {
        return number_of_created_playlists;
    }

    public void setNumber_of_created_playlists(int number_of_created_playlists) {
        this.number_of_created_playlists = number_of_created_playlists;
    }

    public void getUsers_playlists_names() {
        for (int i = 0; i < users_playlists.length; i++) {
            if (users_playlists[i] != null) {
                System.out.println(users_playlists[i].getName());
            }
        }

    }

    public Playlist[] getUsers_playlists() {
        return users_playlists;
    }

    public void setUsers_playlists(Playlist[] users_playlists) {
        this.users_playlists = users_playlists;
    }
}
