package by.tc.task02.entity.criteria.field.impl;

import by.tc.task02.entity.Appliance;
import by.tc.task02.entity.Laptop;
import by.tc.task02.entity.TabletPC;
import by.tc.task02.entity.criteria.field.CriteriaField;

public class BatteryCapacityCriteriaField implements CriteriaField {
    private double batteryCapacity;

    @Override
    public boolean isSatisfiedBy(Appliance appliance) {
        boolean satisfied = false;
        if (appliance instanceof Laptop) {
            satisfied = (((Laptop) appliance).getBatteryCapacity() == batteryCapacity);
        } else if (appliance instanceof TabletPC) {
            satisfied = (((TabletPC) appliance).getBatteryCapacity() == batteryCapacity);
        }
        return satisfied;
    }

    public BatteryCapacityCriteriaField(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

}
