package by.tc.task02.entity.criteria.field.impl;

import by.tc.task02.entity.Appliance;
import by.tc.task02.entity.VacuumCleaner;
import by.tc.task02.entity.criteria.field.CriteriaField;

public class BagTypeCriteriaField implements CriteriaField{
    private String bagType;

    @Override
    public boolean isSatisfiedBy(Appliance appliance) {
        boolean satisfied = false;
        if (appliance instanceof VacuumCleaner) {
            satisfied = (((VacuumCleaner) appliance).getBagType().equals(bagType));
        }
        return satisfied;
    }

    public BagTypeCriteriaField(String bagType) {
        this.bagType = bagType;
    }
}
