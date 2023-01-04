package Five;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(100000000);
        LinkedList<Integer> linkedList = new LinkedList<>();
        Time time = new Time();

        for (int i = 0; i < 100000000; i++) {
            int numberList = (int) (Math.random() * 1000);
            int numberLinkedList = (int) (Math.random() * 1000);
            list.add(numberList);
            linkedList.add(numberLinkedList);
        }

        int index = (int) (Math.random() * 499999);
        int number = (int) (Math.random() * 1000 + 1000);

        System.out.println("Add list number:");

        time.setTimeBefore(System.currentTimeMillis());
        list.add(number);
        time.setTimeAfter(System.currentTimeMillis());
        time.difference();

        time.setTimeBefore(System.currentTimeMillis());
        list.add(index, number);
        time.setTimeAfter(System.currentTimeMillis());
        time.difference();

        System.out.println("\nAdd linked list number:");

        time.setTimeBefore(System.currentTimeMillis());
        linkedList.add(number);
        time.setTimeAfter(System.currentTimeMillis());
        time.difference();

        time.setTimeBefore(System.currentTimeMillis());
        linkedList.add(index, number);
        time.setTimeAfter(System.currentTimeMillis());
        time.difference();

        System.out.println("\nGet list number:");

        time.setTimeBefore(System.currentTimeMillis());
        System.out.println("Number: " + list.get(list.size() - 1));
        time.setTimeAfter(System.currentTimeMillis());
        time.difference();

        time.setTimeBefore(System.currentTimeMillis());
        System.out.println("Number: " + list.get(index));
        time.setTimeAfter(System.currentTimeMillis());
        time.difference();

        System.out.println("\nGet linked list number:");

        time.setTimeBefore(System.currentTimeMillis());
        System.out.println("Number: " + linkedList.get(linkedList.size() - 1));
        time.setTimeAfter(System.currentTimeMillis());
        time.difference();

        time.setTimeBefore(System.currentTimeMillis());
        System.out.println("Number: " + linkedList.get(index));
        time.setTimeAfter(System.currentTimeMillis());
        time.difference();

        System.out.println("\nRemove list number:");

        time.setTimeBefore(System.currentTimeMillis());
        System.out.println("Number: " + list.remove(list.size() - 1));
        time.setTimeAfter(System.currentTimeMillis());
        time.difference();

        time.setTimeBefore(System.currentTimeMillis());
        System.out.println("Number: " + list.remove(index));
        time.setTimeAfter(System.currentTimeMillis());
        time.difference();

        System.out.println("\nRemove linked list number:");

        time.setTimeBefore(System.currentTimeMillis());
        System.out.println("Number: " + linkedList.remove(linkedList.size() - 1));
        time.setTimeAfter(System.currentTimeMillis());
        time.difference();

        time.setTimeBefore(System.currentTimeMillis());
        System.out.println("Number: " + linkedList.remove(index));
        time.setTimeAfter(System.currentTimeMillis());
        time.difference();
    }
}
