package zjazd_2.zadanie_1;

public class RunProgram {

    public static void main(String[] args) {
        String name = "Jan";
        String surname = "Kowalski";
        String email = "jan.kowalski@wp.pl";
        String email2 = "jan.maria.kowalski@wp.pl";
        String email3 = "maria.kowalska@wp.pl";
        String password = "haslo1";

        User user_1 = new User(name, surname, email, password);
        User user_2 = new User(email2);
        User user_3 = new User(email3);
        System.out.println(user_1.toString());
        System.out.println(user_2.toString());
        System.out.println(user_3.toString());

        user_3.changeFromGuestToUser("Maria", "Kawalska", "haselko2");

        System.out.println(user_3.toString());

    }

}
