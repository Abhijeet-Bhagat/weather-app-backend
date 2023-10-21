package com.weather.form;

import java.math.BigDecimal;

public class RealTimeInfo {
	
	private String last_updated	;//string	Local time when the real time data was updated.
	private int last_updated_epoch; //	int	Local time when the real time data was updated in unix time.
	private BigDecimal temp_c	;//decimal	Temperature in celsius
	private BigDecimal temp_f; //	decimal	Temperature in fahrenheit
	private int feelslike_c; //	decimal	Feels like temperature in celsius
	private BigDecimal feelslike_f; //	decimal	Feels like temperature in fahrenheit
	private Condition condition;	//string	Weather condition text
	
	private float wind_mph	;//decimal	Wind speed in miles per hour
	private float wind_kph	; //decimal	Wind speed in kilometer per hour
	
	private float precip_mm	; //decimal	Precipitation amount in millimeters
	private float precip_in; //	decimal	Precipitation amount in inches
	private float humidity	; //int	Humidity as percentage
	private int cloud	; //int	Cloud cover as percentage
	private int is_day  ; //	int	1 = Yes 0 = No	Whether to show day condition icon or night icon
	private int uv	; //decimal	UV Index
	public String getLast_updated() {
		return last_updated;
	}
	public void setLast_updated(String last_updated) {
		this.last_updated = last_updated;
	}
	public int getLast_updated_epoch() {
		return last_updated_epoch;
	}
	public void setLast_updated_epoch(int last_updated_epoch) {
		this.last_updated_epoch = last_updated_epoch;
	}
	public BigDecimal getTemp_c() {
		return temp_c;
	}
	public void setTemp_c(BigDecimal temp_c) {
		this.temp_c = temp_c;
	}
	public BigDecimal getTemp_f() {
		return temp_f;
	}
	public void setTemp_f(BigDecimal temp_f) {
		this.temp_f = temp_f;
	}
	public int getFeelslike_c() {
		return feelslike_c;
	}
	public void setFeelslike_c(int feelslike_c) {
		this.feelslike_c = feelslike_c;
	}
	public BigDecimal getFeelslike_f() {
		return feelslike_f;
	}
	public void setFeelslike_f(BigDecimal feelslike_f) {
		this.feelslike_f = feelslike_f;
	}
	public Condition getCondition() {
		return condition;
	}
	public void setCondition(Condition condition) {
		this.condition = condition;
	}
	public float getWind_mph() {
		return wind_mph;
	}
	public void setWind_mph(float wind_mph) {
		this.wind_mph = wind_mph;
	}
	public float getWind_kph() {
		return wind_kph;
	}
	public void setWind_kph(float wind_kph) {
		this.wind_kph = wind_kph;
	}
	public float getPrecip_mm() {
		return precip_mm;
	}
	public void setPrecip_mm(float precip_mm) {
		this.precip_mm = precip_mm;
	}
	public float getPrecip_in() {
		return precip_in;
	}
	public void setPrecip_in(float precip_in) {
		this.precip_in = precip_in;
	}
	public float getHumidity() {
		return humidity;
	}
	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}
	public int getCloud() {
		return cloud;
	}
	public void setCloud(int cloud) {
		this.cloud = cloud;
	}
	public int getIs_day() {
		return is_day;
	}
	public void setIs_day(int is_day) {
		this.is_day = is_day;
	}
	public int getUv() {
		return uv;
	}
	public void setUv(int uv) {
		this.uv = uv;
	}
	@Override
	public String toString() {
		return "RealTimeInfo [last_updated=" + last_updated + ", last_updated_epoch=" + last_updated_epoch + ", temp_c="
				+ temp_c + ", temp_f=" + temp_f + ", feelslike_c=" + feelslike_c + ", feelslike_f=" + feelslike_f
				+ ", condition=" + condition + ", wind_mph=" + wind_mph + ", wind_kph=" + wind_kph + ", precip_mm="
				+ precip_mm + ", precip_in=" + precip_in + ", humidity=" + humidity + ", cloud=" + cloud + ", is_day="
				+ is_day + ", uv=" + uv + "]";
	}
	
	
	
	
	
}
