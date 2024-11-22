/**
 *@file ŞevvalBilğin
 * @descriptionkullanıcıların şarkı,çalma listesi ve albümleri beğenip takip
 * edecekleri,aynı zamanda şarkıları indirebileceleri bir müzik yayın
 * uygulamasıdır.
 
 * @author Şevval Bilğin
 */
package com.mycompany.test;

public class Artist {

    private String name;
    private String surname;
    private int number_of_followers;
    private int number_of_albums;
    private Album[] albums = new Album[10];
    private User[] followers = new User[10];

    public Artist(String name, String surname) {
        this.name = name;
        this.surname = surname;
        albums = new Album[10];
        followers = new User[10];

    }

    public Artist(String nickname) {
        this.name = nickname;
        this.surname = "";
        albums = new Album[10];
        followers = new User[10];
    }

    public void printInfo() {
        System.out.println("Artists info: ");
        System.out.println("Name " + this.getName());
        System.out.println("Surname " + this.getSurname());
        System.out.println("Number of of his/her followers are " + number_of_followers);
        System.out.println("Her followers are:");
        for (int i = 0; i < number_of_followers; i++) {
            if (followers[i] != null) {
                System.out.println(followers[i].getUser_name());
            }
        }
        System.out.println("Number of of his/her albums are " + number_of_albums);
        System.out.println("Her albums are:");
        for (int i = 0; i < albums.length; i++) {
            if (albums[i] != null) {
                System.out.println(albums[i].getName());
            }

        }

    }

    public void addFollowers(User user) {
        for (int i = 0; i < followers.length; i++) {
            if (followers[i] == null) {
                followers[i] = user;
                break;
            }

        }

    }

    public void addAlbum(Album album) {

        for (int i = 0; i < albums.length; i++) {
            if (albums[i] == null) {
                albums[i] = album;
                break;
            }
            if (!album.getName().equalsIgnoreCase(albums[i].getName())) {
                albums[i].setName(album.getName());
            }
        }
    }

    public void increment_number_of_followers() {
        number_of_followers++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getNumber_of_followers() {
        return number_of_followers;
    }

    public void setNumber_of_followers(int number_of_followers) {
        this.number_of_followers = number_of_followers;
    }

    public int getNumber_of_albums() {
        return number_of_albums;
    }

    public void setNumber_of_albums(int number_of_albums) {
        this.number_of_albums = number_of_albums;
    }

    public Album[] getAlbums() {
        return albums;
    }

    public void setAlbums(Album[] albums) {
        this.albums = albums;
    }

    public User[] getFollowers() {
        return followers;
    }

    public void setFollowers(User[] followers) {
        this.followers = followers;
    }
}
