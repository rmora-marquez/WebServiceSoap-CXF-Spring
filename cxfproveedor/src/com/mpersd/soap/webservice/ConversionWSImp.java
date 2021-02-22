package com.mpersd.soap.webservice;

import javax.jws.WebService;

import com.mpersd.soap.modelo.Moneda;

@WebService(endpointInterface="com.mpersd.soap.webservice.ConversionWS")
public class ConversionWSImp implements ConversionWS {

	public ConversionWSImp() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double dolarAPeso(Double cantidad) {
		Moneda m = getTipoCambio("dolar");
		return cantidad * m.getTipoCambio();
	}

	@Override
	public Double pesoADolar(Double cantidad) {
		Moneda m = getTipoCambio("peso");
		return cantidad * m.getTipoCambio();
	}

	@Override
	public Moneda getTipoCambio(String moneda) {
		if(moneda.equals("peso")){
			return new Moneda("Peso",0.052);
		}
		return new Moneda("Dolar",19.35);
	}

}
