package JavaMultithreading.lesson21;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Lesson21 { //Паттерн producer - consumer I часть
    private static BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);

    public void runL21() {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                produce();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                consumer();
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void produce() {
        Random random = new Random();

        while (true) {
            try {
                queue.put(random.nextInt(100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static void consumer() {
        Random random = new Random();

        while (true) {
            try {
                Thread.sleep(100);

                if (random.nextInt(10) == 5) {
                    System.out.println(queue.take());
                    System.out.println("Qoeue size is: " + queue.size());
                }
                } catch(InterruptedException e){
                    e.printStackTrace();
                }
        }
    }
}
