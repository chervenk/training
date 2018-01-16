package com.mytests.spring.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
//@NamedQueries({@NamedQuery(name="GET_ALL_WATERDEVICES", query="select * from waterdevice"), 
//			   @NamedQuery(name="GET_WATERDEVICES_WITH_RECORDS", query= "select * from waterdevice where waterdevice.device_id = records.device_id")})
@Table(name = "waterdevice")
public class WaterDevice {
	@Id
	@SequenceGenerator(name="my_seq", sequenceName = "waterdevice_seq", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="my_seq")
	@Column (name="device_id")
	private int id;
	@Column(unique = true)
	private String name;
	@Column
	private String producerName;

	@OneToMany(mappedBy="waterDevice", cascade={CascadeType.ALL})
	private List<TemperatureRecord> records;

	public WaterDevice() {
	}

	public int getId() {
		return id;
	}

	public List<TemperatureRecord> getRecords() {
		return records;
	}

	public void setRecords(List<TemperatureRecord> records) {
		this.records = records;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProducerName() {
		return producerName;
	}

	public void setProducerName(String producerName) {
		this.producerName = producerName;
	}
	
	public void addTemperatureRecord(TemperatureRecord record) {
		if (this.records == null) {
			this.records = new ArrayList<>();
		}
		this.records.add(record);
	}

	@Override
	public String toString() {
		return String.format("Id: %d, name: %s ,producerName: %s", getId(), getName(), getProducerName());
	}
}