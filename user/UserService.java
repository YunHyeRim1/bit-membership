package user;

public interface UserService {
	public void join(UserDto user);
	public UserDto login(UserDto user);
	public void update(UserDto user);
	public void delete(UserDto user);
	public boolean idCheck(String id);
	public UserDto mypage(UserDto user);
	public int countSameName(String name);
	public UserDto[] userList();
	public UserDto idSearch(String id);
	public UserDto[] nameSearch(String name);
	public int count();
}

