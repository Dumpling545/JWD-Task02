package by.tc.task02.entity.criteria.field.impl;

import by.tc.task02.entity.Appliance;
import by.tc.task02.entity.Laptop;
import by.tc.task02.entity.TabletPC;
import by.tc.task02.entity.criteria.field.CriteriaField;

public class DisplayInchesCriteriaField implements CriteriaField {
    private int displayInches;

    @Override
    public boolean isSatisfiedBy(Appliance appliance) {
        boolean satisfied = false;
        if (appliance instanceof Laptop) {
            satisfied = (((Laptop) appliance).getDisplayInches() == displayInches);
        } else if (appliance instanceof TabletPC) {
            satisfied = (((TabletPC) appliance).getDisplayInches() == displayInches);
        }
        return satisfied;
    }

    public DisplayInchesCriteriaField(int displayInches) {
        this.displayInches = displayInches;
    }
    
}
