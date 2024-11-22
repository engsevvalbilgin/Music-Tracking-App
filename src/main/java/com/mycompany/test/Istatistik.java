/**
 *@file ŞevvalBilğinProje2
 * @descriptionkullanıcıların şarkı,çalma listesi ve albümleri beğenip takip edecekleri,aynı zamanda şarkıları indirebileceleri bir müzik yayın uygulamasıdır.
 * @assignment 2.Proje
 * @date 25.11.2022
 * @author Şevval Bilğin// sevval.bilgin@stu.fsm.edu.tr
 */
package com.mycompany.test;
public class Istatistik {

    public Istatistik() {
    }

    public void printArtistsMaxFollowers(Artist a1, Artist a2) {
        int a = a1.getNumber_of_followers();
        int b = a2.getNumber_of_followers();
        if (a > b) {
            System.out.println("Max followed artist is: " + a1.getName() + " " + a1.getSurname());
            a1.printInfo();
            System.out.println("------------------------------------------------");
        } else if (a == b) {
            System.out.println("Number of" + a1.getName() + " " + a1.getSurname() + "'s followers and" + a2.getName() + "  " + a2.getSurname() + "'s followers are same!.They have " + a1.getNumber_of_followers() + "followers");
            a1.printInfo();
            a2.printInfo();
            System.out.println("------------------------------------------------");
        } else {
            System.out.println("Max followed artist is: " + a2.getName());
            a2.printInfo();
            System.out.println("------------------------------------------------");
        }
    }

    public void printArtistsMaxFollowers(Artist a1, Artist a2, Artist a3) {
        int a = a1.getNumber_of_followers();
        int b = a2.getNumber_of_followers();
        int c = a3.getNumber_of_followers();

        int[] array = {a, b, c};
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        if (a == array[2]) {
            System.out.println("Max followed artist is" + a1.getName()+ " " + a1.getSurname());
            a1.printInfo();
            System.out.println("------------------------------------------------");
        } else if (b == array[2]) {
            System.out.println("Most followed artist is" + a2.getName()+ " " + a2.getSurname());
            a2.printInfo();
            System.out.println("------------------------------------------------");
        } else {
            System.out.println("Most followed artist is" + a3.getName()+ " " + a3.getSurname());
            a3.printInfo();
            System.out.println("------------------------------------------------");
        }
    }

    public void printPlaylistsMaxFollowers(Playlist p1, Playlist p2) {
        int a = p1.getNumber_of_followers();
        int b = p2.getNumber_of_followers();
        if (a > b) {
            System.out.println("Max followed playlist is: " + p1.getName());
            p1.printInfo();
        } else if (a == b) {
            System.out.println("Number of" + p1.getName() + "'s followers and" + p2.getName() + "'s followers are same!.They have " + p1.getNumber_of_followers() + "followers");
            p1.printInfo();
            p2.printInfo();
        } else {
            System.out.println("Max followed playlist is: " + p2.getName());
            p2.printInfo();

        }
    }

    public void printPlaylistsMaxFollowers(Playlist p1, Playlist p2, Playlist p3) {
        int a = p1.getNumber_of_followers();
        int b = p2.getNumber_of_followers();
        int c = p3.getNumber_of_followers();

        int[] array = {a, b, c};
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        if (a == array[2]) {
            System.out.println("Most followed playlist is" + p1.getName());
            p1.printInfo();
        } else if (b == array[2]) {
            System.out.println("Most followed playlist is" + p2.getName());
            p2.printInfo();
        } else {
            System.out.println("Most followed playlist is" + p3.getName());
            p3.printInfo();
        }
    }

    public void printSongsMaxMinLikes(Song song1, Song song2) {
        if (song1.getNumber_of_likes() > song2.getNumber_of_likes()) {
            System.out.println(song1.getName() + " has max likes,it has " + song1.getNumber_of_likes() + " likes");
            song1.printInfo();
            System.out.println("------------------------------------");
            System.out.println(song2.getName() + "has min likes,it has " + song2.getNumber_of_likes() + " likes");
            song2.printInfo();
            System.out.println("------------------------------------");
        } else if (song1.getNumber_of_likes() < song2.getNumber_of_likes()) {
            System.out.println(song2.getName() + " has most likes,it has " + song2.getNumber_of_likes() + " likes");
            song2.printInfo();
            System.out.println("------------------------------------");
            System.out.println(song1.getName() + " has min likes,it has " + song1.getNumber_of_likes() + " likes");
            song1.printInfo();
            System.out.println("------------------------------------");
        } else {
            System.out.println("They have same likes!and number of likes is: " + song1.getNumber_of_likes());
        }
    }

    public void printSongsMaxMinLikes(Song song1, Song song2, Song song3) {
        Song[] a = {song1, song2, song3};
        int[] array = {song1.getNumber_of_likes(), song2.getNumber_of_likes(), song3.getNumber_of_likes()};
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Most liked song has " + array[array.length - 1] + " likes");
        if (array[2] == song1.getNumber_of_likes()) {
            song1.printInfo();
            System.out.println("------------------------------------");
        } else if (array[2] == song2.getNumber_of_likes()) {
            song2.printInfo();
            System.out.println("------------------------------------");
        } else {
            song3.printInfo();
            System.out.println("------------------------------------");
        }
        System.out.println("Least liked song has " + array[0] + " likes");
        if (array[0] == song1.getNumber_of_likes()) {
            song1.printInfo();
            System.out.println("------------------------------------");
        } else if (array[0] == song2.getNumber_of_likes()) {
            song2.printInfo();
            System.out.println("------------------------------------");
        } else {
            song3.printInfo();
        }
    }
}
