package com.mytests.spring.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;



@Entity
@Table(name = "records")
public class TemperatureRecord {
	@Id
	@SequenceGenerator(name = "my_seq", sequenceName = "records_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "my_seq")
	private int records_id;
	@Column
	private Timestamp timestamp;
	@Column
	private int temperature;
	@Column(name = "unit")
	private String unitOfMeasurement;
	@ManyToOne
	@JoinColumn(name = "device_id", nullable = false)
	private WaterDevice waterDevice;

	public int getId() {
		return this.records_id;
	}

	public WaterDevice getWaterDevice() {
		return waterDevice;
	}

	public void setWaterDevice(WaterDevice waterDevice) {
		this.waterDevice = waterDevice;
	}

	public Timestamp getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Timestamp simpleDateFormat) {
		this.timestamp = simpleDateFormat;
	}

	public int getTemperature() {
		return this.temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	public String getUnitOfMeasurement() {
		return this.unitOfMeasurement;
	}

	public void setUnitOfMeasurement(String unitOfMeasurement) {
		this.unitOfMeasurement = unitOfMeasurement;
	}
}
