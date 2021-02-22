package com.mpersd.soap.config;

import javax.xml.ws.Endpoint;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mpersd.soap.webservice.ConversionWSImp;

@Configuration
public class SpringConfig {

	@Bean(name=SpringBus.DEFAULT_BUS_ID)
	public SpringBus springBus(){
		return new SpringBus();
	}
	
	@Bean
	public Endpoint endpoint(){
		EndpointImpl endpoint = new EndpointImpl( springBus(), new ConversionWSImp());
		endpoint.publish("/conversion/");
		return endpoint;
	}
}
