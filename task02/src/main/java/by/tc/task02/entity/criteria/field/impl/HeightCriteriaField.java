package by.tc.task02.entity.criteria.field.impl;

import by.tc.task02.entity.Appliance;
import by.tc.task02.entity.Oven;
import by.tc.task02.entity.Refrigerator;
import by.tc.task02.entity.criteria.field.CriteriaField;

public class HeightCriteriaField implements CriteriaField {
    private double height;
    @Override
    public boolean isSatisfiedBy(Appliance appliance) {
        boolean satisfied = false;
        if (appliance instanceof Oven) {
            satisfied = (((Oven) appliance).getHeight() == height);
        } else if (appliance instanceof Refrigerator) {
            satisfied = (((Refrigerator) appliance).getHeight() == height);
        }
        return satisfied;
    }

    public HeightCriteriaField(double height) {
        this.height = height;
    }
    
}
