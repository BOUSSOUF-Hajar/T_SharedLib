package com.example.SharedLib;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.SharedLib.entities.Agent;



@SpringBootApplication
@EnableAutoConfiguration
public class MsSharedLibApplication {
	public static void main(String[] args) {
		SpringApplication.run(MsSharedLibApplication.class, args);
		Agent agent = new Agent();
	}

	
	
}

