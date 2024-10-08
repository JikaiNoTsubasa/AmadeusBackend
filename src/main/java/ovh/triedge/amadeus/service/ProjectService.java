package ovh.triedge.amadeus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ovh.triedge.amadeus.model.Project;

@Service
public class ProjectService {

	@Autowired
	private ProjectRepository repository;
	
	public void Save(Project p){
		repository.save(p);
	}
	
	public List<Project> findAll(){
		return repository.findAll();
	}
	
	public void createProject(Project project) {
		repository.save(project);
	}
}
