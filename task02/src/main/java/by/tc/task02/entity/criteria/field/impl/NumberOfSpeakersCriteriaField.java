package by.tc.task02.entity.criteria.field.impl;

import by.tc.task02.entity.Appliance;
import by.tc.task02.entity.Speakers;
import by.tc.task02.entity.criteria.field.CriteriaField;

public class NumberOfSpeakersCriteriaField implements CriteriaField {

    private int numberOfSpeakers;

    @Override
    public boolean isSatisfiedBy(Appliance appliance) {
        boolean satisfied = false;
        if (appliance instanceof Speakers) {
            satisfied = (((Speakers) appliance).getNumberOfSpeakers() == numberOfSpeakers);
        }
        return satisfied;
    }

    public NumberOfSpeakersCriteriaField(int numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
    }

}
