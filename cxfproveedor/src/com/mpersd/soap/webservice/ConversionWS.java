package com.mpersd.soap.webservice;

import javax.jws.WebService;

import com.mpersd.soap.modelo.Moneda;

@WebService
public interface ConversionWS {
	
	Double dolarAPeso(Double cantidad);
	Double pesoADolar(Double cantidad);
	
	Moneda getTipoCambio(String moneda);
	
}
