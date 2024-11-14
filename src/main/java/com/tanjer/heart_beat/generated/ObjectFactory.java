
package com.tanjer.heart_beat.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.tanjer.heart_beat.generated package. 
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

    private final static QName _CountryListServiceRequest_QNAME = new QName("http://dtts.sfda.gov.sa/CountryListService", "CountryListServiceRequest");
    private final static QName _CountryListServiceRequestType_QNAME = new QName("http://dtts.sfda.gov.sa/CountryListService", "CountryListServiceRequestType");
    private final static QName _CountryListServiceResponse_QNAME = new QName("http://dtts.sfda.gov.sa/CountryListService", "CountryListServiceResponse");
    private final static QName _CountryListServiceResponseType_QNAME = new QName("http://dtts.sfda.gov.sa/CountryListService", "CountryListServiceResponseType");
    private final static QName _ServiceError_QNAME = new QName("http://dtts.sfda.gov.sa/CountryListService", "ServiceError");
    private final static QName _CountryDto_QNAME = new QName("http://dtts.sfda.gov.sa/CountryListService", "countryDto");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tanjer.heart_beat.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CountryListServiceResponse }
     * 
     */
    public CountryListServiceResponse createCountryListServiceResponse() {
        return new CountryListServiceResponse();
    }

    /**
     * Create an instance of {@link CountryListServiceRequest }
     * 
     */
    public CountryListServiceRequest createCountryListServiceRequest() {
        return new CountryListServiceRequest();
    }

    /**
     * Create an instance of {@link FaultBean }
     * 
     */
    public FaultBean createFaultBean() {
        return new FaultBean();
    }

    /**
     * Create an instance of {@link CountryDto }
     * 
     */
    public CountryDto createCountryDto() {
        return new CountryDto();
    }

    /**
     * Create an instance of {@link CountryListServiceResponse.COUNTRYLIST }
     * 
     */
    public CountryListServiceResponse.COUNTRYLIST createCountryListServiceResponseCOUNTRYLIST() {
        return new CountryListServiceResponse.COUNTRYLIST();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountryListServiceRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CountryListServiceRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://dtts.sfda.gov.sa/CountryListService", name = "CountryListServiceRequest")
    public JAXBElement<CountryListServiceRequest> createCountryListServiceRequest(CountryListServiceRequest value) {
        return new JAXBElement<CountryListServiceRequest>(_CountryListServiceRequest_QNAME, CountryListServiceRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountryListServiceRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CountryListServiceRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://dtts.sfda.gov.sa/CountryListService", name = "CountryListServiceRequestType")
    public JAXBElement<CountryListServiceRequest> createCountryListServiceRequestType(CountryListServiceRequest value) {
        return new JAXBElement<CountryListServiceRequest>(_CountryListServiceRequestType_QNAME, CountryListServiceRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountryListServiceResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CountryListServiceResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://dtts.sfda.gov.sa/CountryListService", name = "CountryListServiceResponse")
    public JAXBElement<CountryListServiceResponse> createCountryListServiceResponse(CountryListServiceResponse value) {
        return new JAXBElement<CountryListServiceResponse>(_CountryListServiceResponse_QNAME, CountryListServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountryListServiceResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CountryListServiceResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://dtts.sfda.gov.sa/CountryListService", name = "CountryListServiceResponseType")
    public JAXBElement<CountryListServiceResponse> createCountryListServiceResponseType(CountryListServiceResponse value) {
        return new JAXBElement<CountryListServiceResponse>(_CountryListServiceResponseType_QNAME, CountryListServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultBean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FaultBean }{@code >}
     */
    @XmlElementDecl(namespace = "http://dtts.sfda.gov.sa/CountryListService", name = "ServiceError")
    public JAXBElement<FaultBean> createServiceError(FaultBean value) {
        return new JAXBElement<FaultBean>(_ServiceError_QNAME, FaultBean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountryDto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CountryDto }{@code >}
     */
    @XmlElementDecl(namespace = "http://dtts.sfda.gov.sa/CountryListService", name = "countryDto")
    public JAXBElement<CountryDto> createCountryDto(CountryDto value) {
        return new JAXBElement<CountryDto>(_CountryDto_QNAME, CountryDto.class, null, value);
    }

}
