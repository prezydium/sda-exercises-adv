package sda.kristoff.adv.thirdexercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingExercises {

    public static void main(String[] args) {
        List<String> nicknames = Arrays.asList(
                "Jan", "Zbigniew", "Zahir", "Ann", "jo3", "pr0kox", "18hot_janice", "Kristoff"
        );
        reverseSortOne(nicknames);
        System.out.println(nicknames);

    }

    private static void reverseSortOne(List<String> stringsToBeSorted) {
        Collections.sort(stringsToBeSorted, Collections.reverseOrder());
    }

    private static void reverseSortTwo(List<String> stringsToBeSorted) {
        stringsToBeSorted.sort(Collections.reverseOrder());
    }
}
