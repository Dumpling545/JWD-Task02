package by.tc.task02.entity;

public class Laptop extends Appliance{
    private double batteryCapacity;
    private String operatingSystem;
    private int memoryROM;
    private int systemMemory;
    private double cpu;
    private int displayInches;

    public Laptop(double batteryCapacity, String operatingSystem, int memoryROM, int systemMemory,
            double cpu, int displayInches) {
        this.batteryCapacity = batteryCapacity;
        this.operatingSystem = operatingSystem;
        this.memoryROM = memoryROM;
        this.systemMemory = systemMemory;
        this.cpu = cpu;
        this.displayInches = displayInches;
    }

    public Laptop() {
    }


    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public int getMemoryROM() {
        return memoryROM;
    }

    public void setMemoryROM(int memoryROM) {
        this.memoryROM = memoryROM;
    }

    public int getSystemMemory() {
        return systemMemory;
    }

    public void setSystemMemory(int systemMemory) {
        this.systemMemory = systemMemory;
    }

    public double getCpu() {
        return cpu;
    }

    public void setCpu(double cpu) {
        this.cpu = cpu;
    }

    public int getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(int displayInches) {
        this.displayInches = displayInches;
    }

    @Override
    public String toString() {
        return "Laptop [batteryCapacity=" + batteryCapacity + ", cpu=" + cpu + ", displayInches="
                + displayInches + ", memoryROM=" + memoryROM + ", operatingSystem="
                + operatingSystem + ", systemMemory=" + systemMemory + "]";
    }
}
