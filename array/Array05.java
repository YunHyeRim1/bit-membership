package array;

import java.util.Scanner;

<<<<<<< HEAD

// 사용자로부터 
// 1~5반의 학생수를 받고
// 그 학생들의 시험점수(0~100)을 받는 프로그램을 작성하시오
// 입력이 다 끝난 후에는
// ----1반----
// 1번: 몇점
// 2번: 몇점
// .....
// -----------
// 1번: 몇점
// .....
// 이런식으로 출력되게 프로그램을 작성하시오.
=======
// 사용자로부터
// 1~5반의 학생 수를 받고
// 그 학생들의 시험 점수(0~100)을 받는 프로그램을 작성하시오.
// 입력이 다 끝난 후에는
// ----1반----
// 1번: 몇 점
// 2번: 몇 점
// .....
// -----------
// 1번: 몇 점
// .....
// 이런 식으로 출력되게 프로그램을 작성하시오.
>>>>>>> 02bb71477c4c8cdccfe81c1929f0e810d1379a8e
public class Array05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] scoreArray = new int[5][];
<<<<<<< HEAD
        // 각 반의 학생수 크기의 인트 배열을 준비하는 단계
=======
        // 각 반의 학생 수 크기의 인트 배열을 준비하는 단계
>>>>>>> 02bb71477c4c8cdccfe81c1929f0e810d1379a8e
        for(int i = 0; i < scoreArray.length; i++) {
            System.out.printf("%d반 학생의 수: ", (i+1));
            int classSize = scanner.nextInt();
            scoreArray[i] = new int[classSize];
<<<<<<< HEAD
            
        }
        // 각 반의 학생의 점수를 입력하는 for 문
        for(int i = 0; i < scoreArray.length; i++) {
            for(int j = 0; j < scoreArray[i].length; j++) {
=======
        }
        // 각 반의 학생의 점수를 입력하는 for문
        for(int i = 0; i < scoreArray.length; i++) {
            for(int j = 0; j <scoreArray[i].length; j++) {
>>>>>>> 02bb71477c4c8cdccfe81c1929f0e810d1379a8e
                String message = (j+1)+"번 학생의 점수: ";
                scoreArray[i][j] = ScannerUtil.nextInt(scanner, message, 0, 100);
            }
        }
        
<<<<<<< HEAD
        // 각 반의 점수를 출력하는 for 문
        for(int i = 0; i < scoreArray.length; i++) {
            System.out.println("----------"+(i+1)+"반-------------");
            for(int j = 0; j < scoreArray[i].length; j++) {
                System.out.printf("%d번 학생의 점수: %d점\n", (j+1), scoreArray[i][j]);
            }
            System.out.println("----------------------------------");
=======
        // 각 반의 점수를 출력하는 for문
        for(int i = 0; i < scoreArray.length; i++) {
            System.out.println("----------"+(i+1)+"반----------");
            for(int j = 0; j < scoreArray[i].length; j++) {
                System.out.printf("%d번 학생의 점수: %d점\n", (j+1), scoreArray[i][j]);
            }
            System.out.println("------------------------------");
>>>>>>> 02bb71477c4c8cdccfe81c1929f0e810d1379a8e
        }
        
        
        scanner.close();
<<<<<<< HEAD
    }
=======
        
    }

>>>>>>> 02bb71477c4c8cdccfe81c1929f0e810d1379a8e
}





















