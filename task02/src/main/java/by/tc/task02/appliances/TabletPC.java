package by.tc.task02.appliances;

public class TabletPC extends PortableComputer {
    protected int flashMemoryCapacity;
    protected String color;
    public TabletPC(double batteryCapacity, int displayInches, int memoryROM,
            int flashMemoryCapacity, String color) {
        super(batteryCapacity, displayInches, memoryROM);
        this.flashMemoryCapacity = flashMemoryCapacity;
        this.color = color;
    }
}
