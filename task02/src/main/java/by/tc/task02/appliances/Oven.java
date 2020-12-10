package by.tc.task02.appliances;

public class Oven extends KitchenAppliance {
    protected int capacity;
    protected double depth;

    public Oven(int powerConsumption, int weight, double height, double width, int capacity,
            double depth) {
        super(powerConsumption, weight, height, width);
        this.capacity = capacity;
        this.depth = depth;
    }
}
