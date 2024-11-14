package com.tanjer.heart_beat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.tanjer.heart_beat.generated.CountryListService;
import com.tanjer.heart_beat.generated.CountryListServiceRequest;
import com.tanjer.heart_beat.generated.CountryListServiceResponse;

@RestController
@RequestMapping("/api/country")
public class CountryListController {

    @Autowired
    private CountryListService countryListService;

    /**
     * REST API endpoint to get the country list
     * @param request Request parameters wrapped in a CountryListServiceRequest object
     * @return Response from the SOAP service
     */
    @PostMapping("/list")
    public CountryListServiceResponse getCountryList(@RequestBody CountryListServiceRequest request) {
        try {
            // Call the SOAP service and return the response
            return countryListService.getCountryList(request);
        } catch (Exception e) {
            throw new RuntimeException("Failed to retrieve country list", e);
        }
    }
}
