package com.mpersd.soap.webservice;

import javax.xml.ws.Endpoint;

public class ServerStandalone {

	public static void main(String[] args) throws InterruptedException {
		ConversionWSImp implementor =  new ConversionWSImp();
		String address = "http://localhost:8080/conversion";
		Endpoint.publish(address, implementor);
		Thread.sleep(10 * 60 * 1000 );
	}

}
