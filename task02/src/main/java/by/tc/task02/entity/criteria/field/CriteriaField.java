package by.tc.task02.entity.criteria.field;

import by.tc.task02.entity.Appliance;

public interface CriteriaField {
    public boolean isSatisfiedBy(Appliance appliance);
}
