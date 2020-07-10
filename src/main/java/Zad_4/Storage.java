package Zad_4;
//Stwórz klasę Storage , która będzie miała prywatne pole typu Map ,
// publiczny konstruktor oraz metody:
//        addToStorage(String key, String value)
//        → dodawanie elementów do przechowywalni
//        printValues(String key)
//        → wyświetlanie wszystkich elementów pod danym kluczem
//        findValues(String value)
//        → wyświetlanie wszystkich kluczy, które mają podaną wartość
//        Klasa Storage powinna pozwalać na przechowywanie wielu wartości pod jednym kluczem.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Storage {

    private Map<String, List<String>> map = new HashMap<>();

    public Storage(){

    }

    //konstruktor
    public Storage(Map<String, List<String>> map) { //lista jako parametr, zeby klasa Storage mogla
                                                    //przechowywac wiele wartosci pod jednym kluczem
        this.map = map;
    }

    //metody
    public void addToStorage(String key, String value) {
        if (!map.containsKey(key)){
            List<String> values = new ArrayList<>();
            values.add(value);
            map.put(key, values);
        } else {
            map.get(key).add(value);
        }
    }

    //ponizej pierwsza implementacja

//    public void printValues(String key) {
//        if (!map.containsKey(key)) { //negacja dla kluczy, ktorych nie ma w mapie
//            System.out.println("This key doesn't exist: ");
//        } else { //zeby nie wyswielac nulla
//            List<String> value = map.get(key);
//            System.out.println(value);
//        }
//    }

        public void printValues(String key) {
        if (!map.containsKey(key)) { //negacja dla kluczy, ktorych nie ma w mapie
            System.out.println("This key doesn't exist: " + key);
            return;
        } List <String> value = map.get(key);
            System.out.println(value);
    }
    public void findValues(String value) {
        if (!isValuePresentInMap(value)) { //negacja dla kluczy, ktorych nie ma w mapie
            System.out.println("This value doesn't exist: " + value);
            return;  //zeby nie wyswielac nulla (2 opcja - bez else)
        }
        map.entrySet()
                .stream()
//                .filter(entry -> entry.getValue().contains(value))
                .forEach(entry -> System.out.println(entry));
    }

    private boolean isValuePresentInMap (String value){
        return map.entrySet()
                .stream()
                .anyMatch(entry -> entry.getValue().contains(value));

    }
}
