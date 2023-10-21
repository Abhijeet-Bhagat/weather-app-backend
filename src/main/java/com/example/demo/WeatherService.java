package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.weather.form.RealTimeInfo;

@Service
public class WeatherService {
	
	private  RestTemplate restTemplate = new RestTemplate();
	private final String weatherUrl = "apiUrl";
	private final String weatherKey = "apiKey";
	
	@Autowired
	private Environment env;
	public String getWeatherAPI(String loc) {
		
		String apiUrl = env.getProperty(weatherUrl);
		String apiKey = env.getProperty(weatherKey);
		System.out.println(apiUrl);
		System.out.println(apiKey);
//		loc = "London";
		//&q=London&days=1
		String fullUrl = apiUrl + "?key="+ apiKey + "&q="+ loc+"&days=7";
		System.out.println("url is -----------------------------> "+ fullUrl);
		
		String responseData = restTemplate.getForObject(fullUrl, String.class);
		System.out.println(responseData);
		return responseData;
	}
}
