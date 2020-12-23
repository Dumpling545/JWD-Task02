package by.tc.task02.entity.criteria.field.impl;

import by.tc.task02.entity.Appliance;
import by.tc.task02.entity.Speakers;
import by.tc.task02.entity.criteria.field.CriteriaField;

public class FrequencyRangeCriteriaField implements CriteriaField {
    private int frequencyLowerBound;
    private int frequencyUpperBound;

    @Override
    public boolean isSatisfiedBy(Appliance appliance) {
        boolean satisfied = false;
        if (appliance instanceof Speakers) {
            Speakers s = (Speakers) appliance;
            satisfied = (s.getFrequencyLowerBound() == frequencyLowerBound
                    && s.getFrequencyUpperBound() == frequencyUpperBound);
        }
        return satisfied;
    }

    public FrequencyRangeCriteriaField(int frequencyLowerBound, int frequencyUpperBound) {
        this.frequencyLowerBound = frequencyLowerBound;
        this.frequencyUpperBound = frequencyUpperBound;
    }
}
