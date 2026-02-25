package org.example.BuilderPattern;

final class Computer {
    private final String HDD;
    private final String RAM;
    private Computer(ComputerBuilder builder){
        this.HDD = builder.HDD;
        this.RAM = builder.RAM;
    }

    static class ComputerBuilder{
        String HDD;
        String RAM;

        public ComputerBuilder setHDD(String HDD) {
            this.HDD = HDD;
            return this;
        }

        public ComputerBuilder setRAM(String RAM) {
            this.RAM = RAM;
            return this;
        }

        public Computer build(){
            System.out.println(this.RAM);
            return new Computer(this);
        }
    }
}
