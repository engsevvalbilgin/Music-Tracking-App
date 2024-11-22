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

public class Song {

    private String name;
    private Album album;
    private Artist artist;
    private int number_of_likes = 0;
    private User[] liked_users_list;

    public Song(String name, Artist artist, Album album) {
        this.name = name;
        this.artist = artist;
        this.album = album;
        album.addSong(this);
        this.liked_users_list = new User[10];
    }

    public void printInfo() {
        System.out.println("Songs name is " + name);
        System.out.println("Song is in the " + album.getName() + " album");
        System.out.println("Songs artist is " + artist.getName() + " " + artist.getSurname());
        System.out.println("Song has " + number_of_likes + " likes");
        System.out.println("These users liked this song: ");
        for (int i = 0; i < liked_users_list.length; i++) {
            if (liked_users_list[i] != null) {
                System.out.println(liked_users_list[i].getUser_name());

            }
        }
    }

    public void increment_number_of_likes(User user) {

        for (int i = 0; i < liked_users_list.length; i++) {
            if (liked_users_list[i] == null) {
                liked_users_list[i] = user;
                number_of_likes++;
                break;
            }
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public int getNumber_of_likes() {
        return number_of_likes;
    }

    public void setNumber_of_likes(int number_of_likes) {
        this.number_of_likes = number_of_likes;
    }

    public User[] getLiked_users_list() {
        return liked_users_list;
    }

    public void setLiked_users_list(User[] liked_users_list) {
        this.liked_users_list = liked_users_list;
    }

}
