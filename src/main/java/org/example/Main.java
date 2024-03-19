package org.example;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            list.add(rand.nextInt()%100);
            System.out.println(list.get(i));
        }
    }
}