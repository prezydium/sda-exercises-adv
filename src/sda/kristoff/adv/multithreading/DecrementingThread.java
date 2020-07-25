package sda.kristoff.adv.multithreading;

public class DecrementingThread extends Thread {

    private final Counter counter;

    public DecrementingThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public synchronized void start() {
        System.out.println("Starting " + getName());
        super.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            counter.decrement();
        }
    }
}
