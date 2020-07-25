package sda.kristoff.adv.fifthexercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Storage {

    private Map<String, List<String>> storageMap = new HashMap<>();

    public void addToStorage(String key, String value) {
        storageMap.putIfAbsent(key, new ArrayList<>());
        storageMap.get(key).add(value);
    }

    public void printValues(String key) {
        System.out.println(storageMap.get(key));
    }
}
/*
* addToStorage(String key, String value) - dodawanie elementów do przechowywalni
printValues(String key) - wyświetlanie wszystkich elementów pod danym kluczem
Klasa Storage powinna pozwalać na przechowywanie wielu wartości pod jednym kluczem.

* */