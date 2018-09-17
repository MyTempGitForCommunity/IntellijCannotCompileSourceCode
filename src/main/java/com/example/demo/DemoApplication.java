package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@SpringBootApplication
public class DemoApplication
{
  public static void main(String[] args)
  {
    SpringApplication.run(DemoApplication.class, args);
  }

  public void problemHere(RestTemplate restTemplate, RequestEntity<?> req){

    ResponseEntity<Map<String, Object>> resp;

    resp = restTemplate.exchange(req, new ParameterizedTypeReference<>()
    {
    });
  }
}
