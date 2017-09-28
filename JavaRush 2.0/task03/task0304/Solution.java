package com.javarush.task.task03.task0304;

/* 
Задача на проценты
*/

public class Solution {
    public static double addTenPercent(int i) {
        //напишите тут ваш код
        double tenPercent = ((double) i * 10) / 100;
        return i + tenPercent;
    }

    public static void main(String[] args) {
        System.out.println(addTenPercent(9));
    }
}
