package JavaCollectionsFramework.lesson3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lesson3 { //LinkedList ч.1 - Связанный список
    public void runL3() {
        List<Integer> listlin = new LinkedList<>();
        List<Integer> listarr = new ArrayList<>();

        measureTime(listlin);
        measureTime(listarr);
    }

    private static void measureTime(List<Integer> list) {

        long start = System.currentTimeMillis();

        for(int i = 0; i < 100000; i++) { //При наполнении элементами, ArrayList делает операцию в два раза быстрее
            //list.add(i); //Метод записывает элемент в конец списка (Листа)
            list.add(0, i); //Мметод добавления новых элементов в начало списка (Листа)
            //В данном случае Array проиграл и сделал операцию медленнее в 50 раз. (7/385) мс.
        }

//        for(int i = 0; i < 100000; i++) { //При считывании элементов, ArrayList делает операцию в несколько тысяч раз быстрее!!! (Linked 100000 элементов) - 3544мс / (Array 100000 элементов) - 2мс
//            list.get(i);
//        }

        long end = System.currentTimeMillis();

        System.out.println(end - start + " - ms");
    }
}
