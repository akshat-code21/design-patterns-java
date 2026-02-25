package org.example.BuilderPattern;

import org.example.BuilderPattern.Computer;

public class Main{
    public static void main(String[] args) {
        Computer c1 = new Computer.ComputerBuilder().setRAM("4GB").setHDD("2TB").build();
        System.out.println(c1);
    }
}