package by.tc.task02.entity.criteria.field.impl;

import by.tc.task02.entity.Appliance;
import by.tc.task02.entity.Oven;
import by.tc.task02.entity.Refrigerator;
import by.tc.task02.entity.criteria.field.CriteriaField;

public class WidthCriteriaField implements CriteriaField{
    private double width;
    @Override
    public boolean isSatisfiedBy(Appliance appliance) {
        boolean satisfied = false;
        if (appliance instanceof Oven) {
            satisfied = (((Oven) appliance).getWidth() == width);
        } else if (appliance instanceof Refrigerator) {
            satisfied = (((Refrigerator) appliance).getWidth() == width);
        }
        return satisfied;
    }

    public WidthCriteriaField(double width) {
        this.width = width;
    }
}
