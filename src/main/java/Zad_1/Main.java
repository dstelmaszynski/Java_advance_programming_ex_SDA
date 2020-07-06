package Zad_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.*;


//Stwórz metodę, która jako parametr przyjmuje listę stringów,
// następnie zwraca tą listę posortowaną alfabetycznie od Z do A.


public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Dominik");
        list.add("Beata");
        list.add("Antosia");
        list.add("Michał");
        list.add("Paweł");

        System.out.println("Lista - wersja oryginalna: " + list);

        //do sortowania elementow
        Collections.sort(list);
        System.out.println("Lista posortowana: " + list);
    }
}

