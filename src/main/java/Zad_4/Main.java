package Zad_4;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {


        Storage storage = new Storage();
        storage.addToStorage("Java", "one");
        storage.addToStorage("Java", "two");
        storage.addToStorage("Python", "two");

        storage.printValues("two");
        System.out.println("_______________________");
        storage.findValues("Java");

        //pierwsza implementacja poniżej. wyzej zmiana dot.
        // przechowywania wielu wartosci pod jednym kluczem

//        Map<String, String> someMap = new HashMap<>();
//        someMap.put("Java", "one");
//        someMap.put("C++", "two");
//        someMap.put("Python", "three");
//
//        Storage storage = new Storage(someMap);
//        storage.printValues("Javak");
//
//        storage.addToStorage("HTML", "four");
//        storage.printValues("HTML");
//        storage.addToStorage("Java", "three");
//
//        storage.findValues("three");

    }
}
