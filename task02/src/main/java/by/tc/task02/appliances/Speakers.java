package by.tc.task02.appliances;

public class Speakers extends AudioAppliance {
    protected int numberOfSpeakers;
    protected double cordLength;

    public Speakers(int powerConsumption, double minFrequencyRange, double maxFrequencyRange,
            int numberOfSpeakers, double cordLength) {
        super(powerConsumption, minFrequencyRange, maxFrequencyRange);
        this.numberOfSpeakers = numberOfSpeakers;
        this.cordLength = cordLength;
    }
}
