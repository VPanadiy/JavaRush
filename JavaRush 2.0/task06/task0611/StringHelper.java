package com.javarush.task.task06.task0611;

/* 
Класс StringHelper
*/

public class StringHelper {
    public static String multiply(String s) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            builder.append(s);
        }
        String result = builder.toString();
        //напишите тут ваш код
        return result;
    }

    public static String multiply(String s, int count) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < count; i++) {
            builder.append(s);
        }
        String result = builder.toString();
        //напишите тут ваш код
        return result;
    }

    public static void main(String[] args) {

    }
}
