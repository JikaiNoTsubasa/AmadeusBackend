package ovh.triedge.amadeus.model;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Transient;
import jakarta.validation.constraints.Size;
import ovh.triedge.amadeus.dto.RequestCreateProject;

@Entity
public class Project extends AmaEntity{

	@Size(max = 2000)
	private String description;
	private Timestamp creationDate = Timestamp.from(Instant.now());
	@ManyToOne
	private Unit unit;
	
	@OneToMany(mappedBy = "project")
	private List<Task> tasks = new ArrayList<Task>();
	
	@Transient
	private float progress;
	
	public Project() {}
	
	public Project(RequestCreateProject request) {
		setName(request.getName());
		setDescription(request.getDescription());
		if (request.getCreationDate() != null)
			setCreationDate(request.getCreationDate());
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

	public float getProgress() {
		return progress;
	}

	public void setProgress(float progress) {
		this.progress = progress;
	}

	public Unit getUnit() {
		return unit;
	}

	public void setUnit(Unit unit) {
		this.unit = unit;
	}

	public List<Task> getTasks() {
		return tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}
	
	
	
}
