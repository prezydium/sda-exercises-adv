package sda.kristoff.adv.treemapexercise;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.TreeMap;

public class PersonalJournal {

    private TreeMap<LocalDate, String> entries = new TreeMap<>();

    public void addRecord(LocalDate recordDate, String message) {
        String existingMessage = entries.getOrDefault(recordDate, "");
        entries.put(recordDate, existingMessage + " " + message);
    }

    public void printFromNewestRecord() {
        System.out.println(entries.descendingMap());
    }

    public void printClosestRecord(LocalDate searchedDate) {
        LocalDate ceilingKey = entries.ceilingKey(searchedDate);
        long ceilingDifference = ChronoUnit.DAYS.between(searchedDate, ceilingKey);

        LocalDate floorKey = entries.floorKey(searchedDate);
        long floorDifference = ChronoUnit.DAYS.between(floorKey, searchedDate);

        if (ceilingDifference > floorDifference) {
            System.out.println(floorKey + " " + entries.get(floorKey));
        } else {
            System.out.println(ceilingKey + " " + entries.get(ceilingKey));
        }

    }


}
