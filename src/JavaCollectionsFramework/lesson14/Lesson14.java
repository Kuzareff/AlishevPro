package JavaCollectionsFramework.lesson14;

import org.w3c.dom.ls.LSOutput;

import java.util.Stack;

public class Lesson14 { //Стэк - Stack
    public void runL14() {
        Stack<Integer> stack = new Stack<>();

        stack.push(5); //Метод добавления
        stack.push(3); //Метод добавления
        stack.push(1); //Метод добавления

//        System.out.println(stack.peek()); //Метод просмотра элемента, но не извлечение (удаление)
//        System.out.println(stack.pop()); //Метод который достает(и удаляет) последний добавленный элемент
//        System.out.println(stack.peek());
        while ((!stack.empty())) {
            System.out.println(stack.pop());
        }
    }
}
