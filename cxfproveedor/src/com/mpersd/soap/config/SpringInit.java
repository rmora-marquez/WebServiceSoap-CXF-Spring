package com.mpersd.soap.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

public class SpringInit implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext container) throws ServletException {
		AnnotationConfigWebApplicationContext context =
				new AnnotationConfigWebApplicationContext();
		context.register(SpringConfig.class);
		container.addListener(new ContextLoaderListener(context));
		ServletRegistration.Dynamic dispatcher = 
				container.addServlet("dispatcher", new CXFServlet());
		dispatcher.addMapping("/services/*");
		dispatcher.setLoadOnStartup(1);
	}

}
