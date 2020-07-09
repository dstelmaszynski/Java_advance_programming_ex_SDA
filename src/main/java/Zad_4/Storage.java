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

import org.w3c.dom.ls.LSOutput;

import java.util.Map;
import java.util.stream.Collectors;

public class Storage {

    private Map<String, String> map;

    //konstruktor
    public Storage(Map<String, String> map) {

        this.map = map;
    }

    //metody
    public void addToStorage(String key, String value) {
        map.put(key, value);
    }

    public void printValues(String key) {
        if (!map.containsKey(key)) { //negacja dla kluczy, ktorych nie ma w mapie
            System.out.println("This key doesn't exist: " + key);
        } else { //zeby nie wyswielac nulla
            String value = map.get(key);
            System.out.println(value);
        }
    }
    public void findValues(String value) {
        if (!map.containsValue(value)) { //negacja dla kluczy, ktorych nie ma w mapie
            System.out.println("This value doesn't exist: " + value);
            return;  //zeby nie wyswielac nulla (2 opcja - bez else)
        }
        map.entrySet()
                .stream()
                .filter(entry -> value.equals(entry.getValue()))
                .forEach(entry -> System.out.println(entry));
    }
}
