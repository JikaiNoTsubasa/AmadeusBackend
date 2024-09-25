package ovh.triedge.amadeus.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.Size;

@Entity
public class Category {
	
	@Id @GeneratedValue
	private int id;
	
	@Size(max = 100)
	private String name;
	@Size (max = 1000)
	private String description;
	
	@ManyToMany
	private List<AmaEntity> entities = new ArrayList<AmaEntity>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<AmaEntity> getEntities() {
		return entities;
	}

	public void setEntities(List<AmaEntity> entities) {
		this.entities = entities;
	}
	
	
}
