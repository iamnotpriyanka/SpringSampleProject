package com.example.hackerearth;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.hackerearth.repo.ProviderRepository;

@SpringBootApplication
public class HackerearthApplication {
	
	
	private Logger logs = LoggerFactory.getLogger(this.getClass()); 
	
	@Autowired
	ProviderRepository providerRepository;

	public static void main(String[] args) {
		SpringApplication.run(HackerearthApplication.class, args);
	}

	public Logger getLogs() {
		return logs;
	}

	public void setLogs(Logger logs) {
		this.logs = logs;
	}


}