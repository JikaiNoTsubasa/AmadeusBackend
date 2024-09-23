package ovh.triedge.amadeus.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ovh.triedge.amadeus.model.Unit;

public interface UnitRepository extends JpaRepository<Unit, Long>{

	List<Unit> findByName(String name);
}
