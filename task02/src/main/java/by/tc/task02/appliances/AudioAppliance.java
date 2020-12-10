package by.tc.task02.appliances;

public abstract class AudioAppliance extends Appliance {
    protected int powerConsumption;
    protected double minFrequencyRange;
    protected double maxFrequencyRange;

    public AudioAppliance(int powerConsumption, double minFrequencyRange,
            double maxFrequencyRange) {
        this.powerConsumption = powerConsumption;
        this.minFrequencyRange = minFrequencyRange;
        this.maxFrequencyRange = maxFrequencyRange;
    }

}
