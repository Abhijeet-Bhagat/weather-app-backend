package com.weather.form;

public class LocationInfo {
	
	private float lat	;
	private float lon;	
	private String name;
	private String region	;//string	Region or state of the location, if availa
	private String country	; //string	Location country
	private String tz_id	; //string	Time zone name
	private int localtime_epoch	; //int	Local date and time in unix time
	public float getLat() {
		return lat;
	}
	public void setLat(float lat) {
		this.lat = lat;
	}
	public float getLon() {
		return lon;
	}
	public void setLon(float lon) {
		this.lon = lon;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getTz_id() {
		return tz_id;
	}
	public void setTz_id(String tz_id) {
		this.tz_id = tz_id;
	}
	public int getLocaltime_epoch() {
		return localtime_epoch;
	}
	public void setLocaltime_epoch(int localtime_epoch) {
		this.localtime_epoch = localtime_epoch;
	}
	
	
	
}
