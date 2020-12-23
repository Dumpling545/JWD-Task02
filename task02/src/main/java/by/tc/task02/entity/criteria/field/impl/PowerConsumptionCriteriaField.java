package by.tc.task02.entity.criteria.field.impl;

import javax.security.auth.Refreshable;
import by.tc.task02.entity.Appliance;
import by.tc.task02.entity.Oven;
import by.tc.task02.entity.Refrigerator;
import by.tc.task02.entity.Speakers;
import by.tc.task02.entity.VacuumCleaner;
import by.tc.task02.entity.criteria.field.CriteriaField;

public class PowerConsumptionCriteriaField implements CriteriaField {
    private int powerConsumption;

    @Override
    public boolean isSatisfiedBy(Appliance appliance) {
        boolean satisfied = false;
        if (appliance instanceof Oven) {
            satisfied = (((Oven) appliance).getPowerConsumption() == powerConsumption);
        } else if (appliance instanceof Refrigerator) {
            satisfied = (((Refrigerator) appliance).getPowerConsumption() == powerConsumption);
        } else if (appliance instanceof VacuumCleaner) {
            satisfied = (((VacuumCleaner) appliance).getPowerConsumption() == powerConsumption);
        } else if (appliance instanceof Speakers) {
            satisfied = (((Speakers) appliance).getPowerConsumption() == powerConsumption);
        }
        return satisfied;
    }

    public PowerConsumptionCriteriaField(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

}
