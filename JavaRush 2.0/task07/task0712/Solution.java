package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> s = new ArrayList<>();
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 0; i < 10; i++) {
            s.add(reader.readLine()) ;
            if (s.get(minIndex).length() > s.get(i).length()) minIndex = i;
            if (s.get(maxIndex).length() < s.get(i).length()) maxIndex = i;
        }
        if (minIndex < maxIndex) System.out.println(s.get(minIndex));
        else System.out.println(s.get(maxIndex));
    }
}
