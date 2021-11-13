package com.it_cot.JavaLearn.Task;

/**
 * Написать программу, заносящая в массив первые 100 целых чисел делящихся на 13
 * или 17 и печатаюшую его
 */

public class JavaForTask1 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        addNumInArr(arr);
    }

    public static void addNumInArr(int[] arr) {
        int startNum = 1;
        int count = 0;
        int i = 0;
        while (true) {
            if (startNum % 13 == 0 || startNum % 17 == 0) {
                arr[i++] = startNum;
                count++;
            }
            startNum += 1;
            if (count == 100) {
                break;
            }
        }
    }
}
