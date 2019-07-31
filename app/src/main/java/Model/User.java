package Model;

public class User {
    private int id;
    private String FName,LName,Email;

    public User(String FName, String LName, String email) {
        this.FName = FName;
        this.LName = LName;
        Email = email;
    }

    public int getId() {
        return id;
    }

    public String getFName() {
        return FName;
    }

    public String getLName() {
        return LName;
    }

    public String getEmail() {
        return Email;
    }
}
