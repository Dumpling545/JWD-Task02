package by.tc.task02.dao.impl;

import java.util.ArrayList;
import java.util.List;
import by.tc.task02.dao.ApplianceDAO;
import by.tc.task02.dao.ApplianceLoader;
import by.tc.task02.dao.ApplianceLoaderFactory;
import by.tc.task02.entity.Appliance;
import by.tc.task02.entity.criteria.Criteria;

public class ApplianceDAOImpl implements ApplianceDAO {
    private List<Appliance> appliances;
    private ApplianceLoader loader = ApplianceLoaderFactory.getInstance().getApplianceLoader();

    @Override
    public List<Appliance> find(Criteria criteria) {
        List<Appliance> result = new ArrayList<Appliance>();
        for (Appliance appliance : getAppliances()) {
            if (criteria.isSatisfiedBy(appliance)) {
                result.add(appliance);
            }
        }
        return result;
    }

    public List<Appliance> getAppliances() {
        if (appliances == null) {
            appliances = loader.load();
        }
        return appliances;
    }
    // you may add your own code here

}


// you may add your own new classes
