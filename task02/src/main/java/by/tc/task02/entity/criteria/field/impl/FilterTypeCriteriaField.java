package by.tc.task02.entity.criteria.field.impl;

import by.tc.task02.entity.Appliance;
import by.tc.task02.entity.VacuumCleaner;
import by.tc.task02.entity.criteria.field.CriteriaField;

public class FilterTypeCriteriaField implements CriteriaField{
    private String filterType;

    @Override
    public boolean isSatisfiedBy(Appliance appliance) {
        boolean satisfied = false;
        if (appliance instanceof VacuumCleaner) {
            satisfied = (((VacuumCleaner) appliance).getFilterType().equals(filterType));
        }
        return satisfied;
    }

    public FilterTypeCriteriaField(String filterType) {
        this.filterType = filterType;
    }
}
