package by.tc.task02.entity.criteria.field.impl;

import by.tc.task02.entity.Appliance;
import by.tc.task02.entity.Laptop;
import by.tc.task02.entity.criteria.field.CriteriaField;

public class CPUCriteriaField implements CriteriaField {
    private double cpu;

    @Override
    public boolean isSatisfiedBy(Appliance appliance) {
        boolean satisfied = false;
        if (appliance instanceof Laptop) {
            satisfied = (((Laptop) appliance).getCpu() == cpu);
        }
        return satisfied;
    }

    public CPUCriteriaField(double cpu) {
        this.cpu = cpu;
    }
    
}
