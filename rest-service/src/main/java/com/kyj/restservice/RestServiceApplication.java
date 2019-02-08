package com.kyj.restservice;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class RestServiceApplication {

  public static void main(String[] args) {
    SpringApplication.run(RestServiceApplication.class, args);
    Person p = new Person();
    PersonDTO pd;
    ModelMapper modelMapper = new ModelMapper();
    modelMapper.map(p, PersonDTO.class);
    ObjectMapper om = new ObjectMapper();
  }

}

