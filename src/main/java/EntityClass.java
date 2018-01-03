import javax.persistence.*;

@Entity
@Table(name = "waterdevice")
public class EntityClass {
	@Id
	@SequenceGenerator(name="my_seq", sequenceName = "waterdevice_seq", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="my_seq")
	@Column (name="ID")
	private int id;
	@Column(unique = true)
	private String name;
	@Column
	private String producerName;
	@Column
	private int reference;

	public EntityClass() {
	}

	public int getId() {
		return id;
	}

	public int getReference() {
		return reference;
	}

	public void setReference(int reference) {
		this.reference = reference;
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

	@Override
	public String toString() {
		return String.format("Id: %d, name: %s ,producerName: %s", getId(), getName(), getProducerName());
	}
}