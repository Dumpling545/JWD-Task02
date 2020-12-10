package by.tc.task02.appliances;

public abstract class KitchenAppliance extends Appliance {
    protected int powerConsumption;
    protected int weight;
    protected double height;
    protected double width;

    public KitchenAppliance(int powerConsumption, int weight, double height, double width) {
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.height = height;
        this.width = width;
    }



}
