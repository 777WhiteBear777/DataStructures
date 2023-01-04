package Six;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<Human> humanList = new ArrayList<>();
        humanList.add(new Human(10,"Jon","Potter", 22));
        humanList.add(new Human(3,"Tom","Jikda", 33));
        humanList.add(new Human(2,"Sin","Java", 24));
        humanList.add(new Human(5,"Lilia","Loka", 18));
        humanList.add(new Human(8,"Piter","Parker", 15));
        humanList.add(new Human(6,"Julia","Roberts", 40));
        humanList.add(new Human(1,"Kilya","Tyrok", 55));
        humanList.add(new Human(4,"Nikola","Tesla", 43));
        humanList.add(new Human(9,"Sakura","Haruna", 37));
        humanList.add(new Human(7,"Ten-Ten","Kilada", 36));

        for (Human humans : humanList) {
            System.out.println(humans.toString());
        }

        Collections.sort(humanList);
        System.out.println("\n------------------------------------------\n");

        for (Human humans : humanList) {
            System.out.println(humans.toString());
        }

    }
}
