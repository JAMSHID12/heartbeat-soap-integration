package com.tanjer.heart_beat.config;


import org.apache.cxf.transport.http.auth.DefaultBasicAuthSupplier;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.transport.http.HTTPConduit;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tanjer.heart_beat.generated.CountryListService;

@Configuration
public class SoapClientConfig {

    @Bean
    public CountryListService countryListService() {
        // Create the CXF client factory
        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
        factory.setServiceClass(CountryListService.class); // Set the service interface
        factory.setAddress("https://tandttest.sfda.gov.sa/ws/CountryListService/CountryListService"); // Set the WSDL endpoint

        // Create the service client
        CountryListService client = (CountryListService) factory.create();

        // Configure basic authentication
        Client clientProxy = org.apache.cxf.frontend.ClientProxy.getClient(client);
        HTTPConduit httpConduit = (HTTPConduit) clientProxy.getConduit();
        httpConduit.getAuthorization().setUserName("68251830000010000");
        httpConduit.getAuthorization().setPassword("CMRC@1234");

        httpConduit.setAuthSupplier(new DefaultBasicAuthSupplier()); // Configure default Basic Auth

        return client;
    }
}
