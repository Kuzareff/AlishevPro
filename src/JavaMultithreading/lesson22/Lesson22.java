package JavaMultithreading.lesson22;

import java.util.Scanner;

public class Lesson22 { //Методы wait и notify
    //Методы определены у объектов класса Object и отвечают за синхронизацию потоков.
    public void runL22() {
        WaitAndNotify wn = new WaitAndNotify();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    wn.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    wn.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
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
}
class WaitAndNotify {
    public void produce() throws InterruptedException {
        synchronized (this) {
            System.out.println("Producer thread started...");
            wait(); //Методы вызываются только в синхронизированных блоках и заставляет остановиься поток,
            // а также вызывается а все объекты через this или если необходимо вызвать на кокретном объекте,
            // необходимо указывать object*.wait()
            System.out.println("Producer thread resumed...");
        }
    }

    public void consume() throws InterruptedException {
        Thread.sleep(2000);
        Scanner scanner = new Scanner(System.in);

        synchronized (this) {
            System.out.println("Waiting for return key pressed");
            scanner.nextLine();
            notify(); //Метод позволяет пробудить остановленный поток, метод notifyAll пробуждает все остановленные потоки
        }
    }
}
