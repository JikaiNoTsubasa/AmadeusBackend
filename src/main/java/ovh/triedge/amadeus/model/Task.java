package ovh.triedge.amadeus.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Task extends AmaEntity{

	@ManyToOne
	private Project project;
	@OneToMany(mappedBy = "parentTask")
	private List<Task> subTasks = new ArrayList<Task>();
	@ManyToOne
	private Task parentTask;
	
	public List<Task> getSubTasks() {
		return subTasks;
	}
	public void setSubTasks(List<Task> subTasks) {
		this.subTasks = subTasks;
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
