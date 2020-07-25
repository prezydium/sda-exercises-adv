package sda.kristoff.adv.fifthexercise;

public class StorageApp {

    public static void main(String[] args) {

        Storage storage = new Storage();

        storage.addToStorage("999", "OTH");
        storage.addToStorage("999", "ALL");
        storage.addToStorage("111", "USD");
        storage.addToStorage("A", "USD");

        storage.printValues("999");
        storage.printValues("A");
        storage.printValues("HELLO");

    }
}
