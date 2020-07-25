package sda.kristoff.adv.fourthexercise;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapPrinterExercise {
    public static void main(String[] args) {
        Map<String, Integer> items = new HashMap<>();
        items.put("PEN", 10);
        items.put("PENCIL", 20);
        items.put("PRINTER", 3);
        items.put("PAPER", 2000);
        items.put("PIANO", 0);

        mapPrinter(items);
        printMapByDamian(items);
    }

    private static void mapPrinter(Map<String, Integer> items) {
        Set<Map.Entry<String, Integer>> entries = items.entrySet();
        StringBuilder sb = new StringBuilder();

        entries.forEach(entry -> sb.append("Klucz: ")
                .append(entry.getKey())
                .append(" Wartość: ")
                .append(entry.getValue())
                .append(",\n"));

        int lastIndexOfComma = sb.lastIndexOf(",");
        sb.replace(lastIndexOfComma, lastIndexOfComma + 1, ".");
        System.out.println(sb.toString().stripTrailing());
    }

    //created by Damian
    private static void printMapByDamian(Map<String, Integer> map) {
        StringBuilder stringBuilder = new StringBuilder();
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> item = iterator.next();
            stringBuilder.append("Klucz: ")
                    .append(item.getKey())
                    .append(", Wartość: ")
                    .append(item.getValue());
            if (iterator.hasNext()) {
                stringBuilder.append(",")
                        .append(System.lineSeparator());
            } else {
                stringBuilder.append(".");
            }
        }
        System.out.println(stringBuilder);
    }
}
