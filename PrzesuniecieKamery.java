public class PrzesuniecieKamery {
    private int liczbaZdjec = 0; // Liczba zdjec wykonanych przez kamere

    public void przesun(Prostokat ekran, Prostokat kamera, int kierunek) {
        if(kamera.Centrum.Y < kamera.Wysokosc / 2) // jesli kamera dotknie dolnej czesci ekranu, zwrocic metode
            return;

        if (kierunek > 0) { // jesli dodatni kierunek ruchu (ruch w prawo)
            while (kamera.Centrum.X < ekran.Szerokosc - kamera.Szerokosc / 2) { // dziala, dopoki kamera nie dotknie ekranu po prawej stronie
                liczbaZdjec++; // dodac 1 do liczby zdjec wykonanych przez kamere
                kamera.Centrum.X += kamera.Szerokosc; // Przesun kamere o jeden krok w prawo, rowny jego szerokosci, aby zrobic nowe zdjecie
            }
        } else if (kierunek < 0) { // jesli ujemny kierunek ruchu (ruch w lewo)
            while (kamera.Centrum.X > kamera.Szerokosc / 2) { // dziala, dopoki kamera nie dotknie ekranu po lewej stronie
                liczbaZdjec++; // dodac 1 do liczby zdjec wykonanych przez kamere
                kamera.Centrum.X -= kamera.Szerokosc; // Przesun kamere o jeden krok w lewo, rowny jego szerokosci, aby zrobic nowe zdjecie
            }
        } else // jesli kierunek jest rowny 0, kamera sie nie porusza i po prostu zwraca metode
            return;

        kamera.Centrum.Y -= kamera.Wysokosc; // Po wykonaniu wszystkich ruchow liniowych przesun kamere o jeden krok w dol
        przesun(ekran, kamera, kierunek * -1); // Polaczenie rekurencyjne w celu zmiany kierunku
    }

    public void pokazLiczbeZdjec() {
        System.out.println("Liczba zdjec: " + liczbaZdjec);
    } // Wydrukowanie liczbe zdjec wykonanych przez kamere
}
