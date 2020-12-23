package by.tc.task02.service;

import java.util.List;
import by.tc.task02.entity.Appliance;
import by.tc.task02.entity.criteria.Criteria;

public interface ApplianceService {

    List<Appliance> find(Criteria criteria);

}
