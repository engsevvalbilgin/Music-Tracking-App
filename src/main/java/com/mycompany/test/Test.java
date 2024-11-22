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

public class Test {

    public static void main(String[] args) {
        
//        1. Adı girilen şarkıcının bilgilerinin listelenmesi (şarkıcı adı, soyadı, takipçi sayısı, albüm sayısı vb.)
//       Artist a1 = new Artist("OLIVIA", "RODRIGO");
//       PremiumUser user1 = new PremiumUser("şevval");
//        StandardUser user2 = new StandardUser("hilal");
//       Album ar1 = new Album("SOUR", a1, "May 21 2021");
//       Song s1 = new Song("brutal", a1, ar1);
//       Song s2 = new Song("traitor", a1, ar1);
//       Song s3 = new Song("good4u", a1, ar1);
//       user1.followArtist(a1);
//       user2.followArtist(a1);
//       a1.printInfo();
//        2. Adı girilen şarkının bilgilerinin listelenmesi (şarkıcı adı, soyadı,şarkı beğeni sayısı, albüm bilgisi, şarkıyı beğenen kullanıcıların  isimlerinin listelenmesi vb.)
//        Artist a1 = new Artist("OLIVIA", "RODRIGO");
//        PremiumUser user1 = new PremiumUser("şevval");
//        StandardUser user2 = new StandardUser("hilal");
//        Album ar1 = new Album("SOUR", a1, "May 21 2021");
//        Song s1 = new Song("brutal", a1, ar1);
//        Song s2 = new Song("traitor", a1, ar1);
//        Song s3 = new Song("good4u", a1, ar1);
//        user1.likeSong(s1);
//        user2.likeSong(s1);
//        user1.likeSong(s2);
//        s1.printInfo();
//        s2.printInfo();
//        s3.printInfo();
//3. Adı girilen albümün bilgilerinin listelenmesi (albümün sahibi olan şarkıcının adı soyadı, bu albümdeki şarkıların isimleri, albümün takipçi sayısı, albümün beğeni sayısı vb.)
//        Artist a1 = new Artist("OLIVIA", "RODRIGO");
//        PremiumUser user1 = new PremiumUser("şevval");
//        StandardUser user2 = new StandardUser("hilal");
//        Album ar1 = new Album("SOUR", a1, "May 21 2021");
//        Song s1 = new Song("brutal", a1, ar1);
//        Song s2 = new Song("traitor", a1, ar1);
//        Song s3 = new Song("good4u", a1, ar1);
//        user1.followAlbum(ar1);
//        user1.likeAlbum(ar1);
//        ar1.printInfo();
//        4. Adı girilen kullanıcının çalma listeleri listelenmeli (kullanıcı adı,çalma listesi adı, çalma listesindeki şarkılar ve çalma listesinde en çok dinlenen şarkı vb.)  
//        Artist a1 = new Artist("OLIVIA", "RODRIGO");
//        PremiumUser user1 = new PremiumUser("şevval");
//        StandardUser user2 = new StandardUser("hilal");
//        Album ar1 = new Album("SOUR", a1, "May 21 2021");
//        Song s1 = new Song("brutal", a1, ar1);
//        Song s2 = new Song("traitor", a1, ar1);
//        Song s3 = new Song("good4u", a1, ar1);
//        Playlist playlist1 = new Playlist("her şey burda", user1);
//        user1.addSong(s1, playlist1);
//        user1.addSong(s2, playlist1);
//        user1.addSong(s3, playlist1);
//        user2.likePlaylist(playlist1);
//        user1.followPlaylist(playlist1);
//        user1.printUsersPlaylist();
//5. Adı girilen çalma listesinin bilgilerinin listelenmesi (Çalma listesindeki şarkıların isimleri, her bir şarkının hangi şarkıcıya ait olduğunun bilgisi, bu çalma listesini takip eden kullanıcıların isimleri vb.)
//        Artist a1 = new Artist("Olivia", "Rodrigo");
//        Artist a2=new Artist("Taylor", "Swift");
//        PremiumUser user1 = new PremiumUser("şevval");
//        StandardUser user2 = new StandardUser("hilal");
//        Album ar1 = new Album("SOUR", a1, "May 21 2021");
//        Album ar2=new Album("Midnights",a2,"21 October 2022");
//        Song s0=new Song("You're on your own kid",a2,ar2);
//        Song s1 = new Song("brutal", a1, ar1);
//        Song s2 = new Song("traitor", a1, ar1);
//        Song s3 = new Song("good4u", a1, ar1);
//        Playlist playlist1=new Playlist("mutlu playlist",user1);
//        user1.addSong(s1,playlist1);
//        user1.addSong(s2,playlist1);
//        user1.addSong(s3,playlist1);
//        user1.addSong(s0,playlist1);
//        user2.likePlaylist(playlist1);
//        user1.followPlaylist(playlist1);
//        user2.followPlaylist(playlist1);
//        playlist1.printInfo();
//6. En çok takipçiye sahip olan çalma listesinin bilgilerinin listelenmesi.
//        PremiumUser user1 = new PremiumUser("şevval");
//        StandardUser user2 = new StandardUser("hilal");
//        PremiumUser user3 = new PremiumUser("ahmet");
//        Playlist playlist1 = new Playlist("mutlu playlist", user1);
//        Playlist playlist2 = new Playlist("mutsuz playlist", user2);
//        Playlist playlist3 = new Playlist("ok playlist", user1);
//        user1.followPlaylist(playlist1);
//        user2.followPlaylist(playlist1);
//        user3.followPlaylist(playlist1);
//        user1.followPlaylist(playlist2);
//        Istatistik hesap1 = new Istatistik();
//        hesap1.printPlaylistsMaxFollowers(playlist1, playlist2);
//        hesap1.printPlaylistsMaxFollowers(playlist1, playlist2, playlist3);
        // 7.En çok takipçisi olan şarkıcının bilgilerinin listelenmesi
//        Artist a1 = new Artist("Olivia", "Rodrigo");
//        Artist a2 = new Artist("Taylor", "Swift");
//        Artist a3 = new Artist("Selena", "Gomez");
//        PremiumUser user1 = new PremiumUser("şevval");
//        StandardUser user2 = new StandardUser("hilal");
//        Album ar1 = new Album("SOUR", a1, "May 21 2021");
//        Album ar2 = new Album("Midnights", a2, "21 October 2022");
//        Song s0 = new Song("You're on your own kid", a2, ar2);
//        Song s1 = new Song("brutal", a1, ar1);
//        Song s2 = new Song("traitor", a1, ar1);
//        Song s3 = new Song("good4u", a1, ar1);
//        user1.followArtist(a1);
//        user2.followArtist(a1);
//        user1.followArtist(a2);
//        user1.followArtist(a3);
//        user2.followArtist(a3);
//        Istatistik hesap1 = new Istatistik();
//        hesap1.printArtistsMaxFollowers(a3, a2);
//        hesap1.printArtistsMaxFollowers(a1, a2, a3);
//        8.Tüm şarkılar arasından maksimum ve minimum beğeni alan şarkıların bilgileri listelenebilmelidir.
//        Artist a1 = new Artist("Olivia", "Rodrigo");
//        Artist a2 = new Artist("Taylor", "Swift");
//        PremiumUser user1 = new PremiumUser("şevval");
//        PremiumUser user2 = new PremiumUser("ali");
//        StandardUser user3 = new StandardUser("ahmet");
//        StandardUser user4 = new StandardUser("hilal");
//        Album ar1 = new Album("SOUR", a1, "May 21 2021");
//        Album ar2 = new Album("Midnights", a2, "21 October 2022");
//        Song s1 = new Song("brutal", a1, ar1);
//        Song s2 = new Song("traitor", a1, ar1);
//        Song s3 = new Song("Midnight rain", a2, ar2);
//        user3.likeSong(s3);
//        user1.likeSong(s3);
//        user4.likeSong(s3);
//        user2.likeSong(s2);
//        user1.likeSong(s2);
//        user2.likeSong(s1);
//        Istatistik hesap1 = new Istatistik();
//        hesap1.printSongsMaxMinLikes(s1, s2);
//        hesap1.printSongsMaxMinLikes(s1, s2, s3);
//9. Oluşturulan tüm albümler için albüm içerisindeki şarkılar arasından maksimum ve minimum beğeni sayısına sahip şarkının bilgileri listelenmeli. 
//        Artist a1 = new Artist("Olivia", "Rodrigo");
//        Artist a2 = new Artist("Taylor", "Swift");
//        Album ar1 = new Album("SOUR", a1, "May 21 2021");
//        Album ar2 = new Album("Midnights", a2, "21 October 2022");
//        PremiumUser user1 = new PremiumUser("şevval");
//        StandardUser user2 = new StandardUser("hilal");
//        StandardUser user3 = new StandardUser("ahmet");
//        Song s1 = new Song("brutal", a1, ar1);
//        Song s2 = new Song("traitor", a1, ar1);
//        Song s3 = new Song("good4u", a1, ar1);
//        Song s4 = new Song("You're on your own kid", a2, ar2);
//        Song s5 = new Song("Midnight Rain", a2, ar2);
//        user1.likeSong(s1);
//        user2.likeSong(s5);
//        user3.likeSong(s5);
//        user2.likeSong(s1);
//        user2.likeSong(s5);
//        ar1.printmaxLikedSong();
//        ar1.PrintminLikedSong();
//        ar2.printmaxLikedSong();
//        ar2.PrintminLikedSong();
//10. Karmaşık String araması yapılabilir. Örneğin adı * ile başlayan ve adının içerisinde ‘dul’ veya ‘hme’ geçen ve sonu ‘t’ ile biten şarkıcılara ait olan  şarkıların sayısı ekranda gösterilebilir (Not: *
//herhangi bir harf olabilir, büyük veya küçük fark etmez)
//        Artist a1 = new Artist("Olivia", "Rodrigo");
//        Artist a2 = new Artist("Taylor", "Swift");
//        Artist a3 = new Artist("Batuhan", "Kordel");
//        Artist a4 = new Artist("Shawn", "Mendes");
//        Artist a5 = new Artist("Gracie", "Abrams");
//        Artist a6 = new Artist("Tate", "McRae");
//        Album ar1 = new Album("SOUR", a1, "May 21 2021");
//        Album ar2 = new Album("Midnights", a2, "21 October 2022");
//        Album ar3 = new Album("Minor", a5, "14 July 2020");
//        PremiumUser user1 = new PremiumUser("şevval");
//        StandardUser user2 = new StandardUser("hilal");
//        Song s1 = new Song("brutal", a1, ar1);
//        Song s2 = new Song("traitor", a1, ar1);
//        Song s3 = new Song("good4u", a1, ar1);
//        Song s4 = new Song("You're on your own kid", a2, ar2);
//        Song s5 = new Song("Midnight Rain", a2, ar2);
//        Song s6 = new Song("Friend ", a5, ar3);
//        Artist[] allArtists = {a1, a2, a3, a4, a5, a6};
//        user1.searchFirstlettersOfArtistName(allArtists, "gr");
//        user1.searchFirstlettersOfArtistName(allArtists, "GR");
//        user1.searchLasttlettersOfArtistName(allArtists, "ia");
//        user1.searchLasttlettersOfArtistName(allArtists, "İA");
//        user1.searchinArtistsName(allArtists, "ol");
//        user1.searchinArtistsName(allArtists, "OL");
//11. Çalma Listesi İşlemleri i. Kullanıcı çalma listesinden herhangi bir şarkıyı silebilir. Fakat 
//sadece bu çalma listesinin sahibi olan kullanıcı istediği şarkıyı silebilir.
//        Artist a1 = new Artist("Olivia", "Rodrigo");
//        Artist a2 = new Artist("Taylor", "Swift");
//        Album ar1 = new Album("SOUR", a1, "May 21 2021");
//        Album ar2 = new Album("Midnights", a2, "21 October 2022");
//        PremiumUser user1 = new PremiumUser("şevval");
//        StandardUser user2 = new StandardUser("hilal");
//        Song s1 = new Song("brutal", a1, ar1);
//        Song s2 = new Song("traitor", a1, ar1);
//        Song s3 = new Song("good4u", a1, ar1);
//        Song s4 = new Song("You're on your own kid", a2, ar2);
//        Song s5 = new Song("Midnight Rain", a2, ar2);
//        Playlist playlist = new Playlist("Playlist of my life", user1);
//        user1.addSong(s5, playlist);
//        user1.addSong(s2, playlist);
//        user2.removeSong(s5, playlist);
//        user2.addSong(s1, playlist);
//        playlist.printInfo();
//12. En az iki farklı kullanıcı tipi olmalı. Bu kullanıcı tipleri farklı haklara sahip olmalı. Kullanıcılara verilecek haklara sizin belirlemeniz 
//gerekmektedir. Örneğin: Premium kullanıcı diğer kullanıcılardan daha fazla şarkıyı çalma listesine ekleyebilir ya da standart kullanıcı sadece 
        // 2 adet çalma listesi oluşturabilir gibi...Benimki-->Premium ve standart user farkı:Premium 10 playlist oluşturabilir.Standart 3.Premium şarkı indirebilir.Standart indiremez
//        Artist a1 = new Artist("Olivia", "Rodrigo");
//        Artist a2 = new Artist("Taylor", "Swift");
//        Album ar1 = new Album("SOUR", a1, "May 21 2021");
//        Album ar2 = new Album("Midnights", a2, "21 October 2022");
//        PremiumUser user1 = new PremiumUser("şevval");
//        StandardUser user2 = new StandardUser("hilal");
//        Song s1 = new Song("brutal", a1, ar1);
//        Song s2 = new Song("traitor", a1, ar1);
//        Song s3 = new Song("good4u", a1, ar1);
//        Song s4 = new Song("You're on your own kid", a2, ar2);
//        Song s5 = new Song("Midnight Rain", a2, ar2);
//        Playlist playlist = new Playlist("Playlist of my life", user1);
////        //user2 dört playlist oluşturamaz
//        Playlist playlist2 = new Playlist("Playlist of my life", user2);
//        Playlist playlist3 = new Playlist("Second PLaylist of user2", user2);
//        Playlist playlist4 = new Playlist("3rd  PLaylist of user2", user2);
//        Playlist playlist5 = new Playlist("4th PLaylist of user2", user2);
//        user2.printUsersPlaylist();
        //premium user olan user1in indirilen şarkılarını da yazar
//        user1.downloadThesong(s5);
//        user1.printInfo();
//        //standart user da bunu yapmaz
//        user2.printInfo();
//13. Kullanıcılar, farklı şarkı ve albümleri beğenebilir; farklı çalma listeleri oluşturabilir, farklı albümleri, sanatçıları ve çalma listelerini takip edebilir.
        Artist a1 = new Artist("Olivia", "Rodrigo");
        Artist a2 = new Artist("Taylor", "Swift");
        Album ar1 = new Album("SOUR", a1, "May 21 2021");
        Album ar2 = new Album("Midnights", a2, "21 October 2022");
        PremiumUser user1 = new PremiumUser("şevval");
        StandardUser user2 = new StandardUser("hilal");
        Song s1 = new Song("brutal", a1, ar1);
        Song s2 = new Song("traitor", a1, ar1);
        Song s3 = new Song("good4u", a1, ar1);
        Song s4 = new Song("You're on your own kid", a2, ar2);
        Song s5 = new Song("Midnight Rain", a2, ar2);
        Playlist playlist = new Playlist("Playlist of my life", user1);
        Playlist playlist2 = new Playlist("Playlist of my life", user2);
        user1.followAlbum(ar1);
        user2.followAlbum(ar2);
        user1.followPlaylist(playlist);
        user2.followPlaylist(playlist2);
        user1.followArtist(a2);
        user2.followArtist(a1);
        user1.likeSong(s1);
        user2.likeSong(s3);
        user1.likeAlbum(ar1);
        ar1.printInfo();

    }
}
