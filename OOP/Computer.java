package com.it_cot.JavaLearn.OOP;

public class Computer {
    private Ram ram;
    private Ssd ssd;

    Computer(Ram ram, Ssd ssd) {
        this.ssd = ssd;
        this.ram = ram;
    }

    void print() {
        System.out.println("Ram: " + ram.getRam());
        System.out.println("Ssd: " + ssd.getSsd());
    }
}
