package by.tc.task02.dao;

import java.util.List;
import by.tc.task02.entity.Appliance;
import by.tc.task02.entity.criteria.Criteria;

public interface ApplianceDAO {
	List<Appliance> find(Criteria criteria);
}
