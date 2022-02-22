package ExerciseOOP;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {

        //Human human2 = new Human("Orxan", "Tahirzade", 30);
        Person person2 = new Person("Orkhan", "Tahirzada", 30);

        List<Human> humanList = new ArrayList<Human>(15);

        Human human1 = new Human("A", "B", 1);
        Human human2 = new Human("C", "D", 2);
        Human human3 = new Human("E", "F", 3);
        Human human4 = new Human("E", "F", 4);

        humanList.add(human1);
        humanList.add(human2);
        humanList.add(human3);
        humanList.add(human4);

        System.out.println(human3.toString());



    }

}
