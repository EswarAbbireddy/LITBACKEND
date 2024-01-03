package customloginapplication.dto;

public class UserDto {
	
	
	private String username;
	private String password;
	private String firstname;
	private String lastname;
	private String mobile;
	
	
	public UserDto() {
	
	}


public UserDto(String username, String password, String firstname, String lastname, String mobile) {
		this.username = username;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
		this.mobile = mobile;
	}


public String getUsername() {
	return username;
}


public String getPassword() {
	return password;
}


public String getFirstname() {
	return firstname;
}


public String getLastname() {
	return lastname;
}


public String getMobile() {
	return mobile;
}


public void setUsername(String username) {
	this.username = username;
}


public void setPassword(String password) {
	this.password = password;
}


public void setFirstname(String firstname) {
	this.firstname = firstname;
}


public void setLastname(String lastname) {
	this.lastname = lastname;
}


public void setMobile(String mobile) {
	this.mobile = mobile;
}



//	public UserDto(String username, String password, String fullname) {
//		
//		this.username = username;
//		this.password = password;
//		this.fullname = fullname;
//	}


//	public String getUsername() {
//		return username;
//	}
//
//
//	public void setUsername(String username) {
//		this.username = username;
//	}
//
//
//	public String getPassword() {
//		return password;
//	}
//
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
//
//
//	public String getFullname() {
//		return fullname;
//	}
//
//
//	public void setFullname(String fullname) {
//		this.fullname = fullname;
//	}
	
	
	
	
	

}
