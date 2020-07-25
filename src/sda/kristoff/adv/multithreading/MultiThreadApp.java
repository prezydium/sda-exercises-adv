package sda.kristoff.adv.multithreading;

import java.math.BigDecimal;

public class MultiThreadApp {

    public static void main(String[] args) throws InterruptedException {

        Thread threadOne = new Thread(() -> factorialWorker());
        Thread threadTwo = new Thread(() -> factorialWorker());
        Thread threadThree = new Thread(() -> factorialWorker());
        Thread threadFour = new Thread(() -> factorialWorker());

        long start = System.currentTimeMillis();
        threadOne.start();
        threadTwo.start();
        threadThree.start();
        threadFour.start();

        threadOne.join();
        threadTwo.join();
        threadThree.join();
        threadFour.join();

        System.out.println("Finished in: " + (System.currentTimeMillis() - start) + " ms");
    }


    private static void factorialWorker() {
        BigDecimal result = new BigDecimal(1);
        for (int i = 1; i < 5000; i++) {
            result = result.multiply(new BigDecimal(i));
            System.out.println(result);
        }
    }
}
