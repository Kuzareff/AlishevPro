package JavaMultithreading.lesson19;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lesson19 { //Ключевое слово synchronized 2 часть
    public void runL19() {
        new Worker().main();
    }
}

class Worker {
    Random random = new Random();

    Object lock1 = new Object(); //Для синхронизации и паралелльной работы потоков, н6еобходимо создать объекты.
    Object lock2 = new Object();

    private List<Integer> list1 = new ArrayList<>();
    private List<Integer> list2 = new ArrayList<>();

    public void addToList1() {
        synchronized (lock1) { //Далее с каждым объектом создаем блок синхронайз, который позволяет запускать паралелльно потоки
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list1.add(random.nextInt(100)); //Метод random.nextInt будет возвращать случайное число в рамках от 0 до 99, или тор, что мы укажем
        }
    }

    public void addToList2() {
        synchronized (lock2) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list2.add(random.nextInt(100)); //Метод random.nextInt будет возвращать случайное число в рамках от 0 до 99, или тор, что мы укажем
        }
    }

    public void work() {
        for(int i = 0; i < 1000; i++) {
            addToList1();
            addToList2();
        }
    }

    public void main(){
        long before = System.currentTimeMillis();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                work();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                work();
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

        long after = System.currentTimeMillis();
        System.out.println("Program took " + (after - before) + " ms to run");

        System.out.println("List1: " + list1.size());
        System.out.println("List2: " + list2.size());
    }
}