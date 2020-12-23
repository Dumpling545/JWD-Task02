package by.tc.task02.entity.criteria.field.impl;

import by.tc.task02.entity.Appliance;
import by.tc.task02.entity.Oven;
import by.tc.task02.entity.criteria.field.CriteriaField;

public class CapacityCriteriaField implements CriteriaField {
    private int capacity;
    @Override
    public boolean isSatisfiedBy(Appliance appliance) {
        boolean satisfied = false;
        if (appliance instanceof Oven) {
            satisfied = (((Oven) appliance).getCapacity() == capacity);
        }
        return satisfied;
    }

    public CapacityCriteriaField(int capacity) {
        this.capacity = capacity;
    }
    
}
