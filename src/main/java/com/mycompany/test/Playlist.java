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

public class Playlist {

    private User user;
    private String name;
    private Song[] song_list = new Song[10];
    private int number_of_followers = 0;
    private int number_of_likes = 0;
    private User[] liked_users_list = new User[10];
    private int number_of_songs;
    private User[] followed_users_list = new User[10];

    public Playlist(String name, User user) {
        this.name = name;
        this.user = user;
        if (!(user instanceof StandardUser && user.getNumber_of_created_playlists() >= 3)) {
            user.setNumber_of_created_playlists(user.getNumber_of_created_playlists() + 1);
            for (int i = 0; i < user.users_playlists.length; i++) {
                if (user.users_playlists[i] == null) {
                    user.users_playlists[i] = this;
                    break;
                }
                if (i == user.users_playlists.length - 1) {
                    System.out.println("You cant create more than 10 playlists!");
                    System.out.println("--------------------------------------");
                }
            }
        } else {
            System.out.println(user.getUser_name() + " is s standard user.The user cant create more than 3 playlists!"
            );
            System.out.println("--------------------------------------");
        }
    }

    public void printInfo() {
        System.out.println("Playlist's name is: " + name + "");
        System.out.println("Playlist's songs and the songs artists  are:");
        for (int i = 0; i < song_list.length; i++) {
            if (song_list[i] != null) {
                System.out.println("The song:" + song_list[i].getName() + " ->  Artist of the song: " + song_list[i].getArtist().getName() + " " + song_list[i].getArtist().getSurname());
            }

        }

        System.out.println("This playlist has " + number_of_likes + " likes");
        System.out.println("These users liked this playlist:");
        for (int i = 0; i < liked_users_list.length; i++) {
            if (liked_users_list[i] != null) {
                System.out.println(liked_users_list[i].getUser_name());
            }
        }
        System.out.println("Playlist has " + number_of_followers + " followers");
        System.out.println("These users followed this playlist:");
        for (int i = 0; i < followed_users_list.length; i++) {
            if (followed_users_list[i] != null) {
                System.out.println(followed_users_list[i].getUser_name());
            }
        }
    }

    public void addUsertoFolloweduserslist(User user) {
        for (int i = 0; i < followed_users_list.length; i++) {
            if (followed_users_list[i] == null) {
                followed_users_list[i] = user;

                break;
            }
        }
    }

    public void addUsertoLikeduserslist(User user) {
        for (int i = 0; i < liked_users_list.length; i++) {
            if (liked_users_list[i] == null) {
                liked_users_list[i] = user;

                break;
            }
        }
    }

    public void increment_likes(User user) {

        for (int i = 0; i < liked_users_list.length; i++) {
            if (liked_users_list[i] == null) {
                liked_users_list[i] = user;

                number_of_likes++;
                break;
            }
        }

    }

    public void increment_number_of_followers(User user) {

        number_of_followers++;

    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber_of_likes() {
        return number_of_likes;
    }

    public void setNumber_of_likes(int number_of_likes) {
        this.number_of_likes = number_of_likes;
    }

    public Song[] getSong_list() {
        return song_list;
    }

    public void setSong_list(Song[] song_list) {
        this.song_list = song_list;
    }

    public int getNumber_of_followers() {
        return number_of_followers;
    }

    public void setNumber_of_followers(int number_of_followers) {
        this.number_of_followers = number_of_followers;
    }

    public User[] getLiked_users_list() {
        return liked_users_list;
    }

    public void setLiked_users_list(User[] liked_users_list) {
        this.liked_users_list = liked_users_list;
    }

    public User[] getFollowed_users_list() {
        return followed_users_list;
    }

    public void setFollowed_users_list(User[] followed_users_list) {
        this.followed_users_list = followed_users_list;
    }

    public int getNumber_of_songs() {
        return number_of_songs;
    }

    public void setNumber_of_songs(int number_of_songs) {
        this.number_of_songs = number_of_songs;
    }
}
