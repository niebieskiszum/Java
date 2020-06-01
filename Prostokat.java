public class Prostokat {
    public Punkt Centrum; // Centrum wspolrzedne
    public float Szerokosc; // Szerokosc prostokata
    public float Wysokosc; // Wysokosc prostokata

    public Prostokat(float Szerokosc, float Wysokosc) { // Konstruktor, ktory inicjuje szerokosc i wysokosc i pobiera wspolrzedne od poczatku
        this.Centrum = new Punkt(Szerokosc / 2, Wysokosc / 2);
        this.Szerokosc = Szerokosc;
        this.Wysokosc = Wysokosc;
    }

    public Prostokat(Punkt Centrum, float Szerokosc, float Wysokosc) { // Konstruktor inicjujacy srodkowe wspolrzedne, szerokosc i wysokosc
        this.Centrum = Centrum;
        this.Szerokosc = Szerokosc;
        this.Wysokosc = Wysokosc;
    }
}
