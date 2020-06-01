import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Pliki {
    private File plik;

    public Pliki(String path) {
        this.plik = new File(path);
    }

    public Pliki(File plik) {
        this.plik = plik;
    }

    public void liczZnakiSlowa() {
        System.out.println("Ilosc znakow: " + plik.getName().length());

        int ilosc = 0;
        boolean spacje;
        boolean tab;
        boolean koniec;

        for(int i = 0; i < plik.getName().length(); i++) {
            spacje = plik.getName().substring(i, i+1).compareTo(" ") == 0;
            tab = plik.getName().substring(i, i+1).compareTo("\t") == 0;
            koniec = plik.getName().substring(i, i+1).compareTo("\n") == 0;
            if(spacje || tab || koniec)
                ilosc++;
        }

        System.out.println("Ilosc bialych znalow: " + ilosc);

        if (plik.getName().split(" ").length > 0)
            ilosc =  plik.getName().split(" ").length;
        else
            ilosc = 1;

        System.out.println("Ilosc slow: " + ilosc);
    }

    public static void szukaj(String nazwaPlikWe, String nazwaPlikWy, String slowo) throws Exception {
        var fileReader = new FileReader(nazwaPlikWe);
        var scanner = new Scanner(fileReader);
        var fileWriter = new FileWriter(nazwaPlikWy, false);
        var list = new ArrayList<String>();

        while(scanner.hasNextLine())
            list.add(scanner.nextLine());
        fileReader.close();

        int minIndex = 0;
        int maxIndex = 0;
        int iloscKropek = 0;
        int[] indexKropki;
        int n;
        int index = 0;
        for(int i = 0; i < list.toArray().length; i++) {
            if(list.get(i).toLowerCase().indexOf(slowo.toLowerCase()) >= 0) {
                for(int j = list.get(i).toLowerCase().indexOf(slowo.toLowerCase()) - 1; j >= 0; j--) {
                    if(list.get(i).substring(j, j+1).compareTo(".") == 0) {
                        if(list.get(i).substring(j+1, j+2).compareTo(" ") == 0)
                            minIndex = j + 2;
                        else
                            minIndex = j + 1;
                        break;
                    } else
                        minIndex = 0;
                }
                for(int j = list.get(i).toLowerCase().indexOf(slowo.toLowerCase()) + slowo.length(); j < list.get(i).length(); j++) {
                    if(list.get(i).substring(j, j+1).compareTo(".") == 0) {
                        maxIndex = j;
                        break;
                    } else
                        maxIndex = list.get(i).length() - 1;
                }

                for(int j = 0; j < list.get(i).length(); j++) {
                    if(list.get(i).substring(j, j+1).compareTo(".") == 0) {
                        iloscKropek++;
                    }
                }
                indexKropki = new int[iloscKropek];
                n = 0;
                for(int j = 0; j < list.get(i).length(); j++) {
                    if(list.get(i).substring(j, j+1).compareTo(".") == 0) {
                        indexKropki[n] = j;
                        n++;
                    }
                }
                for(int j = 0; j < indexKropki.length; j++) {
                    if(minIndex < indexKropki[j]) {
                        n = j + 1;
                        break;
                    } else
                        n = 1;
                }
                index += n;

                fileWriter.write((index) + ": " + list.get(i).substring(minIndex, maxIndex + 1));
                fileWriter.write(System.lineSeparator());

                iloscKropek = 0;
            }
        }

        fileWriter.close();
    }
}
