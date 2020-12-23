package by.tc.task02.dao.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import by.tc.task02.dao.ApplianceLoader;
import by.tc.task02.entity.Appliance;
import by.tc.task02.entity.Laptop;
import by.tc.task02.entity.Oven;
import by.tc.task02.entity.Refrigerator;
import by.tc.task02.entity.Speakers;
import by.tc.task02.entity.TabletPC;
import by.tc.task02.entity.VacuumCleaner;
import by.tc.task02.entity.criteria.field.impl.BatteryCapacityCriteriaField;

public class ApplianceLoaderImpl implements ApplianceLoader {
    private File file;

    private final String LAPTOP = "Laptop";
    private final String OVEN = "Oven";
    private final String REFRIGERATOR = "Refrigerator";
    private final String SPEAKERS = "Speakers";
    private final String TABLET_PC = "TabletPC";
    private final String VACUUM_CLEANER = "VacuumCleaner";

    private final String BAG_TYPE = "BAG_TYPE";
    private final String BATTERY_CAPACITY = "BATTERY_CAPACITY";
    private final String CAPACITY = "CAPACITY";
    private final String CLEANING_WIDTH = "CLEANING_WIDTH";
    private final String COLOR = "COLOR";
    private final String CORD_LENGTH = "CORD_LENGTH";
    private final String CPU = "CPU";
    private final String DEPTH = "DEPTH";
    private final String DISPLAY_INCHES_LAPTOP = "DISPLAY_INCHS";
    private final String DISPLAY_INCHES_TABLET_PC = "DISPLAY_INCHES";
    private final String FILTER_TYPE = "FILTER_TYPE";
    private final String FLASH_MEMORY_CAPACITY = "FLASH_MEMORY_CAPACITY";
    private final String FREEZER_CAPACITY = "FREEZER_CAPACITY";
    private final String FREQUENCY_RANGE = "FREQUENCY_RANGE";
    private final String HEIGHT = "HEIGHT";
    private final String MEMORY_ROM = "MEMORY_ROM";
    private final String MOTOR_SPEED_REGULATION = "MOTOR_SPEED_REGULATION";
    private final String NUMBER_OF_SPEAKERS = "NUMBER_OF_SPEAKERS";
    private final String OS = "OS";
    private final String OVERALL_CAPACITY = "OVERALL_CAPACITY";
    private final String POWER_CONSUMPTION = "POWER_CONSUMPTION";
    private final String SYSTEM_MEMORY = "SYSTEM_MEMORY";
    private final String WAND_TYPE = "WAND_TYPE";
    private final String WEIGHT = "WEIGHT";
    private final String WIDTH = "WIDTH";
    private final String[] LAPTOP_FIELDS =
            {BATTERY_CAPACITY, OS, MEMORY_ROM, SYSTEM_MEMORY, CPU, DISPLAY_INCHES_LAPTOP};
    private final String[] OVEN_FIELDS =
            {POWER_CONSUMPTION, WEIGHT, CAPACITY, DEPTH, HEIGHT, WIDTH};
    private final String[] REFRIGERATOR_FIELDS =
            {POWER_CONSUMPTION, WEIGHT, FREEZER_CAPACITY, OVERALL_CAPACITY, HEIGHT, WIDTH};
    private final String[] SPEAKERS_FIELDS =
            {POWER_CONSUMPTION, NUMBER_OF_SPEAKERS, FREQUENCY_RANGE, CORD_LENGTH};
    private final String[] TABLET_PC_FIELDS =
            {BATTERY_CAPACITY, DISPLAY_INCHES_TABLET_PC, MEMORY_ROM, FLASH_MEMORY_CAPACITY, COLOR};
    private final String[] VACUUM_CLEANER_FIELDS = {POWER_CONSUMPTION, FILTER_TYPE, BAG_TYPE,
            WAND_TYPE, MOTOR_SPEED_REGULATION, CLEANING_WIDTH};

