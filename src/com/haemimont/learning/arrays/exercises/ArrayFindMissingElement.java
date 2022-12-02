package com.haemimont.learning.arrays.exercises;

import com.haemimont.learning.arrays.ArrayGenerator;

import java.util.Arrays;

public class ArrayFindMissingElement {

    public static void main(String[] args) {
        int length = 10;
        int sum1=(length*(length+1))/2;
        int sum=0;

        ArrayGenerator arrayGenerator1 = new ArrayGenerator(length);
        int[] arr = arrayGenerator1.generateArray();
        System.out.println(Arrays.toString(arr));
        for(int n:arr) sum=sum+n; {
            System.out.println(sum);

        }
        System.out.println("The missing number is: " +(sum1-sum));

    }


}
