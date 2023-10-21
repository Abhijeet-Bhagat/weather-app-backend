package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weather.form.LocationInfo;
import com.weather.form.RealTimeInfo;
//
@RestController
@RequestMapping("/weather")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ControllerClass {

	@Autowired
	WeatherService weatherService;
	
    @PostMapping
    public ResponseEntity<String> getCurrentWeather(@RequestBody LocationInfo locationInfo) {
		
    	String loc = locationInfo.getName();
    	 String realTimeInfo =   weatherService.getWeatherAPI(loc);
    	 return ResponseEntity.ok(realTimeInfo);
    	
    }
}
