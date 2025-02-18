package com.mpersd.soap.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.6
 * 2019-11-21T12:37:31.349-06:00
 * Generated source version: 3.1.6
 * 
 */
@WebService(targetNamespace = "http://webservice.soap.mpersd.com/", name = "ConversionWS")
@XmlSeeAlso({ObjectFactory.class})
public interface ConversionWS {

    @WebMethod
    @RequestWrapper(localName = "getTipoCambio", targetNamespace = "http://webservice.soap.mpersd.com/", className = "com.mpersd.soap.webservice.GetTipoCambio")
    @ResponseWrapper(localName = "getTipoCambioResponse", targetNamespace = "http://webservice.soap.mpersd.com/", className = "com.mpersd.soap.webservice.GetTipoCambioResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.mpersd.soap.webservice.Moneda getTipoCambio(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );

    @WebMethod
    @RequestWrapper(localName = "pesoADolar", targetNamespace = "http://webservice.soap.mpersd.com/", className = "com.mpersd.soap.webservice.PesoADolar")
    @ResponseWrapper(localName = "pesoADolarResponse", targetNamespace = "http://webservice.soap.mpersd.com/", className = "com.mpersd.soap.webservice.PesoADolarResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.Double pesoADolar(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.Double arg0
    );

    @WebMethod
    @RequestWrapper(localName = "dolarAPeso", targetNamespace = "http://webservice.soap.mpersd.com/", className = "com.mpersd.soap.webservice.DolarAPeso")
    @ResponseWrapper(localName = "dolarAPesoResponse", targetNamespace = "http://webservice.soap.mpersd.com/", className = "com.mpersd.soap.webservice.DolarAPesoResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.Double dolarAPeso(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.Double arg0
    );
}
