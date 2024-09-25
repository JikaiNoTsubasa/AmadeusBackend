package ovh.triedge.amadeus.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ovh.triedge.amadeus.model.Unit;

@Repository
public interface UnitRepository extends JpaRepository<Unit, Long>{

	List<Unit> findByName(String name);
}
