package com.javarush.task.task08.task0820;

import org.omg.CORBA.Object;

import java.util.HashSet;
import java.util.Set;

/* 
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set createCats() {
        HashSet result = new HashSet();
        for (int i = 0; i< 4; i++)
        {
            result.add(new Cat());
        }
        return result;
    }

    public static Set createDogs() {
        Set dogs = new HashSet<>();
        for(int i = 0; i< 3; i++)
        {
            dogs.add(new Dog());
        }
        return dogs;
    }

    public static Set join(Set cats, Set dogs) {
        Set result = new HashSet<>();
        result.addAll(cats);
        result.addAll(dogs);
        return result;
    }

    public static void removeCats(Set pets, Set cats) {
        pets.removeAll(cats);

    }

    public static void printPets(Set pets) {
        for (java.lang.Object pet : pets) {
            System.out.println(pet.toString());
        }

    }

    //напишите тут ваш код

    public static class Dog {}

    public static class Cat {}
}
