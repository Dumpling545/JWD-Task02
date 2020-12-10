package by.tc.task02.appliances;

public class Laptop extends PortableComputer {
    protected String os;
    protected int systemMemory;
    protected double cpu;

    public Laptop(double batteryCapacity, int displayInches, int memoryROM, String os,
            int systemMemory, double cpu) {
        super(batteryCapacity, displayInches, memoryROM);
        this.os = os;
        this.systemMemory = systemMemory;
        this.cpu = cpu;
    }
    
}