    @Override
    public List<Appliance> load() {
        List<Appliance> appliances = new ArrayList<Appliance>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (!line.isBlank()) {
                    line = line.trim();
                    int index = line.indexOf(" : ");
                    String type = line.substring(0, index);
                    String str = line.substring(index + 3);
                    switch (type) {
                        case LAPTOP:
                            appliances.add(parseLaptop(str));
                            break;
                        case OVEN:
                            appliances.add(parseOven(str));
                            break;
                        case REFRIGERATOR:
                            appliances.add(parseRefrigerator(str));
                            break;
                        case SPEAKERS:
                            appliances.add(parseSpeakers(str));
                            break;
                        case TABLET_PC:
                            appliances.add(parseTabletPC(str));
                            break;
                        case VACUUM_CLEANER:
                            appliances.add(parseVacuumCleaner(str));
                            break;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return appliances;
    }

    private Laptop parseLaptop(String str) {
        Laptop laptop = new Laptop();
        for (String field : LAPTOP_FIELDS) {
            int start = str.indexOf(field) + field.length() + 1;
            int end = str.indexOf(",", start);
            if (end == -1)
                end = str.length();
            switch (field) {
                case BATTERY_CAPACITY:
                    laptop.setBatteryCapacity(Double.parseDouble(str.substring(start, end)));
                    break;
                case OS:
                    laptop.setOperatingSystem(str.substring(start, end));
                    break;
                case MEMORY_ROM:
                    laptop.setMemoryROM(Integer.parseInt(str.substring(start, end)));
                    break;
                case SYSTEM_MEMORY:
                    laptop.setSystemMemory(Integer.parseInt(str.substring(start, end)));
                    break;
                case CPU:
                    laptop.setCpu(Double.parseDouble(str.substring(start, end)));
                    break;
                case DISPLAY_INCHES_LAPTOP:
                    laptop.setDisplayInches(Integer.parseInt(str.substring(start, end)));
                    break;
            }
        }
        return laptop;
    }

    private Oven parseOven(String str) {
        Oven oven = new Oven();
        for (String field : OVEN_FIELDS) {
            int start = str.indexOf(field) + field.length() + 1;
            int end = str.indexOf(",", start);
            if (end == -1)
                end = str.length();
            switch (field) {
                case POWER_CONSUMPTION:
                    oven.setPowerConsumption(Integer.parseInt(str.substring(start, end)));
                    break;
                case WEIGHT:
                    oven.setWeight(Integer.parseInt(str.substring(start, end)));
                    break;
                case CAPACITY:
                    oven.setCapacity(Integer.parseInt(str.substring(start, end)));
                    break;
                case HEIGHT:
                    oven.setHeight(Double.parseDouble(str.substring(start, end)));
                    break;
                case WIDTH:
                    oven.setWidth(Double.parseDouble(str.substring(start, end)));
                    break;
                case DEPTH:
                    oven.setDepth(Integer.parseInt(str.substring(start, end)));
                    break;
            }
        }
        return oven;
    }

    private Refrigerator parseRefrigerator(String str) {
        Refrigerator refrigerator = new Refrigerator();
        for (String field : REFRIGERATOR_FIELDS) {
            int start = str.indexOf(field) + field.length() + 1;
            int end = str.indexOf(",", start);
            if (end == -1)
                end = str.length();
            switch (field) {
                case POWER_CONSUMPTION:
                    refrigerator.setPowerConsumption(Integer.parseInt(str.substring(start, end)));
                    break;
                case WEIGHT:
                    refrigerator.setWeight(Integer.parseInt(str.substring(start, end)));
                    break;
                case FREEZER_CAPACITY:
                    refrigerator.setFreezerCapacity(Integer.parseInt(str.substring(start, end)));
                    break;
                case HEIGHT:
                    refrigerator.setHeight(Double.parseDouble(str.substring(start, end)));
                    break;
                case WIDTH:
                    refrigerator.setHeight(Double.parseDouble(str.substring(start, end)));
                    break;
                case OVERALL_CAPACITY:
                    refrigerator.setOverallCapacity(Double.parseDouble(str.substring(start, end)));
                    break;
            }
        }
        return refrigerator;
    }

    private Speakers parseSpeakers(String str) {
        Speakers speakers = new Speakers();
        for (String field : SPEAKERS_FIELDS) {
            int start = str.indexOf(field) + field.length() + 1;
            int end = str.indexOf(",", start);
            if (end == -1)
                end = str.length();
            switch (field) {
                case POWER_CONSUMPTION:
                    speakers.setPowerConsumption(Integer.parseInt(str.substring(start, end)));
                    break;
                case NUMBER_OF_SPEAKERS:
                    speakers.setNumberOfSpeakers(Integer.parseInt(str.substring(start, end)));
                    break;
                case CORD_LENGTH:
                    speakers.setCordLength(Integer.parseInt(str.substring(start, end)));
                    break;
                case FREQUENCY_RANGE:
                    String sub = str.substring(start, end);
                    int separator = sub.indexOf("-");
                    speakers.setFrequencyLowerBound(
                            Double.parseDouble(sub.substring(0, separator)));
                    speakers.setFrequencyUpperBound(
                            Double.parseDouble(sub.substring(separator + 1)));
                    break;
            }
        }
        return speakers;
    }

    private TabletPC parseTabletPC(String str) {
        TabletPC tablet = new TabletPC();
        for (String field : TABLET_PC_FIELDS) {
            int start = str.indexOf(field) + field.length() + 1;
            int end = str.indexOf(",", start);
            if (end == -1)
                end = str.length();
            switch (field) {
                case BATTERY_CAPACITY:
                    tablet.setBatteryCapacity(Double.parseDouble(str.substring(start, end)));
                    break;
                case COLOR:
                    tablet.setColor(str.substring(start, end));
                    break;
                case MEMORY_ROM:
                    tablet.setMemoryROM(Integer.parseInt(str.substring(start, end)));
                    break;
                case FLASH_MEMORY_CAPACITY:
                    tablet.setFlashMemoryCapacity(Integer.parseInt(str.substring(start, end)));
                    break;
                case DISPLAY_INCHES_TABLET_PC:
                    tablet.setDisplayInches(Integer.parseInt(str.substring(start, end)));
                    break;
            }
        }
        return tablet;
    }

    private VacuumCleaner parseVacuumCleaner(String str) {
        VacuumCleaner vacuumCleaner = new VacuumCleaner();
        for (String field : SPEAKERS_FIELDS) {
            int start = str.indexOf(field) + field.length() + 1;
            int end = str.indexOf(",", start);
            if (end == -1)
                end = str.length();
            switch (field) {
                case POWER_CONSUMPTION:
                    vacuumCleaner.setPowerConsumption(Integer.parseInt(str.substring(start, end)));
                    break;
                case FILTER_TYPE:
                    vacuumCleaner.setFilterType(str.substring(start, end));
                    break;
                case BAG_TYPE:
                    vacuumCleaner.setBagType(str.substring(start, end));
                    break;
                case WAND_TYPE:
                    vacuumCleaner.setWandType(str.substring(start, end));
                    break;
                case MOTOR_SPEED_REGULATION:
                    vacuumCleaner
                            .setMotorSpeedRegulation(Integer.parseInt(str.substring(start, end)));
                    break;
                case CLEANING_WIDTH:
                    vacuumCleaner.setCleaningWidth(Integer.parseInt(str.substring(start, end)));
                    break;
            }
        }
        return vacuumCleaner;
    }

    public ApplianceLoaderImpl() {
        file = new File("src/resources/appliances_db.txt");
    }
}
