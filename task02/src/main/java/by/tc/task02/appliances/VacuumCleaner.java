package by.tc.task02.appliances;

public class VacuumCleaner extends CleaningTool {
    protected String filterType;
    protected String bagType;
    protected String wandType;
    protected int cleaningWidth;
    protected int motorSpeedRegulation;

    public VacuumCleaner(int powerConsumption, String filterType, String bagType, String wandType,
            int cleaningWidth, int motorSpeedRegulation) {
        super(powerConsumption);
        this.filterType = filterType;
        this.bagType = bagType;
        this.wandType = wandType;
        this.cleaningWidth = cleaningWidth;
        this.motorSpeedRegulation = motorSpeedRegulation;
    }
}
