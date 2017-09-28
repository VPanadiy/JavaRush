package com.javarush.task.task09.task0921;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        List<Integer> integerList = new ArrayList<>();
        int a;
        while (true) {
            try {
                integerList.add(a = scanner.nextInt());
            } catch (Exception e) {
                for (Integer integer : integerList) {
                    System.out.println(integer);
                }
                break;
            }
        }
    }
}
