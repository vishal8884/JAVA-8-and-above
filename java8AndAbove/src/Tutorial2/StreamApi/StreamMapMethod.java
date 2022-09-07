package Tutorial2.StreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapMethod {

	public static void main(String[] args) {

		List<String> alpha = Arrays.asList("a","b","x","s","p");
		List<String> alphaUpper = alpha.stream().map((s) -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println("alphaUpper :: "+alphaUpper);
		
		//-----------------------------------------------------------------------------------------------------------------------------------------------------
		
		
		List<User> users = new ArrayList<>();
		users.add(new User(1,"tom", "abcd", "tm@gmail.com"));
		users.add(new User(2,"jerry", "friends", "jerry@gmail.com"));
		users.add(new User(3,"bono", "sixpack", "bobo@gmail.com"));
		users.add(new User(4,"penya", "abbs", "penya@gmail.com"));
		
		//Map each user object to user DTO object------------------TRADITIONAL method
		
		
		List<UserDto> userDtoList = new ArrayList<>();
		for(User user : users) {
			userDtoList.add(new UserDto(user.getId(), user.getUserName(), user.getEmail()));
		}
		
		System.out.println("userDto list :: "+userDtoList);
		
		
		//using java 8 streams
		
		List<UserDto> userDtoList2 = users.stream()
		    .map((user) -> new UserDto(user.getId(),user.getUserName(),user.getEmail()))      //Function<User,UserDto>
		    .collect(Collectors.toList());
		    
		System.out.println("userDtoList2 :: "+userDtoList2);
	}

}


class UserDto {
	private int id;
	private String userName;
	private String email;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public UserDto(int id, String userName, String email) {
		this.id = id;
		this.userName = userName;
		this.email = email;
	}
	public UserDto() {
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", email=" + email + "]";
	}
}


class User {
	private int id;
	private String userName;
	private String password;
	private String email;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public User(int id, String userName, String password, String email) {
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.email = email;
	}
	public User() {
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", email=" + email + "]";
	}
	

}
