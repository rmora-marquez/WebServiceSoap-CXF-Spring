
package com.mpersd.soap.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mpersd.soap.webservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DolarAPeso_QNAME = new QName("http://webservice.soap.mpersd.com/", "dolarAPeso");
    private final static QName _DolarAPesoResponse_QNAME = new QName("http://webservice.soap.mpersd.com/", "dolarAPesoResponse");
    private final static QName _GetTipoCambio_QNAME = new QName("http://webservice.soap.mpersd.com/", "getTipoCambio");
    private final static QName _GetTipoCambioResponse_QNAME = new QName("http://webservice.soap.mpersd.com/", "getTipoCambioResponse");
    private final static QName _Moneda_QNAME = new QName("http://webservice.soap.mpersd.com/", "moneda");
    private final static QName _PesoADolar_QNAME = new QName("http://webservice.soap.mpersd.com/", "pesoADolar");
    private final static QName _PesoADolarResponse_QNAME = new QName("http://webservice.soap.mpersd.com/", "pesoADolarResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mpersd.soap.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DolarAPeso }
     * 
     */
    public DolarAPeso createDolarAPeso() {
        return new DolarAPeso();
    }

    /**
     * Create an instance of {@link DolarAPesoResponse }
     * 
     */
    public DolarAPesoResponse createDolarAPesoResponse() {
        return new DolarAPesoResponse();
    }

    /**
     * Create an instance of {@link GetTipoCambio }
     * 
     */
    public GetTipoCambio createGetTipoCambio() {
        return new GetTipoCambio();
    }

    /**
     * Create an instance of {@link GetTipoCambioResponse }
     * 
     */
    public GetTipoCambioResponse createGetTipoCambioResponse() {
        return new GetTipoCambioResponse();
    }

    /**
     * Create an instance of {@link Moneda }
     * 
     */
    public Moneda createMoneda() {
        return new Moneda();
    }

    /**
     * Create an instance of {@link PesoADolar }
     * 
     */
    public PesoADolar createPesoADolar() {
        return new PesoADolar();
    }

    /**
     * Create an instance of {@link PesoADolarResponse }
     * 
     */
    public PesoADolarResponse createPesoADolarResponse() {
        return new PesoADolarResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DolarAPeso }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.soap.mpersd.com/", name = "dolarAPeso")
    public JAXBElement<DolarAPeso> createDolarAPeso(DolarAPeso value) {
        return new JAXBElement<DolarAPeso>(_DolarAPeso_QNAME, DolarAPeso.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DolarAPesoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.soap.mpersd.com/", name = "dolarAPesoResponse")
    public JAXBElement<DolarAPesoResponse> createDolarAPesoResponse(DolarAPesoResponse value) {
        return new JAXBElement<DolarAPesoResponse>(_DolarAPesoResponse_QNAME, DolarAPesoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTipoCambio }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.soap.mpersd.com/", name = "getTipoCambio")
    public JAXBElement<GetTipoCambio> createGetTipoCambio(GetTipoCambio value) {
        return new JAXBElement<GetTipoCambio>(_GetTipoCambio_QNAME, GetTipoCambio.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTipoCambioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.soap.mpersd.com/", name = "getTipoCambioResponse")
    public JAXBElement<GetTipoCambioResponse> createGetTipoCambioResponse(GetTipoCambioResponse value) {
        return new JAXBElement<GetTipoCambioResponse>(_GetTipoCambioResponse_QNAME, GetTipoCambioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Moneda }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.soap.mpersd.com/", name = "moneda")
    public JAXBElement<Moneda> createMoneda(Moneda value) {
        return new JAXBElement<Moneda>(_Moneda_QNAME, Moneda.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PesoADolar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.soap.mpersd.com/", name = "pesoADolar")
    public JAXBElement<PesoADolar> createPesoADolar(PesoADolar value) {
        return new JAXBElement<PesoADolar>(_PesoADolar_QNAME, PesoADolar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PesoADolarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.soap.mpersd.com/", name = "pesoADolarResponse")
    public JAXBElement<PesoADolarResponse> createPesoADolarResponse(PesoADolarResponse value) {
        return new JAXBElement<PesoADolarResponse>(_PesoADolarResponse_QNAME, PesoADolarResponse.class, null, value);
    }

}
