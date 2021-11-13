package com.it_cot.JavaLearn;

// Написать программу, которрая печататет массив сначала в обычном порядке, а затем в обратном

public class JavaForWhile {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int result = num(a, b);
        System.out.println(result);
    }

    public static int num (int a, int b) {
        return a * b;
    }
}
