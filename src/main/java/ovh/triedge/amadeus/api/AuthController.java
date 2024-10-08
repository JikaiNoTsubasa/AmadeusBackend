package ovh.triedge.amadeus.api;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ovh.triedge.amadeus.dto.RequestLoginUser;
import ovh.triedge.amadeus.dto.ResponseUser;
import ovh.triedge.amadeus.model.User;
import ovh.triedge.amadeus.service.AuthService;

@RestController
@RequestMapping("/auth")
public class AuthController {
	
	@Autowired
	private AuthService authService;
	
	Logger log = LoggerFactory.getLogger(AuthController.class);
	
	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestBody RequestLoginUser requestLoginUser) {
		//throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Cause description here");
		try {
			Optional<User> opUser = authService.checkLoginUser(requestLoginUser.getEmail(), requestLoginUser.getPassword());
			log.debug("Authentication of user "+requestLoginUser.getEmail()+" : "+opUser.isPresent());
			if (opUser.isPresent()) {
				return new ResponseEntity<>(new ResponseUser(opUser.get()), HttpStatus.OK);
			}else {
				return new ResponseEntity<>("User "+requestLoginUser.getEmail()+" not found", HttpStatus.NOT_FOUND);
			}
			
		}catch(Exception e) {
			log.error("Failed to login user", e);
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
