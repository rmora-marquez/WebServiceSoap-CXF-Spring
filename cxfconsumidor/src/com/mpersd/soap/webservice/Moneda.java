
package com.mpersd.soap.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para moneda complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="moneda"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nombreMoneda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipoCambio" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "moneda", propOrder = {
    "nombreMoneda",
    "tipoCambio"
})
public class Moneda {

    protected String nombreMoneda;
    protected Double tipoCambio;

    /**
     * Obtiene el valor de la propiedad nombreMoneda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreMoneda() {
        return nombreMoneda;
    }

    /**
     * Define el valor de la propiedad nombreMoneda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreMoneda(String value) {
        this.nombreMoneda = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoCambio.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTipoCambio() {
        return tipoCambio;
    }

    /**
     * Define el valor de la propiedad tipoCambio.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTipoCambio(Double value) {
        this.tipoCambio = value;
    }

}
