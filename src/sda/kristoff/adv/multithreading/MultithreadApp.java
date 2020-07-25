package sda.kristoff.adv.multithreading;

import java.math.BigDecimal;

public class MultithreadApp {

    public static void main(String[] args) {
/*        Thread threadOne = new Thread();
        threadOne.start();
        */
        long start = System.currentTimeMillis();
        factorialWorker();
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
