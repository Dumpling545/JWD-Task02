package by.tc.task02.entity.criteria.field.impl;

import by.tc.task02.entity.Appliance;
import by.tc.task02.entity.Laptop;
import by.tc.task02.entity.criteria.field.CriteriaField;

public class OperatingSystemCriteriaField implements CriteriaField {
    private String operatingSystem;

    @Override
    public boolean isSatisfiedBy(Appliance appliance) {
        boolean satisfied = false;
        if (appliance instanceof Laptop) {
            satisfied = (((Laptop) appliance).getOperatingSystem().equals(operatingSystem));
        }
        return satisfied;
    }

    public OperatingSystemCriteriaField(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

}
