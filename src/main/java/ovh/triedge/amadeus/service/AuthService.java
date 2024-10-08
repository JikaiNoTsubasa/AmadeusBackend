package ovh.triedge.amadeus.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ovh.triedge.amadeus.model.User;

@Service
public class AuthService {

	@Autowired
	private UserRepository userRepository;
	
	public Optional<User> checkLoginUser(String login, String password) {
		List<User> users = userRepository.findAll();
		return users.stream().filter(u->u.getLogin().equals(login)&&u.getPassword().equals(password)).findFirst();
	}
	
}
