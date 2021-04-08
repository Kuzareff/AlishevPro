package JavaMultithreading.lesson17;

import java.util.Scanner;

public class Lesson17 { // Ключевое слово volatile
    public void runL17() {
        MyThread myThread = new MyThread();
        myThread.start();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        myThread.shutdown();
    }
}

class MyThread extends Thread {

    private volatile boolean running = true; // volatile позволяет отменять кеширование памяти ядра и избавляет от проблем Когерентности кеша

    public void run() {
        while (running) {
            System.out.println("Hello");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void shutdown() {
        this.running = false;
    }
}
