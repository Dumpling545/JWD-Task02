package by.tc.task02.entity.criteria;

import java.util.ArrayList;
import java.util.List;
import by.tc.task02.entity.Appliance;
import by.tc.task02.entity.criteria.field.CriteriaField;

public class Criteria{

    private List<CriteriaField> criteriaFields = new ArrayList<CriteriaField>();
    private Class<? extends Appliance> type;
    public Criteria(Class<? extends Appliance> type) {
        this.type = type;
    }

    public void add(CriteriaField field) {
        criteriaFields.add(field);
    }
    public boolean isSatisfiedBy(Appliance appliance){
        boolean satisfied = true;
        for(CriteriaField field : criteriaFields){
            satisfied = field.isSatisfiedBy(appliance) && type.equals(appliance.getClass());
            if(!satisfied) break;
        }
        return satisfied;
    }

}
