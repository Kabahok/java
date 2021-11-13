package com.it_cot.JavaLearn.Task;

/**
 * Напистать программу, которая проверяяет равны ли между собой эллементы двухмерного массива
 */

public class JavaForTask2 {
    public static void main(String[] args) {
        int[][] values1 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int [][] values2 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.println(F(values1, values2));
    }

    public static boolean F(int[][] arr1, int[][] arr2) {
        if (arr1.length != arr1.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            int row1[] = arr1[i];
            int row2[] = arr2[i];
            if (row1.length == row2.length) {
                for (int g = 0; g < row1.length; g++) {
                    if (row1[g] != row2[g]) {
                        return false;
                    }
                }
            } else {
                return false;
            }
        }
        return true;
    }
}
