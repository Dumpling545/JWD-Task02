package by.tc.task02.entity.criteria.field.impl;

import by.tc.task02.entity.Appliance;
import by.tc.task02.entity.Refrigerator;
import by.tc.task02.entity.criteria.field.CriteriaField;

public class OverallCapacityCriteriaField implements CriteriaField {
    private double overallCapacity;

    @Override
    public boolean isSatisfiedBy(Appliance appliance) {
        boolean satisfied = false;
        if (appliance instanceof Refrigerator) {
            satisfied = (((Refrigerator) appliance).getOverallCapacity() == overallCapacity);
        }
        return satisfied;
    }

    public OverallCapacityCriteriaField(double overallCapacity) {
        this.overallCapacity = overallCapacity;
    }

}
