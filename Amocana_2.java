package com.company;

import java.util.Random;
import java.util.ArrayList;

public class Amocana_2 {

        public void Amoc_2() {

            int i;

            Random random = new Random();
            ArrayList<Integer> list = new ArrayList<Integer>();

            for (i = 0; i < 12; i++) {
                list.add(random.nextInt(6) + 5);
            }

            ArrayList<Integer> randnumb = new ArrayList<Integer>(list);

            for (i = 4; i < 12 + 4; i += 4) {
                randnumb.add(i, random.nextInt(6) + 20);
            }

            System.out.println(list);
            System.out.println(randnumb);

        }
    }
