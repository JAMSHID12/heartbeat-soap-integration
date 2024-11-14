package com.tanjer.heart_beat.component;

 // Replace with the actual generated package and interface
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.tanjer.heart_beat.generated.CountryListService;
import com.tanjer.heart_beat.generated.CountryListServiceRequest;
import com.tanjer.heart_beat.generated.CountryListServiceResponse;

@Component
public class SoapClientRunner implements CommandLineRunner {

    @Autowired
    private CountryListService countryListService;

    @Override
    public void run(String... args) {
        // Prepare a request object
        CountryListServiceRequest request = new CountryListServiceRequest();
        // Set any required parameters on the request
        // Example: request.setParameterName("parameterValue");

        try {
            // Call the SOAP service
            CountryListServiceResponse response = countryListService.getCountryList(request);
            System.out.println("Response: " + response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

