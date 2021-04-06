package JavaCollectionsFramework.lesson15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lesson15 { //Интерфейс Iterable
    public void runL15() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        //Логика итераций
        // До Java 5
        Iterator<Integer> iterator = list.iterator();
        int ind = 0;
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            if (ind == 1)
                iterator.remove();
            ind++;
        }
        System.out.println(list);


        //Java 5 и более поздние версии используют foreach
        //Удаление элементов в методе foreach невозможен, так как в методе Iteratir это возможно
        for(int x : list) {
            System.out.println(x);
        }
    }
}
