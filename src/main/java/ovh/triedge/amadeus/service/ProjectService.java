package ovh.triedge.amadeus.service;

import org.springframework.beans.factory.annotation.Autowired;

import ovh.triedge.amadeus.model.Project;

public class ProjectService {

	@Autowired
	private ProjectRepository repository;
	
	public void Save(Project p){
		repository.save(p);
	}
}
