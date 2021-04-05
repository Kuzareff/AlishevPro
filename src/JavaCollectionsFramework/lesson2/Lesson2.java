package JavaCollectionsFramework.lesson2;

import java.util.ArrayList;
import java.util.List;

public class Lesson2 { //ArrayList ч.2
    public void runL2() {
        List<Integer> list = new ArrayList<>();
        //Вопрос: Как устроен ArrayList?
        //Ответ: В ArrayList создается массив по умолчанию на 10 элементов, после чего при методе .add создается
        //новый массив и из старого происходит копирование в новый!
    }
}
