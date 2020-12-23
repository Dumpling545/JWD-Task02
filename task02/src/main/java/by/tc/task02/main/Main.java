package by.tc.task02.main;

import java.io.File;
import java.util.List;
import by.tc.task02.entity.Appliance;
import by.tc.task02.entity.Oven;
import by.tc.task02.entity.TabletPC;
import by.tc.task02.entity.criteria.Criteria;
import by.tc.task02.entity.criteria.field.impl.CapacityCriteriaField;
import by.tc.task02.entity.criteria.field.impl.ColorCriteriaField;
import by.tc.task02.entity.criteria.field.impl.DepthCriteriaField;
import by.tc.task02.entity.criteria.field.impl.DisplayInchesCriteriaField;
import by.tc.task02.entity.criteria.field.impl.HeightCriteriaField;
import by.tc.task02.entity.criteria.field.impl.MemoryROMCriteriaFeld;
import by.tc.task02.service.ApplianceService;
import by.tc.task02.service.ServiceFactory;

public class Main {

	public static void main(String[] args) {
		List<Appliance> appliances;
		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService service = factory.getApplianceService();

		//////////////////////////////////////////////////////////////////
		Criteria criteriaOven = new Criteria(Oven.class);// "Oven"
		criteriaOven.add(new CapacityCriteriaField(33));
		appliances = service.find(criteriaOven);
		PrintApplianceInfo.print(appliances);

		//////////////////////////////////////////////////////////////////

		criteriaOven = new Criteria(Oven.class);
		criteriaOven.add(new HeightCriteriaField(40));
		criteriaOven.add(new DepthCriteriaField(60));

		appliances = service.find(criteriaOven);

		PrintApplianceInfo.print(appliances);

		//////////////////////////////////////////////////////////////////
		Criteria criteriaTabletPC = new Criteria(TabletPC.class);
		criteriaTabletPC.add(new ColorCriteriaField("blue"));

		appliances = service.find(criteriaTabletPC);// find(Object...obj)

		PrintApplianceInfo.print(appliances);

	}

}
