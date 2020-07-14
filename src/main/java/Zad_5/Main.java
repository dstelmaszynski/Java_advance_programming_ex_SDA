package Zad_5;

//Zaimplementuj klasę SDAHashSet<E>, która będzie implementować logikę HashSet<E>.
// W tym celu zaimplementuj obsługę metod:
//•add
//•remove
//•size
//•contains
//•clear

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        HashSet<String> set1 = new HashSet<>();

        //dodawanie do HashSetu
        set1.add("Java");
        set1.add("Ruby");
        set1.add("Python");
        set1.add("C++");

        System.out.println(set1);

        //metoda remove
        set1.remove("Java");
        System.out.println(set1);

        //metoda size
        System.out.println(set1.size());

        //metoda contains
        boolean isAvailible = set1.contains("C++");
        System.out.println(isAvailible);

        //metoda clear --> usuwa wszystkie elementy z setu
        set1.clear();
        System.out.println(set1);

    }
}
