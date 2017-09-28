package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayListMod3 = new ArrayList<>();
        ArrayList<Integer> arrayListMod2 = new ArrayList<>();
        ArrayList<Integer> arrayListMod6 = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            arrayList.add(Integer.parseInt(bufferedReader.readLine()));
        }

        for (Integer anArrayList : arrayList) {
            if (anArrayList % 3 == 0 && anArrayList % 2 == 0) {
                arrayListMod3.add(anArrayList);
                arrayListMod2.add(anArrayList);
            } else if (anArrayList % 3 == 0) {
                arrayListMod3.add(anArrayList);
            } else if (anArrayList % 2 == 0) {
                arrayListMod2.add(anArrayList);
            } else {
                arrayListMod6.add(anArrayList);
            }
        }

        printList(arrayListMod3);
        printList(arrayListMod2);
        printList(arrayListMod6);

    }

    public static void printList(List<Integer> list) {
        //напишите тут ваш код
        for (Integer integer : list) {
            System.out.println(integer);
        }

    }
}
