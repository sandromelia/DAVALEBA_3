package com.company;

import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

//      Amocana 1

        int i;

        Random rand = new Random();
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (i = 0; i < 12; i++) {
            list.add(rand.nextInt());
        }

        ArrayList<Integer> randnumb = new ArrayList<Integer>(list);

        for (i = 0; i < 6; i++) {
            randnumb.remove(i);
        }

        Collections.sort(list);
        System.out.println(list);
        Collections.sort(randnumb);
        System.out.println(randnumb);

        Amocana_2 exc2 = new Amocana_2();
        exc2.Amoc_2();
    }
}