package com.mpersd.soap.webservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.6
 * 2019-11-21T12:37:31.359-06:00
 * Generated source version: 3.1.6
 * 
 */
@WebServiceClient(name = "ConversionWSImpService", 
                  wsdlLocation = "file:/C:/Users/MANPERSYS/workspace/cxfconsumidor/src/conversion.wsdl.xml",
                  targetNamespace = "http://webservice.soap.mpersd.com/") 
public class ConversionWSImpService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://webservice.soap.mpersd.com/", "ConversionWSImpService");
    public final static QName ConversionWSImpPort = new QName("http://webservice.soap.mpersd.com/", "ConversionWSImpPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/MANPERSYS/workspace/cxfconsumidor/src/conversion.wsdl.xml");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ConversionWSImpService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/MANPERSYS/workspace/cxfconsumidor/src/conversion.wsdl.xml");
        }
        WSDL_LOCATION = url;
    }

    public ConversionWSImpService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ConversionWSImpService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ConversionWSImpService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public ConversionWSImpService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public ConversionWSImpService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public ConversionWSImpService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns ConversionWS
     */
    @WebEndpoint(name = "ConversionWSImpPort")
    public ConversionWS getConversionWSImpPort() {
        return super.getPort(ConversionWSImpPort, ConversionWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ConversionWS
     */
    @WebEndpoint(name = "ConversionWSImpPort")
    public ConversionWS getConversionWSImpPort(WebServiceFeature... features) {
        return super.getPort(ConversionWSImpPort, ConversionWS.class, features);
    }

}
