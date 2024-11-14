package com.tanjer.heart_beat.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tanjer.heart_beat.generated.CountryListService;
import com.tanjer.heart_beat.generated.CountryListServiceRequest;
import com.tanjer.heart_beat.generated.CountryListServiceResponse;
import com.tanjer.heart_beat.generated.ServiceError;

@Service
public class CountryInfoService {
	
	 @Autowired
	 private CountryListService countryListService;
	 
	 public CountryListServiceResponse getAllCountryList(){
		 
		CountryListServiceRequest request = new CountryListServiceRequest();
		 
		try {
			CountryListServiceResponse response = countryListService.getCountryList(request);
			return response;
		} catch (ServiceError e) {
			throw new RuntimeException("Failed to retrieve country list", e);
		}
		 
	 }
	 
	 

}
