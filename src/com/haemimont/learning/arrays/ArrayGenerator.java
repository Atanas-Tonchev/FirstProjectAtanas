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
        Random random = new Random();

        int randNum;

        while (list.size() < length -1) {
            randNum = random.nextInt(length + 1);
            if (randNum == 0) continue;

            if (!list.contains(randNum)) {
                list.add(randNum);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
