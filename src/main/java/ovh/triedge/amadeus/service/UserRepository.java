package ovh.triedge.amadeus.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ovh.triedge.amadeus.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	//public boolean checkLogin(String login, String password);
}
