package com.haemimont.learning.arrays.exercises;

import com.haemimont.learning.arrays.ArrayGenerator;

import java.util.Arrays;

public class ArrayFindMiddleElement {

    public static void main(String[] args) {

        int start = 5;
        int end = 15;
        int length = (end - start);
        int sum = (length * (start + end - 1)) / 2;
        int sum1=0;

        ArrayGenerator arrayGenerator1 = new ArrayGenerator(length);
        int[] arr = arrayGenerator1.arrayInTheMiddle(start, end);
        for (int i:arr)  {
            sum1 = sum1+i;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("The sum with all numbers: " + sum);
        System.out.println("The sum with missing number: " + sum1);
        System.out.println("The missing number is: " +(sum-sum1));

    }

}







