package JavaCollectionsFramework.lesson6;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Lesson6 { //LinkedHashMap & TreeMap
    public void runL6() {
        Map<Integer, String> hashMap = new HashMap<>(); //Внутри не гарантируется никакого порядка
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>(); //в каком порядке были добавлены значения, в том и вернутся
        Map<Integer, String> treeMap = new TreeMap<>(); // сортировка по ключу (естественный порядок)

        testMap(hashMap);
        System.out.println();
        testMap(linkedHashMap);
        System.out.println();
        testMap(treeMap);

    }

    public static void testMap (Map<Integer, String> map) {
        map.put(39, "Adam");
        map.put(12, "Eva");
        map.put(77, "Tom");
        map.put(1500, "Tim");
        map.put(0, "Ron");
        map.put(7, "Adam");

        for(Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
