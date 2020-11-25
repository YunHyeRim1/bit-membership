package array;

import java.util.Scanner;

// 사용자로부터 숫자를 입력 받아서
// 1회차 국영수
// 2회차 국영수
// 3회차 국영수
// 4회차 국영수
// 를 입력하는 2차원 배열 프로그램
public class GradeBook01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 점수를 저장할 2차원 배열을 만들어준다.
        // 단, 배열 하나하나는 국영수 점수를 담아야 한다.
        int[][] scoreArray = new int[4][3];
        for(int i = 0; i < scoreArray.length; i++) {
            System.out.println("----"+(i+1)+"회차----");
            
            // i번째 회차의 국어 점수는 scoreArray[i]번째 0번 칸에 넣어주면 된다.
            scoreArray[i][0] = ScannerUtil.nextInt(scanner, "국어: ", 0 ,100);
            
            // i번째 회차의 영어 점수는 scoreArray[i]번째 1번 칸에 넣어주면 된다.
            scoreArray[i][1] = ScannerUtil.nextInt(scanner, "영어: ", 0 ,100);
            
            // i번째 회차의 수학 점수는 scoreArray[i]번째 2번 칸에 넣어주면 된다.
            scoreArray[i][2] = ScannerUtil.nextInt(scanner, "수학: ", 0 ,100);
            
            System.out.println("----------------");
        }
        
        // 입력된 정보들을 회차별로 출력한다.
        for(int i = 0; i < scoreArray.length; i++) {
            System.out.printf("-----%d회차 점수 요약-----\n", (i+1));
            // scoreArray의 i번 인덱스 배열의 0번 인덱스는 국어 점수이니 임시변수 korean 에 넣어주자.
            int korean = scoreArray[i][0];
            
            System.out.printf("-----%d회차 점수 요약-----\n", (i+1));
            // scoreArray의 i번 인덱스 배열의 1번 인덱스는 영어 점수이니 임시변수 english 에 넣어주자.
            int english = scoreArray[i][1];
            
            System.out.printf("-----%d회차 점수 요약-----\n", (i+1));
            // scoreArray의 i번 인덱스 배열의 2번 인덱스는 수학 점수이니 임시변수 math 에 넣어주자.
            int math = scoreArray[i][2];
            
            // 총점과 평균을 별개의 임시변수에 저장한다.
            int sum = korean + english + math;
            double average = sum / (double)scoreArray[i].length;
            
            System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점\n", korean, english, math);
            System.out.printf("총점: %03d점 평균: %.2f점\n", sum, average);
            
            System.out.println("----------------------");
            
        }
        
        scanner.close();
    }
   
}












