package JavaCollectionsFramework.lesson1;

import java.util.ArrayList;
import java.util.List;

public class Lesson1 { //ArrayList ч.1
    public void runL1 () {
//        int[] x = new int[3];
//        for(int i = 0; i < 4; i++) { //При данных условиях будет ошибка ArrayIndexOutOfBoundsException - выход за пределы массива
//            x[i] = 1;
//        }

        List<Integer> arr = new ArrayList<>(); //При декларации переменной указывается тип данных. После Java 7 указывать во второй части не нужно
        for(int i = 0; i < 10; i++) { //Цикл задает размер
            arr.add(i); //Метод .add добовляет числа в массив пока работает цикл
        }
        System.out.println(arr); //Получаем результат и выводим в консоль от 0 до 99

        System.out.println(arr.get(0)); //Метод .get позволяет выбрать элемент по индексу
        System.out.println(arr.get(9));

        System.out.println(arr.size()); //Метод .size показывает размер массива

        for(int i = 0; i < arr.size(); i++){ //Создаем цикл перебора массива
            System.out.println(arr.get(i));; //Выводим каждый элемент массива в отдельную строчку
        }

        for(Integer x : arr) //Также проход по массиву с помощью метода for each
            System.out.println(x);

        arr.remove(5); //Метод удаления элемента по индексу! Метод не очень действенный.
        System.out.println(arr);
    }
}
