package zjazd_2.zadanie_1;

public class User {

    private String name;
    private String surname;
    private String email;
    private String password;
    private boolean guest;

    public User(String name, String surname, String email, String password) {
        if (name == null || surname == null || email == null || password == null) {
            throw new IllegalArgumentException("Name, Surename, Email i Password muszą zostac podane");
        }
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.guest = false;
    }

    public User(String email) {
        if (email == null) {
            throw new IllegalArgumentException("Email musi zostać podany");
        }
        this.email = email;
        this.guest = true;
    }

    public void changeFromGuestToUser(String name, String surname, String password) {
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.guest = false;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", guest=" + guest +
                '}';
    }
}
