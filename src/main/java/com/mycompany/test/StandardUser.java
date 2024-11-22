/**
 *@file ŞevvalBilğinProje2
 * @descriptionkullanıcıların şarkı,çalma listesi ve albümleri beğenip takip edecekleri,aynı zamanda şarkıları indirebileceleri bir müzik yayın uygulamasıdır.
 * @assignment 2.Proje
 * @date 25.11.2022
 * @author Şevval Bilğin// sevval.bilgin@stu.fsm.edu.tr
 */
package com.mycompany.test;

public class StandardUser extends User {

    public StandardUser(String user_name) {
        super(user_name);
    }

    @Override
    public void printInfo() {
        System.out.println("Users name is " + this.getUser_name());
        System.out.println("Users user type is standard");
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

}
