package by.tc.task02.appliances;

public class PortableComputer extends Appliance {
    protected double batteryCapacity;
    protected int displayInches;
    protected int memoryROM;

    public PortableComputer(double batteryCapacity, int displayInches, int memoryROM) {
        this.batteryCapacity = batteryCapacity;
        this.displayInches = displayInches;
        this.memoryROM = memoryROM;
    }
}
