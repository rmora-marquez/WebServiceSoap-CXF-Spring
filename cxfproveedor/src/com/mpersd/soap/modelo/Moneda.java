package com.mpersd.soap.modelo;

import javax.xml.bind.annotation.XmlRootElement;

import com.sun.xml.txw2.annotation.XmlElement;

@XmlRootElement
public class Moneda {
	private String nombreMoneda;
	private Double tipoCambio;

	public Moneda() {
	}

	public Moneda(String nombreMoneda, Double tipoCambio) {
		super();
		this.nombreMoneda = nombreMoneda;
		this.tipoCambio = tipoCambio;
	}
	
	@XmlElement
	public String getNombreMoneda() {
		return nombreMoneda;
	}

	public void setNombreMoneda(String nombreMoneda) {
		this.nombreMoneda = nombreMoneda;
	}
	
	@XmlElement
	public Double getTipoCambio() {
		return tipoCambio;
	}

	public void setTipoCambio(Double tipoCambio) {
		this.tipoCambio = tipoCambio;
	}

	
}
