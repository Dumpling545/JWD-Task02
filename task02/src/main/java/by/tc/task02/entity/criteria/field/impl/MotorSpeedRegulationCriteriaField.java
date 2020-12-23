package by.tc.task02.entity.criteria.field.impl;

import by.tc.task02.entity.Appliance;
import by.tc.task02.entity.VacuumCleaner;
import by.tc.task02.entity.criteria.field.CriteriaField;

public class MotorSpeedRegulationCriteriaField implements CriteriaField {
    private int motorSpeedRegulation;
    @Override
    public boolean isSatisfiedBy(Appliance appliance) {
        boolean satisfied = false;
        if (appliance instanceof VacuumCleaner) {
            satisfied = (((VacuumCleaner) appliance).getMotorSpeedRegulation() == motorSpeedRegulation);
        }
        return satisfied;
    }

    public MotorSpeedRegulationCriteriaField(int motorSpeedRegulation) {
        this.motorSpeedRegulation = motorSpeedRegulation;
    }
    
}
