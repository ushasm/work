package com.javasampleapproach.restdata.model;

import java.util.Map;
import java.util.Properties;
import java.util.HashMap;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;


@Entity
public class Sensor {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String deviceId;

	private int temperature;

  private String location;

	private String time;

	public Sensor(){
	}

	public void setdeviceId(String deviceId){
		this.deviceId = deviceId;
	}

	public String getdeviceId(){
		return this.deviceId;
	}

	public void setlocation(String location){
		this.location = location;
	}

	public String getlocation(){
		return this.location;
	}


	public void settime(String time){
		this.time = time;
	}

	public String gettime(){
		return this.time;
	}

	public void settemperature(int temperature){
		this.temperature = temperature;
	}

	public int gettemperature(){
		return this.temperature;
	}
}
