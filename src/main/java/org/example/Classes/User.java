package org.example.Classes;

/**
 * felhasználok a adatai
 */
public class User {
    /**
     * @param id
     * @param username
     * @param password
     * @param FirstName
     * @param Lastname
     * @param phonenumber
     * @param email
     * @param role
     */
    private int id;
    private String username;
    private String password;
    private String FirstName;
    private String Lastname;
    private String phonenumber;
    private String email;
    private Role role;

    /**
     * Lértehoz egy új példányt id, felhasználónév, jelszó, vezetéknév, keresztnév, telefonszám, email és felhasználó típus
     */

    public User(int id, String username, String password, String FirstName, String Lastname, String phonenumber, String email, Role role)
    {
        this.FirstName = FirstName;
        this.Lastname = Lastname;
        this.email = email;
        this.id = id;
        this.password = password;
        this.phonenumber = phonenumber;
        this.username = username;
        this.role = role;
    }

    /**
     * beállítja a e-mail címet 
     */

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * beállítja a vezetéknevet 
     */

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    /**
     * beállítja az ID-t
     */

    public void setId(int id) {
        this.id = id;
    }

    /**
     * beállítja a keresztnevet
     */

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    /**
     * beállítja a jelszót
     */

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * beállítja a telefonszámot 
     */

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    /**
     * beállítja a jogosultságot
     */

    public void setRole(Role role) {
        this.role = role;
    }

    /**
     * beállítja a felhasználónevet 
     */

    public void setUsername(String username) {
        this.username = username;
    }

    /** 
     * @return visszadja a e-mail-t
     */

    public String getEmail() {
        return email;
    }
    
    /** 
     * @return visszadja a vezetéknevet
     */

    public String getFirstName() {
        return FirstName;
    }

    /** 
     * @return visszadja az ID-t
     */

    public int getId() {
        return id;
    }

    /** 
     * @return visszadja a keresztnevet
     */

    public String getLastname() {
        return Lastname;
    }

    /** 
     * @return visszadja a jelszót
     */

    public String getPassword() {
        return password;
    }

    /** 
     * @return visszadja a telefonszámot
     */

    public String getPhonenumber() {
        return phonenumber;
    }

    /** 
     * @return visszadja a jogodultságot
     */

    public Role getRole() {
        return role;
    }

    /** 
     * @return visszadja a felhasználót
     */

    public String getUsername() {
        return username;
    }
}
