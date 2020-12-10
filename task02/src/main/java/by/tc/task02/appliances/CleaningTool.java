package by.tc.task02.appliances;

public abstract class CleaningTool extends Appliance {
    protected int powerConsumption;

    public CleaningTool(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }
}
