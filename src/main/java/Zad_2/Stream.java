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
        System.out.println("Lista - odwrotne sortowanie: " + sortedList(list));

    }

    private static List<String> sortedList(List<String> list) {
        return list
                .stream()
                .sorted(String.CASE_INSENSITIVE_ORDER.reversed())
                .collect(Collectors.toList());
    }
}

