package JavaCollectionsFramework.lesson13;

import org.w3c.dom.ls.LSOutput;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Lesson13 { //Очередь Queue
    public void runL13() {
        Person person1 = new Person(1);
        Person person2 = new Person(2);
        Person person3 = new Person(3);
        Person person4 = new Person(4);

        Queue<Person> people = new ArrayBlockingQueue<Person>(3); //Огрнаичение в колличетсве потоков в очереди
//        people.add(person3); //Выбрасывает исключение
//        people.add(person2);
//        people.add(person4);
//        people.add(person1);

        System.out.println(people.offer(person3)); // Сообщает об ошибке методом вывода информации
        System.out.println(people.offer(person2));
        System.out.println(people.offer(person4));
        System.out.println(people.offer(person1));


//        System.out.println(people.remove()); //Достает и удаляет первый элемент из очереди
//        System.out.println(people.peek()); //Показывает, но не удаляет первый элемент в очереди

    }
}

class Person {
    private int id;

    public Person(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                '}';
    }
}
