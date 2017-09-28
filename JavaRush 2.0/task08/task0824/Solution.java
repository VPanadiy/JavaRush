package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList list = new ArrayList();
        Human children1 = new Human("Jake", true, 5);
        Human children2 = new Human("Viki", false, 4);
        Human children3 = new Human("Sydney", false, 3);
        Human father = new Human("Mike", true, 25, children1, children2, children3);
        Human mother = new Human("Alison", false, 24, children1, children2, children3);
        Human grandFather1 = new Human("Andrey", true, 69, father);
        Human grandMother1 = new Human("Amber", false, 68, father);
        Human grandFather2 = new Human("John", true, 65, mother);
        Human grandMother2 = new Human("Amy", false, 64, mother);
        list.add(grandFather1);
        list.add(grandFather2);
        list.add(grandMother1);
        list.add(grandMother2);
        list.add(father);
        list.add(mother);
        list.add(children1);
        list.add(children2);
        list.add(children3);
        for (Object o : list) {
            System.out.println(o.toString());
        }

    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<Human>();

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children.add(children);
        }

        public Human(String name, boolean sex, int age, Human children1, Human children2, Human children3) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            children.add(children1);
            children.add(children2);
            children.add(children3);
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
