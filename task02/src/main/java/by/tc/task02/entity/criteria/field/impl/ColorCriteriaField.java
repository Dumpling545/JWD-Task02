package by.tc.task02.entity.criteria.field.impl;

import by.tc.task02.entity.Appliance;
import by.tc.task02.entity.TabletPC;
import by.tc.task02.entity.criteria.field.CriteriaField;

public class ColorCriteriaField implements CriteriaField {
    private String color;

    @Override
    public boolean isSatisfiedBy(Appliance appliance) {
        boolean satisfied = false;
        if (appliance instanceof TabletPC) {
            satisfied = (((TabletPC) appliance).getColor().equals(color));
        }
        return satisfied;
    }

    public ColorCriteriaField(String color) {
        this.color = color;
    }
    
}
