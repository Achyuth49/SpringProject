package com.apis;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ServletImpl extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		Class[] configClass = {XmlReplacerConfig.class};
		return configClass;
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		String[] url = {"/testapi/*"};
		return url;
	}

}
