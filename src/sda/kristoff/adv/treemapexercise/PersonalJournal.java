package sda.kristoff.adv.treemapexercise;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Optional;
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
        Optional<LocalDate> possibleCeilingKey = Optional.ofNullable(entries.ceilingKey(searchedDate));
        LocalDate ceilingKey = possibleCeilingKey.orElse(LocalDate.MAX);
        long ceilingDifference = ChronoUnit.DAYS.between(searchedDate, ceilingKey);

        Optional<LocalDate> possibleFloorKey = Optional.ofNullable(entries.floorKey(searchedDate));
        LocalDate floorKey = possibleFloorKey.orElse(LocalDate.MIN);
        long floorDifference = Math.abs(ChronoUnit.DAYS.between(searchedDate, floorKey));

        if (ceilingDifference > floorDifference) {
            System.out.println(entries.get(floorKey));
        } else {
            System.out.println(entries.get(ceilingKey));
        }

    }


}
