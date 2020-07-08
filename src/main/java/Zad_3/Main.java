package Zad_3;
//Stwórz metodę, która jako parametr przyjmuje mapę, 
// gdzie kluczem jest string, a wartością liczba, 
// a następnie wypisuje każdy element mapy do konsoli w formacie: Klucz: <k>, Wartość: <v> v>. 
// Na końcu każdego wiersza poza ostatnim, powinien być przecinek, a w ostatnim kropka.


import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //obiekt mapy
        Map<String, Number> firstMap = new HashMap<>();

        //dodawanie do mapy
        firstMap.put("Java", 18);
        firstMap.put("Python", 1);
        firstMap.put("PHP", 0);

        //wywolanie metody
        printMap(firstMap);

    }

    //metoda - zawsze nazywana czasownikami
    public static void printMap(Map<String, Number> map) {

        //iterowanie po mapie
        for (Map.Entry entry : map.entrySet()) {
            System.out.println("Klucz: " + entry.getKey() + " ||" + " Wartosc: " + entry.getValue());
        }
    }
}
