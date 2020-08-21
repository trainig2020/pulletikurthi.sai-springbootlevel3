package com.satya.springbootconfig;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	@Value("${my.greeting : default value}")
	private String greetingMessage;
	
	@Value("${my.list.values}")
	private List<String> listValue;
	
	@Autowired
	private Connection connections;
	
	@Autowired
	private Environment env;
	
	
	@GetMapping("/greeting")
	public String greeting() {
		return greetingMessage+listValue+connections.getConnection()+connections.getHost()+connections.getPort();
	}
	
	@GetMapping("/envdetails")
	public String envdetails() {
		return env.toString();
	}

}
