package main;

import java.util.Scanner;

import user.UserController;
import user.UserDTO;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		UserController userController = new UserController();
		UserDTO user = new UserDTO();
		while(true) {
			System.out.println("Menu : 0. 종료 1. 회원가입 2. 로그인 3. 비밀번호 수정 4. 회원탈퇴 5. 아이디 중복 체크 "
					+ "6. 마이페이지 7. 회원목록 8. 아이디 검색 9. 이름 검색 10. 전체 회원 수");
			switch (scanner.next()) {
			case "0":
				System.out.println("0. 시스템 종료");	
				return;
			case "1":
				System.out.println("ID, PASSWORD, NAME : ");
				user.setUserid(scanner.next());
				user.setPassword(scanner.next());
				user.setName(scanner.next());
				userController.postJoinUs(user);
				break;
			case "2":
				System.out.println("ID, PASSWORD : ");
				user.setUserid(scanner.next());
				user.setPassword(scanner.next());
				userController.postLogin(user);
				break;
			case "3":
				System.out.println("ID, 변경할 비밀번호 : ");
				user.setUserid(scanner.next());
				user.setPassword(scanner.next());
				userController.putmodifyPassword(user);
				break;
			case "4":
				System.out.println("ID, PASSWORD : ");
				user.setUserid(scanner.next());
				user.setPassword(scanner.next());
				userController.deleteUser(user);
				break;
			case "5":
				System.out.println("ID : ");
				boolean exist = userController.getIdCheck(scanner.next());
				break;
			case "6":
				System.out.println("ID, PASSWORD : ");
				user.setUserid(scanner.next());
				user.setPassword(scanner.next());
				UserDTO mypage = userController.getMyPage(user);
				break;
			case "7":
				UserDTO[] list = userController.getUserList();
				break;
			case "8":
				System.out.println("ID : ");
				UserDTO idSearch = userController.getIdSearch(scanner.next());
				break;
			case "9":
				System.out.println("이름 : ");
				UserDTO[] searchName = userController.getNameSearch(scanner.next());
				break;
			case "10":
				int count = userController.getCount();
				break;
			
			}	
		}
	}
}





















