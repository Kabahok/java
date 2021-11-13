package com.it_cot.JavaLearn.Task;

/**
 * написать программу которая будет считать сумму значение между максимальным и минималльным значением
 */

public class JavaForTask3 {
    public static void main(String[] args) {
        int[] values = {1,2,3,4, 0, 3, 5, 6, 7, 10, 0};

        System.out.println(sum(values));

    }

    public static int sum(int[] arr) {
        int sum = 0;
        int min = 10000000;
        int minIndex = 0;
        int maxIndex = 0;
        int max = -10000000;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                if (arr[i] != min) {
                    min = arr[i];
                    minIndex = i;
                }
            }
            if (arr[i] > max) {
                if (arr[i] != max) {
                    max = arr[i];
                    maxIndex = i;
                }
            }
        }
        for (int d = minIndex+1; d < maxIndex; d++) {
            sum += arr[d];
        }

        return sum;
    }
}
