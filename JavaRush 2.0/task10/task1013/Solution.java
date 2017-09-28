package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // напишите тут ваши переменные и конструкторы
        private String name;
        private String surname;
        private boolean sex;
        private int age;
        private int height;
        private double weight;

        public Human() {}

        public Human(String name) {
            this.name = name;
        }

        public Human(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }

        public Human(String name, String surname, boolean sex) {
            this.name = name;
            this.surname = surname;
            this.sex = sex;
        }

        public Human(String name, String surname, boolean sex, int age) {
            this.name = name;
            this.surname = surname;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, String surname, boolean sex, int age, int height) {
            this.name = name;
            this.surname = surname;
            this.sex = sex;
            this.age = age;
            this.height = height;
        }

        public Human(String name, String surname, boolean sex, int age, int height, double weight) {
            this.name = name;
            this.surname = surname;
            this.sex = sex;
            this.age = age;
            this.height = height;
            this.weight = weight;
        }

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Human(String name, String surname, int age, int height) {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.height = height;
        }

        public Human(String name, String surname, int age, double weight) {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.weight = weight;
        }
    }
}
