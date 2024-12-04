package src.Classes;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * regisztrációs adatok felvétele
 */
public class Register {
    /**
     * @param user_data felhasználó adatai
     * @param users felhasználó tárolása
     */
    private User users_data;
    private ArrayList<User> users;

    /**
     * Lértehoz egy új példányt felhasználok listának 
     */

    public Register(ArrayList<User> users)
    {
        this.users = users;
    }

    /**
     * Felhasználó adatok felvétele
     * @param user_data
     * @return visszatér a felhasználó adataival
     */

    public ArrayList<User> newUserDatas(User user_data)
    {
        ArrayList<User> users = new ArrayList<>();
        int counter = 0;
        counter = counter + 1;
        System.out.println("Adja meg a felhasznaló nevét: ");
        Scanner inUserData = new Scanner(System.in);
        String username = inUserData.nextLine();
        System.out.println("Adja meg a jelszavát:");
        String password = inUserData.nextLine();
        System.out.println("Adja meg a vezetéknevét: ");
        String firstname = inUserData.nextLine();
        System.out.println("Adja meg a keresztnevét: ");
        String lastname = inUserData.nextLine();
        System.out.println("Adja meg a telefonszámát: ");
        String phonenumber = inUserData.nextLine();
        System.out.println("Adja meg a e-mail címet: ");
        String email = inUserData.nextLine();

        User user1 = new User(counter, username, password, firstname, lastname, phonenumber, email, Role.USER);
        users.add(user1);
        return users;
    } 

}
