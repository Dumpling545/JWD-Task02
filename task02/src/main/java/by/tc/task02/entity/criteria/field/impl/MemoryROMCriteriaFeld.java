package by.tc.task02.entity.criteria.field.impl;

import by.tc.task02.entity.Appliance;
import by.tc.task02.entity.Laptop;
import by.tc.task02.entity.TabletPC;
import by.tc.task02.entity.criteria.field.CriteriaField;

public class MemoryROMCriteriaFeld implements CriteriaField{
    private int memoryROM;

    @Override
    public boolean isSatisfiedBy(Appliance appliance) {
        boolean satisfied = false;
        if (appliance instanceof Laptop) {
            satisfied = (((Laptop) appliance).getMemoryROM() == memoryROM);
        } else if (appliance instanceof TabletPC) {
            satisfied = (((TabletPC) appliance).getMemoryROM() == memoryROM);
        }
        return satisfied;
    }

    public MemoryROMCriteriaFeld(int memoryROM) {
        this.memoryROM = memoryROM;
    }
}
