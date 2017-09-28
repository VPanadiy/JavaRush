package com.javarush.task.task01.task0136;

/* 
Да хоть на Луну!
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getWeight(888));
    }

    public static double getWeight(int weightEarth) {
        //напишите тут ваш код
        double weight = weightEarth;
        double result = weight*17;
        result /= 100;
        return result;
    }
}