package com.prowings;

import org.springframework.web.client.RestTemplate;

public class CallAnotherpi {
public static void main(String[] args) {
	RestTemplate restTemplate=new RestTemplate();
	String result=restTemplate.getForObject("http://localhost:8080/rest_with_spring/employee/3",String.class);
	System.out.println(result);
}
}
