package by.tc.task02.appliances;

public class Refrigerator extends KitchenAppliance {
    protected double freezerCapacity;
    protected double overallCapacity;

    public Refrigerator(int powerConsumption, int weight, double height, double width,
            double freezerCapacity, double overallCapacity) {
        super(powerConsumption, weight, height, width);
        this.freezerCapacity = freezerCapacity;
        this.overallCapacity = overallCapacity;
    }
}
