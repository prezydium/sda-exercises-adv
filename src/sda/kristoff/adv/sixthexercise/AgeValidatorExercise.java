package sda.kristoff.adv.sixthexercise;

import java.time.LocalDate;

public class AgeValidatorExercise {

    public static void main(String[] args) throws UnderageException {

        LocalDate personOne = LocalDate.of(1987, 7, 24);
        LocalDate personTwo = LocalDate.of(2002, 7, 24);
        LocalDate personThree = LocalDate.of(2010, 5, 11);

        AgeValidator.checkAge(personOne);
        AgeValidator.checkAge(personTwo);
        AgeValidator.checkAge(personThree);
    }


}