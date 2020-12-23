package by.tc.task02.entity.criteria.field.impl;

import by.tc.task02.entity.Appliance;
import by.tc.task02.entity.Speakers;
import by.tc.task02.entity.criteria.field.CriteriaField;

public class CordLengthCriteriaField implements CriteriaField {
    private int cordLength;
    @Override
    public boolean isSatisfiedBy(Appliance appliance) {
        boolean satisfied = false;
        if (appliance instanceof Speakers) {
            satisfied = (((Speakers) appliance).getCordLength() == cordLength);
        }
        return satisfied;
    }

    public CordLengthCriteriaField(int cordLength) {
        this.cordLength = cordLength;
    }
    
}
