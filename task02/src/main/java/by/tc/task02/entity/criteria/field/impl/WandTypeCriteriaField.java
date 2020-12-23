package by.tc.task02.entity.criteria.field.impl;

import by.tc.task02.entity.Appliance;
import by.tc.task02.entity.VacuumCleaner;
import by.tc.task02.entity.criteria.field.CriteriaField;

public class WandTypeCriteriaField implements CriteriaField {
    private String wandType;

    @Override
    public boolean isSatisfiedBy(Appliance appliance) {
        boolean satisfied = false;
        if (appliance instanceof VacuumCleaner) {
            satisfied = (((VacuumCleaner) appliance).getWandType().equals(wandType));
        }
        return satisfied;
    }

    public WandTypeCriteriaField(String wandType) {
        this.wandType = wandType;
    }
    
}
