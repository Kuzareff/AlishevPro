package JavaMultithreading.lesson16;

public class Lesson16 { //Введение в многопоточность в Java
    public void runL16() {
//        MyThread myThread = new MyThread();
//        myThread.start();
//
//        MyThread myThread2 = new MyThread();
//        myThread2.start();

//        System.out.println("Im sleep");
//        try {
//            Thread.sleep(3000); //Метод sleep позволяет останавливать поток на необходимое время.
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("Im awake!");

        Thread thread = new Thread(new Runner());
        thread.start();
    }
}

class Runner implements Runnable{ //Еще один способ создания потока через имплиментация интерефейса и единственного метода run

    @Override
    public void run() {
        for(int i = 0; i < 1000; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hello from MyThread" + i);
        }
    }
}

class MyThread extends Thread { // создаем класс для нового потока и наследуем класс Thread
    public void run() { //Переопределение метода run класса Thread
        for(int i = 0; i < 1000; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hello from MyThread" + i);
        }
    }
}
