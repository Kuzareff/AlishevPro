package JavaCollectionsFramework.lesson7;

import java.util.HashSet;
import java.util.Set;

public class Lesson7 { //Множества Set - хранит только уникальные элементы
    public void runL7 () {
//        Set<String> hashSet = new HashSet<>(); //Хранение одиночных объектов в произвольном порядке без сортировки
//        Set<String> linkedHashSet = new LinkedHashSet<>(); // Хранение и вывод в порядке записи
//        Set<String> treeSet = new TreeSet<>(); //Хранение и вывод в порядке возрастания
//
//        hashSet.add("Adam");
//        hashSet.add("Eva");
//        hashSet.add("Tom");
//        hashSet.add("Ron");
//        hashSet.add("Alan");
//
//        for (String name : hashSet) {
//            System.out.println(name);
//        }
//        System.out.println();
//        linkedHashSet.add("Adam");
//        linkedHashSet.add("Eva");
//        linkedHashSet.add("Tom");
//        linkedHashSet.add("Ron");
//        linkedHashSet.add("Alan");
//
//        for (String name2 : linkedHashSet) {
//            System.out.println(name2);
//        }
//        System.out.println();
//        treeSet.add("Adam");
//        treeSet.add("Eva");
//        treeSet.add("Tom");
//        treeSet.add("Ron");
//        treeSet.add("Alan");
//        //Проверка ваывода строкового значения по порядку.
//        treeSet.add("a");  //1
//        treeSet.add("ab"); //3
//        treeSet.add("aab");//2
//        treeSet.add("x");  //4
//        treeSet.add("xa"); //5
//
//        for (String name3 : treeSet) {
//            System.out.println(name3);
//        }
//
//        System.out.println();
//        hashSet.add("Tom");
//        hashSet.add("Adam");
//        hashSet.add("Ron");
//        hashSet.add("Eva");
//        hashSet.add("Tom");
//        hashSet.add("Tom");
//
//        System.out.println(hashSet);
//        System.out.println(hashSet.contains("Tom")); //Метод contains позволяет проверять наличие объектов в коллекции
//        System.out.println(hashSet.contains("Dom"));
//        System.out.println(hashSet.size());

        //Операции с множествами
        Set<Integer> set1 = new HashSet<>();

        set1.add(0);
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        Set<Integer> set2 = new HashSet<>();

        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);
        set2.add(8);

        //union - объединение множеств
        Set<Integer> union = new HashSet<>(set1); //Передаем значения set1
        union.addAll(set2); //методом addAll производим объединение
        System.out.println(union); //Выводим результат

        //intersection - пересечение множеств

        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2); //метод позволяет сравнить и выбрать одинаковые элементы
        System.out.println(intersection);

        // difference - разность множеств
        Set<Integer> difference = new HashSet<>(set1); //Выбираем в како объекте будем выбирать разность
        difference.removeAll(set2); //Методом removeAll производим разность
        System.out.println(difference); //Выводим результат и получаем, что в set1 остались только те чилса которых нет в set2
    }
}
