package com.tanjer.heart_beat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.tanjer.heart_beat.generated.CountryListServiceResponse;
import com.tanjer.heart_beat.service.CountryInfoService;


@RestController
@RequestMapping("/api/country")
public class CountryListController {

    @Autowired
	private CountryInfoService contryInfoSerivice;
    
    @PostMapping("/list")
    public CountryListServiceResponse getCountryList() {
        return contryInfoSerivice.getAllCountryList();
    }
}
