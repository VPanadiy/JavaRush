package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public String name;
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код
        int ageCompare = this.age > anotherCat.age ? 1 : 0;
        int weightCompare = this.weight > anotherCat.weight ? 1 : 0;
        int strengthCompare = this.strength > anotherCat.strength ? 1 : 0;
        int result = ageCompare + weightCompare + strengthCompare;
        return result > 2; // return score > 2 ? true : false;
    }

    public static void main(String[] args) {

    }
}
