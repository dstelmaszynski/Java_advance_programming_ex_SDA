package Zad_3;

import java.util.*;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {

        Collection<Integer> list = Arrays.asList(18, 1, 0);

        Map map = list
                .stream()
                .collect(Collectors.toMap(integer -> integer, String -> String));

        System.out.println(map);
    }
}
