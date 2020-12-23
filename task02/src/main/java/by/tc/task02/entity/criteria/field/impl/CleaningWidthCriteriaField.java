package by.tc.task02.entity.criteria.field.impl;

import by.tc.task02.entity.Appliance;
import by.tc.task02.entity.VacuumCleaner;
import by.tc.task02.entity.criteria.field.CriteriaField;

public class CleaningWidthCriteriaField implements CriteriaField {
    private int cleaningWidth;
    @Override
    public boolean isSatisfiedBy(Appliance appliance) {
        boolean satisfied = false;
        if (appliance instanceof VacuumCleaner) {
            satisfied = (((VacuumCleaner) appliance).getCleaningWidth() == cleaningWidth);
        }
        return satisfied;
    }

    public CleaningWidthCriteriaField(int cleaningWidth) {
        this.cleaningWidth = cleaningWidth;
    }
    
}
