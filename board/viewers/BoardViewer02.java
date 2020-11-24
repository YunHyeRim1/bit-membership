package board.viewers;
// 게시판에 글을 쓸 때는 글 번호가 자동으로 부여된다.
// 글 10개를 쓰고 도중에 하나를 지워도
// 새 글을 쓰면 글 번호는 11부터 다시 부여된다.

import java.util.Scanner;

class Board{
    private String title, writer, content;
    private int id;
    public void setTitle(String title){this.title=title;}
    public String getTitle(){return title;}
    public void setId(int id){this.id=id;}
    public int getId(){return id;}
    public void setWriter(String writer){this.writer=writer;}
    public String getWriter(){return writer;}
    public void setContent(String content){this.content=content;}
    public String getContent(){return content;}
}

public class BoardViewer02 {
        private Scanner scanner;
        private Board[] boardArray;
        // 글 번호를 보관할 전역변수 id
        private int id = 1;
        
        public BoardViewer02() {
            scanner = new Scanner(System.in);
            boardArray = new Board[0];
        }
        

        public void showMenu() {
            while(true) {
                System.out.println("게시판 관리 프로그램");
                String message = "1. 새 글 쓰기 2. 목록 보기 3. 종료 \n > ";
                int userChoice = ScannerUtil.nextInt(scanner, message, 1, 3);
                if(userChoice == 1) {
  
                    addBoard();
                    
                }else if(userChoice == 2) {
  
                    selectAll();
                    
                }else if(userChoice == 3) {
                    System.out.println("사용해주셔서 감사합니다.");
                    break;
                }
            }
        }
        
     
        
        private void addBoard() {

            Board b = new Board();
            
            System.out.print("제목: ");
            b.setTitle(ScannerUtil.nextLine(scanner));
            
            b.setId(id++);
            
            System.out.print("작성자: ");
            b.setWriter(ScannerUtil.nextLine(scanner));
            
            System.out.print("내용: ");
            b.setContent(ScannerUtil.nextLine(scanner));
            
            boardArray = ArrayUtil.add(boardArray, b);
        }
   
        private void selectAll() {

            if(boardArray.length == 0) {
                System.out.println("아직 입력된 게시글이 없습니다.");
            }else {
                for(int i = boardArray.length - 1; i >= 0; i--) {
                    System.out.printf("%d. %s\n", i, boardArray[i].getTitle());
                }

                String message = "상세보기할 글 번호를 선택해주세요 (0은 뒤로가기) \n > ";
                int userChoice = ScannerUtil.nextInt(scanner, message,  0, boardArray.length) - 1;
                if(userChoice != -1) {

                    selectOne(userChoice);
                }
            }
        }
        

        private void selectOne(int index) {
           
            Board b = boardArray[index];
            System.out.println("제목: "+b.getTitle());
            System.out.println("글 번호: "+b.getId());
            System.out.println("작성자: "+b.getWriter());
            System.out.println("-----------------------");
            System.out.println(b.getContent());
            
   
            String message = "1. 수정 2. 삭제 3. 뒤로가기 \n > ";
            int userChoice = ScannerUtil.nextInt(scanner, message,  1, 3);
            if(userChoice == 1) {
                updateBoard(index);
                selectOne(index);
            }else if(userChoice == 2) {
                deleteBoard(index);
                selectAll();
            }else if(userChoice == 3) {
                selectAll();
            }
        }
        
        private void updateBoard(int index) {
            System.out.print("제목: ");
            boardArray[index].setTitle(ScannerUtil.nextLine(scanner));
            
            System.out.print("내용: ");
            boardArray[index].setContent(ScannerUtil.nextLine(scanner));
        }

        private void deleteBoard(int index) {
            System.out.print("정말로 삭제하시겠습니까? y/n");
            String agree = ScannerUtil.nextLine(scanner);
            if(agree.equals("y")) {
                boardArray = ArrayUtil.removeByIndex(boardArray, index);
            }
        }
}
