package JavaCollectionsFramework.lesson11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lesson11 { //Интерфейс Comparator
    public void runL11() {
        List<String> animals = new ArrayList<>();

        animals.add("cat");
        animals.add("dog");
        animals.add("frog");
        animals.add("bird");

        Collections.sort(animals, new StringLengthComparator()); //Метод .sort класса Collections сортирует по алфавиту
        System.out.println(animals);

        List<Integer> numbers = new ArrayList<>();

        numbers.add(5);
        numbers.add(0);
        numbers.add(500);
        numbers.add(200);

        //Для нечастного использования метода Comparator,
// можно реализовывать ананимный класс (Comparator) в теле метода .sort и указывать условия сортировки в самом методе.
        Collections.sort(numbers, (o1, o2) -> { //Или совсем проще использовать лямбда!
            if (o1 > o2) {
                return -1;
            } else if (o1 < o2) {
                return 1;
            } else {
                return 0;
            }
        });
        System.out.println(numbers);

        List<Person> people = new ArrayList<>();
        people.add(new Person(3, "Adam"));
        people.add(new Person(1, "Eva"));
        people.add(new Person(2, "Zmei"));

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.getId() > o2.getId()) {
                    return 1;
                } else if (o1.getId() < o2.getId()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });

        System.out.println(people);
    }
}

class StringLengthComparator implements Comparator<String> { // В данном случае мы
    @Override
    public int compare(String o1, String o2) {
        /*
        * o1 > o2 => 1;
        * o1 < o2 => -1;
        * o1 == o2 => 0;
        *
        * compare(2, 1) => 1;
        * compare(1, 2) => -1;
        * compare(1, 1) => 0;
        * */
        if(o1.length() > o2.length()) {
            return 1;
        } else if (o1.length() < o2.length()) {
            return -1;
        } else {
            return 0;
        }
    }
}

class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

