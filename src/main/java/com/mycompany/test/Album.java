/**
 *@file ŞevvalBilğin
 * @descriptionkullanıcıların şarkı,çalma listesi ve albümleri beğenip takip edecekleri,aynı zamanda şarkıları indirebileceleri bir müzik yayın uygulamasıdır.
 
 * @date 25.11.2022
 * @author Şevval Bilğin// 
 */
package com.mycompany.test;
public class Album {

    private String name;
    private Artist artist;
    private String release_date;
    private Song[] song_list = new Song[10];
    private User[] followed_users = new User[10];
    private User[] liked_users = new User[10];
    private int number_of_songs;
    private int number_of_followers = 0;
    private int number_of_likes = 0;

    

    public Album(String name, Artist artist, String release_date) {
        this.name = name;
        this.artist = artist;
        artist.addAlbum(this);
        artist.setNumber_of_albums(artist.getNumber_of_albums() + 1);
        this.release_date = release_date;
        this.song_list = new Song[10];
        this.followed_users = new User[10];
        this.liked_users = new User[10];

    }

    public void printInfo() {
        System.out.println("Albums name is " + name);
        System.out.println("The artist is " + artist.getName() + " " + artist.getSurname());
        System.out.println("Albums release date is " + release_date);
        System.out.println("Albums songs are;");
        for (int i = 0; i < song_list.length; i++) {
            if (song_list[i] != null) {
                System.out.println(song_list[i].getName());
            }
        }
        System.out.println("Album has" + number_of_songs + "songs");
        System.out.println("Album has" + number_of_followers + "followers");
        System.out.println("The followers are:");
        for (int i = 0; i < followed_users.length; i++) {
            if (followed_users[i] != null) {
                System.out.println(followed_users[i].getUser_name());
            }
        }
        System.out.println("Album has" + number_of_likes + "likes");
        System.out.println("These users liked album:");
        for (int i = 0; i < liked_users.length; i++) {
            if (liked_users[i] != null) {
                System.out.println(liked_users[i].getUser_name());
            }
        }
    }

    public void addUserToFollowedUsers(User user) {
        for (int i = 0; i < followed_users.length; i++) {
            if (followed_users[i] == null) {
                followed_users[i] = user;

                break;
            }
        }
    }

    public void addSong(Song song) {
        for (int i = 0; i < song_list.length; i++) {
            if (song_list[i] == null) {
                song_list[i] = song;
                number_of_songs++;
                break;
            }
        }

    }

    public void printmaxLikedSong() {
        int max = 0;
        int max_idx = 0;
        for (int i = 0; i < song_list.length; i++) {
            if ((song_list[i] != null) && (song_list[i].getNumber_of_likes() > max)) {

                max_idx = i;
                max = song_list[i].getNumber_of_likes();
            }
        }

        System.out.println("Max liked song has " + max + " likes");
        song_list[max_idx].printInfo();
        System.out.println("---------------------------------");
    }

    public void PrintminLikedSong() {
        int min = Integer.MAX_VALUE;
        int min_idx = 0;
        for (int i = 0; i < song_list.length; i++) {
            if (song_list[i] != null) {
                if (song_list[i].getNumber_of_likes() < min) {
                    min_idx = i;
                    min = song_list[i].getNumber_of_likes();
                }
            }
        }
        System.out.println("Min liked song has " + min + " likes");
        song_list[min_idx].printInfo();
        System.out.println("---------------------------------");

    }

    public void increment_number_of_likes(User user) {

        for (int i = 0; i < liked_users.length; i++) {
            if (liked_users[i] == null) {
                liked_users[i] = user;
                number_of_likes++;
                break;
            }
        }

    }

    public void increment_number_of_followers(User user) {
        this.addUserToFollowedUsers(user);
        number_of_followers++;

    }

    public int getNumber_of_likes() {
        return number_of_likes;
    }

    public void setNumber_of_likes(int number_of_likes) {
        this.number_of_likes = number_of_likes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    public Song[] getSong_list() {

        return song_list;

    }

    public int getNumber_of_followers() {
        return number_of_followers;
    }

    public void setNumber_of_followers(int number_of_followers) {
        this.number_of_followers = number_of_followers;
    }

    public User[] getFollowed_users() {
        return followed_users;
    }

    public void setFollowed_users(User[] followed_users) {
        this.followed_users = followed_users;
    }

    public User[] getLiked_users() {
        return liked_users;
    }

    public void setLiked_users(User[] liked_users) {
        this.liked_users = liked_users;
    }

    public int getNumber_of_songs() {
        return number_of_songs;
    }

    public void setNumber_of_songs(int number_of_songs) {
        this.number_of_songs = number_of_songs;
    }
}
