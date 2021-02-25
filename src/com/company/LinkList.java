package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkList {

    public static void humanList() {
        ArrayList<Human> humans = new ArrayList<>();
        Human human = new Human("Иван");
        Human human1 = new Human("Влад");
        Human human2 = new Human("Стас");
        Human human3 = new Human("Аня");
        Human human4 = new Human("Кирилл");

        humans.add(human);
        humans.add(human1);
        humans.add(human2);
        humans.add(human3);
        humans.add(human4);
        humans.set(2, human4);
        humans.add(3,human);
        System.out.println(humans);
        System.out.println(humans.size());

    }

}
