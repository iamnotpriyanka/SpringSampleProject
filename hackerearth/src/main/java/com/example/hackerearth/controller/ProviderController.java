package com.example.hackerearth.controller;

import java.util.List;

import javax.management.ServiceNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hackerearth.entity.Provider;
import com.example.hackerearth.repo.ProviderRepository;


@RestController
@RequestMapping("/api")
public class ProviderController {
	

	
	@Autowired
	private ProviderRepository providerRepository;

	@GetMapping("/isp")
	//@ApiOperation(value = "Find all serviceProvider and their price")
	public List<Provider> serviceProvider() {
			
		System.out.println("here....Print what you want ...........");
		return providerRepository.findAll();
	}

	


	
	
	@GetMapping(value="/isp/{name}")
	//@ApiOperation(value = "Find a serviceProvider by id", notes = "You can download all the isp data for that service provider")
	public ResponseEntity<Provider> findByName(@PathVariable("name") String name) throws ServiceNotFoundException {
	    Provider provider = (Provider) providerRepository.findByName(name);

	    if(provider == null){
	    	throw new ServiceNotFoundException("illegal Provider Name exception-" + name);
	    }

	    //show the student as json object
	    return ResponseEntity.status(HttpStatus.OK).body(provider);
	}
	
	
	
	
	

}
