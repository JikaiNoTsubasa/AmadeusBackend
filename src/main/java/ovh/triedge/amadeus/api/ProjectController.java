package ovh.triedge.amadeus.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ovh.triedge.amadeus.dto.RequestCreateProject;
import ovh.triedge.amadeus.model.Project;
import ovh.triedge.amadeus.service.ProjectService;

@RestController
@RequestMapping("/project")
public class ProjectController {
	
	@Autowired
	private ProjectService service;

	@GetMapping
	public List<Project>findAll(){
		return service.findAll();
	}
	
	@PostMapping
	public ResponseEntity<?> createProject(@RequestBody RequestCreateProject request){
		try {
			service.createProject(new Project(request));
			return new ResponseEntity<>(HttpStatus.CREATED);
		}catch(Exception e) {
			return new ResponseEntity<>("Could not create project", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
