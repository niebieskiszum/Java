public class Main {

    public static void main(String[] args) {
        var ekran = new Prostokat(600f, 500f); // Obiekt ekrana
        var kamera = new Prostokat(new Punkt(20f, 580f),40f, 40f); // Obiekt kamery
        var przesuniecieKamery = new PrzesuniecieKamery(); // Objekt PrzesuniecieKamery
        przesuniecieKamery.przesun(ekran, kamera, 1); // Wywołanie metody przesun klasy PrzesuniecieKamery
        przesuniecieKamery.pokazLiczbeZdjec(); // Wydrukowanie liczbe zdjec wykonanych przez kamera
    }
}
