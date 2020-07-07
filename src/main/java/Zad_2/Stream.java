package Zad_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Bocian");
        list.add("ala");
        list.add("Kapcie");
        list.add("zyrafa");
        list.add("cel");

        System.out.println("Lista - wersja oryginalna: " + list);

//        Collections.sort(sortedList(list), String.CASE_INSENSITIVE_ORDER); //noc nie daje wielka litera leci na koniec
        System.out.println("Lista - odwrotne sortowanie: " + sortedList(list));

    }
    private static List<String> sortedList (List<String>list){
        return list
                .stream()
                .map(s -> s.toLowerCase())  //nic nie daje, wielka litera leci na koniec
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
}
