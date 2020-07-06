package Zad_1;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Dominik");
        list.add("Beata");
        list.add("Antosia");
        list.add("Michał");
        list.add("Paweł");

        System.out.println("List not sorted: " + list);
        System.out.println("List sorted: " + sortedList(list));

    }
    private static List<String> sortedList (List<String> list){

        return list
                .stream()
                .sorted()
                .collect(Collectors.toList());
    }
}
