package by.tc.task02.entity.criteria.field.impl;

import by.tc.task02.entity.Appliance;
import by.tc.task02.entity.Oven;
import by.tc.task02.entity.Refrigerator;
import by.tc.task02.entity.criteria.field.CriteriaField;

public class WeightCriteriaField implements CriteriaField {
    private int weight;

    @Override
    public boolean isSatisfiedBy(Appliance appliance) {
        boolean satisfied = false;
        if (appliance instanceof Oven) {
            satisfied = (((Oven) appliance).getWeight() == weight);
        } else if (appliance instanceof Refrigerator) {
            satisfied = (((Refrigerator) appliance).getWeight() == weight);
        }
        return satisfied;
    }

    public WeightCriteriaField(int weight) {
        this.weight = weight;
    }

}
