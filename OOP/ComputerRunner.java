package com.it_cot.JavaLearn.OOP;

public class ComputerRunner {
    public static void main(String[] args) {
        Ram ram = new Ram(16);
        Ssd ssd = new Ssd(256);

        Computer computer = new Computer(ram, ssd);

        computer.print();
    }
}
