package com.javarush.test.level03.lesson03.task02;

/* Конвертер валют
Реализуйте метод convertEurToUsd, переводящий евро в доллары по заданному курсу.
Вызовите его дважды в методе main с любыми параметрами. Результаты выведите на экран, каждый раз с новой строки.
Подсказка:
Расчет выполняется по формуле: долларСША = евро * курс
*/
public class Solution
{
    public static void main(String[] args) {
        //напишите тут ваш код
        System.out.println(convertEurToUsd(100,5.5));
        System.out.println(convertEurToUsd(100,29.5));
    }

    public static double convertEurToUsd(int eur, double course){
        //напишите тут ваш код
        double USA = eur*course;
        return USA;
    }
}
