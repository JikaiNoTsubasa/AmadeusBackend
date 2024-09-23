package ovh.triedge.amadeus.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Size;

@Entity
public class Task {

	@Id @GeneratedValue
	private int id;
	@Size(max = 1000)
	private String Name;
	@ManyToOne
	private Project project;
	@OneToMany(mappedBy = "parentTask")
	private List<Task> subTasks = new ArrayList<Task>();
	@ManyToOne
	private Task parentTask;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public List<Task> getSubTasks() {
		return subTasks;
	}
	public void setSubTasks(List<Task> subTasks) {
		this.subTasks = subTasks;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	public Task getParentTask() {
		return parentTask;
	}
	public void setParentTask(Task parentTask) {
		this.parentTask = parentTask;
	}
	
	
}
