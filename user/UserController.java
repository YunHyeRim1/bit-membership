package user;

public class UserController {
	private UserService userService;
	public UserController() {
		userService = new UserServiceImpl();
	}
	
	public void postJoinUs(UserDTO user) {
		userService.joinUs(user);
	}
	
	public UserDTO postLogin(UserDTO user) {
		return userService.login(user);
	}
	
	public void putmodifyPassword(UserDTO user) {
		userService.modifyPassword(user);
	}
	
	public void deleteUser(UserDTO user) {
		userService.deleteUser(user);
	}

	public boolean getIdCheck(String id) {
		return userService.idCheck(id);
	}
	
	public UserDTO getMyPage(UserDTO user) {
		return userService.myPage(user);
	}
	
	public UserDTO[] getUserList() {
		return userService.userList();
	}	
	
	public UserDTO getIdSearch(String id) {
		return userService.idSearch(id);
	}
	
	public UserDTO[] getNameSearch(String name) {
		return userService.nameSearch(name);
	}
	
	public int getCount() {
		return userService.count();
	}
	
}






