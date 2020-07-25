package sda.kristoff.adv.secondexercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class GroupingExercise {

    public static void main(String[] args) {
        List<Integer> randomNumbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 100_000; i++) {
            randomNumbers.add(random.nextInt(100_001));
        }
        long distinctNumbers = randomNumbers.stream().distinct().count();
        List<Integer> uniqueNumbers = getUnique(randomNumbers);
        List<Integer> nonUnique = getNonUnique(randomNumbers);
        System.out.println(uniqueNumbers);
        System.out.println(nonUnique);
    }

    public static List<Integer> getUnique(List<Integer> numbers) {
        return groupByOccurrence(numbers).entrySet().stream()
                .filter(element -> element.getValue() == 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    public static List<Integer> getNonUnique(List<Integer> numbers) {
        return groupByOccurrence(numbers).entrySet().stream()
                .filter(element -> element.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    private static Map<Integer, Long> groupByOccurrence(List<Integer> numbers) {
        return numbers.stream()
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()));
    }
}
