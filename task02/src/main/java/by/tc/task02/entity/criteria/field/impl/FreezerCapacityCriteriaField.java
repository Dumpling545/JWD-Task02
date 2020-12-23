package by.tc.task02.entity.criteria.field.impl;

import by.tc.task02.entity.Appliance;
import by.tc.task02.entity.Refrigerator;
import by.tc.task02.entity.criteria.field.CriteriaField;

public class FreezerCapacityCriteriaField implements CriteriaField{
    private int freezerCapacity;

    @Override
    public boolean isSatisfiedBy(Appliance appliance) {
        boolean satisfied = false;
        if (appliance instanceof Refrigerator) {
            satisfied = (((Refrigerator) appliance).getFreezerCapacity() == freezerCapacity);
        } 
        return satisfied;
    }

    public FreezerCapacityCriteriaField(int freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
    }
    
}
