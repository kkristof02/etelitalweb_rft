package src.Classes;

public class User {
    private int id;
    private String username;
    private String password;
    private String FirstName;
    private String Lastname;
    private String phonenumber;
    private String email;
    private Role role;

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

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return FirstName;
    }

    public int getId() {
        return id;
    }

    public String getLastname() {
        return Lastname;
    }

    public String getPassword() {
        return password;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public Role getRole() {
        return role;
    }

    public String getUsername() {
        return username;
    }
}
