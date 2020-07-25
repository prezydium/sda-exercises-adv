package sda.kristoff.adv.firstexercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class OptionalExercise {

    public static void main(String[] args) {
        List<Integer> randomNumbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 1_000_000; i++) {
            randomNumbers.add(random.nextInt(1_000_001));
        }
        randomNumbers.stream()
                .filter(x -> x > 999_995)
                .findFirst()
                .ifPresent(integer -> {
                    System.out.println("There is some number matching criteria. It is: " + integer);
                });

    }
}
