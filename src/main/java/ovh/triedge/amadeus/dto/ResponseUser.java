package ovh.triedge.amadeus.dto;

import ovh.triedge.amadeus.model.User;

public class ResponseUser {

	private int id;
	private String name;
	private String login;
	
	public ResponseUser(User user) {
		id = user.getId();
		name = user.getName();
		login = user.getLogin();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	
}
