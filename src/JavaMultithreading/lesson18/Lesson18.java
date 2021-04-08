package JavaMultithreading.lesson18;


import java.util.Scanner;

public class Lesson18 { //Ключевое слово synchronized I часть
    private int counter;

    public void runL18() {
        Lesson18 lesson18 = new Lesson18();
        try {
            lesson18.doWork();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void increment() { //Ключевое слово synchronized используется в методе и позволяет синхронезировать потоки
        counter++;
    }

    public void doWork () throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 10000; i++) {
                    increment();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 10000; i++) {
                    increment();
//                    counter = counter + 1; // counter++ == counter += 1
                }
            }
        });

        thread1.start();
        thread2.start();

        thread1.join(); //Метод join выбрасывает исключение InterruptedException которе необходимо обрабоать
        //Причем join первого потока будет останавливать все потоки и ждать выполенения первого
        thread2.join(); //Метод join позволяет завершить работу потоков

        System.out.println(counter);
    }
}

