package by.tc.task02.entity.criteria.field.impl;

import by.tc.task02.entity.Appliance;
import by.tc.task02.entity.TabletPC;
import by.tc.task02.entity.criteria.field.CriteriaField;

public class FlashMemoryCapacityCriteriaField implements CriteriaField {

    private int flashMemoryCapacity;
    @Override
    public boolean isSatisfiedBy(Appliance appliance) {
        boolean satisfied = false;
        if (appliance instanceof TabletPC) {
            satisfied = (((TabletPC) appliance).getFlashMemoryCapacity() == flashMemoryCapacity);
        }
        return satisfied;
    }

    public FlashMemoryCapacityCriteriaField(int flashMemoryCapacity) {
        this.flashMemoryCapacity = flashMemoryCapacity;
    }

}
