package user;

public interface UserService {
	public void joinUs(UserDTO user);
	public UserDTO login(UserDTO user);
	public void modifyPassword(UserDTO user);
	public void deleteUser(UserDTO user);
	public boolean idCheck(String id);
	public UserDTO myPage(UserDTO user);
	public UserDTO[] userList();
	public UserDTO idSearch(String id);
	public UserDTO[] nameSearch(String name);
	public int count();
}

