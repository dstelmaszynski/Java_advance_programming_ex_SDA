package Zad_6;
//Stwórz metodę, która przyjmuje
//TreeMap i wypisuje w konsoli pierwszy i ostatni EntrySet

import java.util.TreeMap;

public class TreeMap_example {
    public static void main(String[] args) {
        //TreeMap
        TreeMap<String, Integer> mapOfValues = new TreeMap<>();

        mapOfValues.put("aaJava", 1);
        mapOfValues.put("bbRuby", 2);
        mapOfValues.put("ccC++", 3);
        mapOfValues.put("ddJavaScript", 4);
        mapOfValues.put("eePython", 5);


        //metoda EntrySet --> bezparametrowo zwraca elementy TreeMap, wg sortowania
        //firstEntry()
        //lastEntry()
        System.out.println(mapOfValues.firstEntry());
        System.out.println(mapOfValues.lastEntry());
    }
}
