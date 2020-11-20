package main;

import java.util.Scanner;

import user.UserController;
import user.UserDto;

public class UserMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		UserController userController = new UserController();
		UserDto user = null;
		while(true) {
			System.out.println("Menu : 0. 종료 1. 회원가입* 2. 로그인 3. 비밀번호 수정* \r\n"
					+ " 4. 회원탈퇴* 5. 아이디 중복 체크 6. 마이페이지 \r\n"
					+ " 7. 회원목록 8. 아이디 검색 9. 이름 검색 10. 전체 회원 수");
			switch (scanner.next()) {
			case "0":
				System.out.println("0. 시스템 종료");	
				return;
			case "1":
				user = new UserDto();
				System.out.println("[회원가입] 아이디, 비밀번호, 이름");
				user.setUserid(scanner.next());
				user.setPassword(scanner.next());
				user.setName(scanner.next());
				userController.postJoin(user);
				break;
			case "2":
				user = new UserDto();
				System.out.println("[로그인] 아이디, 비밀번호");
				user.setUserid(scanner.next());
				user.setPassword(scanner.next());
				UserDto loginUser = userController.postLogin(user);
				if(loginUser == null) {
					System.out.println("로그인 실패");
				}else {
					System.out.println(loginUser.toString());
				}
		
				break;
			case "3":
				System.out.println("[비밀번호 수정] 아이디, 변경할 비밀번호");
				user.setUserid(scanner.next());
				user.setPassword(scanner.next());
				userController.putUpdate(user);
				break;
			case "4":
				System.out.println("[회원탈퇴] 아이디, 비밀번호");
				user.setUserid(scanner.next());
				user.setPassword(scanner.next());
				userController.deleteUser(user);
				break;
			case "5":
				System.out.println("[아이디 중복 체크] 아이디");
				boolean exist = userController.getIdCheck(scanner.next());
				if(exist) {
					System.out.println("사용 가능한 아이디입니다.");
				}else {
					System.out.println("사용 불가능한 아이디입니다.");
				}
				break;
			case "6":
				System.out.println("[마이페이지] 아이디, 비밀번호");
				user.setUserid(scanner.next());
				user.setPassword(scanner.next());
				UserDto mypage = userController.getMypage(user);
				break;
			case "7":
				System.out.println("[회원목록]");
				UserDto[] list = userController.getUserList();
				for(int i = 0; i < userController.getCount(); i++) {
					System.out.println(list[i].toString()+"\n");
				}
				break;
			case "8":
				System.out.println("[아이디 검색] 아이디");
				UserDto idSearch = userController.getIdSearch(scanner.next());
				break;
			case "9":
				System.out.println("[이름 검색] 이름");
				String name = scanner.next();
				UserDto[] nameSearch = userController.getNameSearch(name);
				for(int i=0; i < userController.getCountSameName(name); i++) {
					System.out.println(nameSearch[i].toString()+"\n");
				}
				break;
			case "10":
				System.out.printf("전체 회원 수 : %d 명\n", userController.getCount());
				break;
			
			}	
		}
	}
}





















