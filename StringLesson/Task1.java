package com.it_cot.StringLesson;

public class Task1 {
    public static void main(String[] args) {
        String value = "kjfngkjfng :( kjdfn :) :( :( :) :) jfnfkgn :(";
        String result = replace(value);
        System.out.println(result);
    }

    public static String replace(String value) {
        return value.replace(":(", ":)");
    }
}
