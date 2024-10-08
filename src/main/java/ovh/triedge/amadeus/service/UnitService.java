package ovh.triedge.amadeus.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ovh.triedge.amadeus.model.Project;
import ovh.triedge.amadeus.model.Unit;

@Service
public class UnitService {

	@Autowired
	private UnitRepository unitRepository;

	public List<Unit> findAll(){
		return unitRepository.findAll();
	}
	
	public Optional<Unit> findById(Long id){
		return unitRepository.findById(id);
	}
	
	public Unit save(Unit unit) {
		return unitRepository.save(unit);
	}
	
	public void deleteById(Long id) {
		unitRepository.deleteById(id);
	}
	
	public List<Project> findProjectsByUnit(long id){
		Optional<Unit> u = findById(id);
		return u.get()==null?null:u.get().getProjects();
	}
}
