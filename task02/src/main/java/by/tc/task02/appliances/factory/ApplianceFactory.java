package by.tc.task02.appliances.factory;

import by.tc.task02.appliances.*;

public class ApplianceFactory {

    public Appliance createAppliance(ApplianceType type, Object... args) {
        Appliance appliance = null;
        switch (type) {
            case LAPTOP:
                appliance = new Laptop((double) args[0], (int) args[1], (int) args[2],
                        (String) args[3], (int) args[4], (double) args[5]);
                break;
            case OVEN:
                appliance = new Oven((int) args[0], (int) args[1], (double) args[2],
                        (double) args[3], (int) args[4], (double) args[5]);
                break;
            case REFRIGERATOR:
                appliance = new Refrigerator((int) args[0], (int) args[1], (double) args[2],
                        (double) args[3], (double) args[4], (double) args[5]);
                break;
            case TABLET_PC:
                appliance = new TabletPC((double) args[0], (int) args[1], (int) args[2],
                        (int) args[3], (String) args[4]);
                break;
            case VACUUM_CLEANER:
                appliance = new VacuumCleaner((int) args[0], (String) args[1], (String) args[2],
                        (String) args[3], (int) args[4], (int) args[5]);
                break;
        }
        return appliance;
    }
}
