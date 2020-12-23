package by.tc.task02.entity;

public class Speakers extends Appliance{
    private int powerConsumption;
    private int numberOfSpeakers;
    private double frequencyLowerBound;
    private double frequencyUpperBound;
    private int cordLength;

    public Speakers(int powerConsumption, int numberOfSpeakers, double frequencyLowerBound,
            double frequencyUpperBound, int cordLength) {
        this.powerConsumption = powerConsumption;
        this.numberOfSpeakers = numberOfSpeakers;
        this.frequencyLowerBound = frequencyLowerBound;
        this.frequencyUpperBound = frequencyUpperBound;
        this.cordLength = cordLength;
    }

    public Speakers() {
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public void setNumberOfSpeakers(int numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
    }

    public double getFrequencyLowerBound() {
        return frequencyLowerBound;
    }

    public void setFrequencyLowerBound(double frequencyLowerBound) {
        this.frequencyLowerBound = frequencyLowerBound;
    }

    public double getFrequencyUpperBound() {
        return frequencyUpperBound;
    }

    public void setFrequencyUpperBound(double frequencyUpperBound) {
        this.frequencyUpperBound = frequencyUpperBound;
    }

    public int getCordLength() {
        return cordLength;
    }

    public void setCordLength(int cordLength) {
        this.cordLength = cordLength;
    }

    @Override
    public String toString() {
        return "Speakers [cordLength=" + cordLength + ", frequencyLowerBound=" + frequencyLowerBound
                + ", frequencyUpperBound=" + frequencyUpperBound + ", numberOfSpeakers="
                + numberOfSpeakers + ", powerConsumption=" + powerConsumption + "]";
    }
}
