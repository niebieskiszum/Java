import java.util.Scanner;

public class Uczeń {
    public String Imię;
    public String Nazwisko;
    public long Pesel;

    protected Scanner scanner = new Scanner(System.in);

    public void Ustaw_Imię() {
        Imię = scanner.nextLine();
    }

    public void Ustaw_nazwisko() {
        Nazwisko = scanner.nextLine();
    }

    public void Ustaw_pesel() {
        Pesel = scanner.nextLong();
    }
}
