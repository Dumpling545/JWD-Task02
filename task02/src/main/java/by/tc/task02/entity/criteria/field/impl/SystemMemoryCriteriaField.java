package by.tc.task02.entity.criteria.field.impl;

import by.tc.task02.entity.Appliance;
import by.tc.task02.entity.Laptop;
import by.tc.task02.entity.criteria.field.CriteriaField;

public class SystemMemoryCriteriaField implements CriteriaField {
    private int systemMemory;

    @Override
    public boolean isSatisfiedBy(Appliance appliance) {
        boolean satisfied = false;
        if (appliance instanceof Laptop) {
            satisfied = (((Laptop) appliance).getSystemMemory() == systemMemory);
        }
        return satisfied;
    }

    public SystemMemoryCriteriaField(int systemMemory) {
        this.systemMemory = systemMemory;
    }

}
