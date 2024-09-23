package ovh.triedge.amadeus.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;


@Entity
@Table(name = "Unit")
public class Unit {

	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Size(max = 1000)
	private String name;
	
	@OneToMany(mappedBy = "unit")
	private List<Project> projects = new ArrayList<Project>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	
	
}
