import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "records")
public class RecordEntity {
	@Id
	@SequenceGenerator(name = "my_seq", sequenceName = "records_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "my_seq")
	private int records_id;
	@Column
	private Timestamp timestamp;
	@Column
	private int temperature;
	@Column(name = "unit")
	private char unitOfMeasurement;
	@Column(name = "foreign_key")
	private String device_name;

	public int getId() {
		return this.records_id;
	}

	
	public String getDeviceName() {
		return device_name;
	}

	public void setDeviceName(String deviceName) {
		this.device_name = deviceName;
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

	public char getUnitOfMeasurement() {
		return this.unitOfMeasurement;
	}

	public void setUnitOfMeasurement(char unitOfMeasurement) {
		this.unitOfMeasurement = unitOfMeasurement;
	}
}
