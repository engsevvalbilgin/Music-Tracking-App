/**
 *@file ŞevvalBilğin
 * @descriptionkullanıcıların şarkı,çalma listesi ve albümleri beğenip takip edecekleri,aynı zamanda şarkıları indirebileceleri bir müzik yayın uygulamasıdır.

 * @author Şevval Bilğin
 */
package com.mycompany.test;
public class PremiumUser extends User {
   private int downloaded_songs;
    private Song[] downloaded_song_list=new Song[10];

    public PremiumUser(String user_name) {
        super(user_name);
       this.downloaded_song_list= new Song[10];
    }

    @Override
    public void printInfo() {
       
        System.out.println("Users name is " + this.getUser_name());
        System.out.println("Users user type is premium");
        System.out.println("This user has downloaded "+this.getDownloaded_songs()+"songs.The songs are:");
        for (int i = 0; i < downloaded_song_list.length; i++) {
            if(downloaded_song_list[i]!=null){
                System.out.println(downloaded_song_list[i].getName());
        }}
        System.out.println("Number of created playlists is: " + this.getNumber_of_created_playlists());
        System.out.println("Users playlists are:");

        for (int i = 0; i < this.getNumber_of_created_playlists(); i++) {
            if (users_playlists[i].getName() != null) {
                System.out.println(users_playlists[i].getName());
            }
        }
        System.out.println("This playlists songs are:");
        for (int j = 0; j < users_playlists.length; j++) {
            if (users_playlists[j] != null) {
                for (int k = 0; k < users_playlists.length; k++) {
                    if (users_playlists[j].getSong_list()[k] != null) {
                        System.out.println((users_playlists[j].getSong_list()[k]).getName());
                    }
                }
            }

        }
        System.out.println("-----------------------------");
    }
    public void downloadThesong(Song song){
    this.increment_number_of_downloaded_songs();
    this.addDownloadedSongsList(song);}
    public void addDownloadedSongsList(Song song){
        for (int i = 0; i < downloaded_song_list.length; i++) {
            if(downloaded_song_list[i]==null){
            downloaded_song_list[i]=song;
            break;
            }
            if(i==downloaded_song_list.length-1){
                System.out.println("You cant download more songs!!");
            }
        }
    }

    private void increment_number_of_downloaded_songs() {
        this.setDownloaded_songs(this.getDownloaded_songs()+1);
        
    }

    public int getDownloaded_songs() {
        return downloaded_songs;
    }

    public void setDownloaded_songs(int downloaded_songs) {
        this.downloaded_songs = downloaded_songs;
    }

    public Song[] getDownloaded_song_list() {
        return downloaded_song_list;
    }

    public void setDownloaded_song_list(Song[] song_list) {
        this.downloaded_song_list = song_list;
    }
    }

    


    

   

