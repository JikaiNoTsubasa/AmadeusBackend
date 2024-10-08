package ovh.triedge.amadeus.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ovh.triedge.amadeus.model.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {

	
}
