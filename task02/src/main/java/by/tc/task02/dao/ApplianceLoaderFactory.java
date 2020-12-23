package by.tc.task02.dao;

import by.tc.task02.dao.impl.ApplianceLoaderImpl;

public class ApplianceLoaderFactory {
    private static final ApplianceLoaderFactory instance = new ApplianceLoaderFactory();

	private final ApplianceLoader applianceLoader = new ApplianceLoaderImpl();
	
	private ApplianceLoaderFactory() {}

	public ApplianceLoader getApplianceLoader() {
		return applianceLoader;
	}

	public static ApplianceLoaderFactory getInstance() {
		return instance;
	}
}
