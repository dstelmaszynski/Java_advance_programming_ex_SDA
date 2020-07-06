package Zad_2;

//Stwórz metodę, która jako parametr przyjmuje listę stringów,
// następnie zwraca tą listę posortowaną
//alfabetycznie od Z do A nie biorąc pod uwagę wielkości liter.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Bocian");
        list.add("ala");
        list.add("Kapcie");
        list.add("zyrafa");
        list.add("cel");

        System.out.println("Lista - wersja oryginalna: " + list);
        list.sort(Comparator.reverseOrder());

        System.out.println("Lista - sortowanie odwrotna: " + list);
    }
}
