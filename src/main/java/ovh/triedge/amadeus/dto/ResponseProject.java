package ovh.triedge.amadeus.dto;

import java.sql.Timestamp;

public class ResponseProject {
	private int id;
	private String Name;
	private float progres;
	private String description;
	private Timestamp creationDate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public float getProgres() {
		return progres;
	}
	public void setProgres(float progres) {
		this.progres = progres;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Timestamp getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Timestamp creationDate) {
		this.creationDate = creationDate;
	}
	
	
}
