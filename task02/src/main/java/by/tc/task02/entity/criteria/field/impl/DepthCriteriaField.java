package by.tc.task02.entity.criteria.field.impl;

import by.tc.task02.entity.Appliance;
import by.tc.task02.entity.Oven;
import by.tc.task02.entity.criteria.field.CriteriaField;

public class DepthCriteriaField implements CriteriaField {
    private int depth;
    @Override
    public boolean isSatisfiedBy(Appliance appliance) {
        boolean satisfied = false;
        if (appliance instanceof Oven) {
            satisfied = (((Oven) appliance).getDepth() == depth);
        }
        return satisfied;
    }

    public DepthCriteriaField(int depth) {
        this.depth = depth;
    }
    
}
