package lesson5;

import java.util.HashMap;
import java.util.Map;

public class Lesson5 { //Map-HashMap ч.1
    public void runL5(){
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Один");
        map.put(2, "Два");
        map.put(3, "Три");

        for(Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
//        System.out.println(map);
//
//        map.put(3, "Другое значение для 3");
//        System.out.println(map);
//        System.out.println(map.get(1));
//        System.out.println(map.get(10));

        //Класс HashMap интерфейса Map выводит пару ключ-значение в произвольном виде.
    }
}
