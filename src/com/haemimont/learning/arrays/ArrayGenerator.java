package com.haemimont.learning.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArrayGenerator {
    private final int length;

    public ArrayGenerator(int length) {
        this.length = length;
    }

    public int[] generateArray() {
        List<Integer> list = new ArrayList<>(length - 1);

        int randNum;

        while (list.size() < length -1) {
            randNum = nextRandomBetween(1, length);
            if (randNum == 0) continue;

            if (!list.contains(randNum)) {
                list.add(randNum);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public int[] arrayInTheMiddle(int start,int end) {
        List<Integer> list = new ArrayList<>(length - 1);

        int randNum;

        while (list.size() < length -1) {
            randNum = nextRandomBetween(start, end -1);
            if (randNum == 0) continue;

            if (!list.contains(randNum)) {
                list.add(randNum);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    private static int nextRandomBetween(int min, int max) {
        Random random = new Random();
        int number = random.nextInt(max + 1); // inclusive max
        if (number < min) return nextRandomBetween(min, max);
        else return number;
    }
}