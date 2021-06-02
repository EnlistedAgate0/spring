package laba2;


public class Main {
    public static void main(String[] args) {

        Thread DavidThread = new Thread(new UserThread("David"));
        DavidThread.start();

        Thread JonThread = new Thread(new UserThread("Jon"));
        JonThread.start();

        Thread JessiThread = new Thread(new UserThread("Jessi"));
        JessiThread.start();

    }
}
