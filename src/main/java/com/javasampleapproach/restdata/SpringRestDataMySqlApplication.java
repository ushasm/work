package com.javasampleapproach.restdata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.javasampleapproach.restdata.model.Sensor;
import com.javasampleapproach.restdata.repository.SensorRepository;

@SpringBootApplication
public class SpringRestDataMySqlApplication implements CommandLineRunner{

	@Autowired
	SensorRepository sensorRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringRestDataMySqlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
	}
}
