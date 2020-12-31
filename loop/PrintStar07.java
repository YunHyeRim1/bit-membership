package loop;
<<<<<<< HEAD

import java.util.Scanner;

// 별찍기 7번
=======
// 별찍기 7번
import java.util.Scanner;
>>>>>>> 02bb71477c4c8cdccfe81c1929f0e810d1379a8e
public class PrintStar07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------");
        System.out.println("별찍기 7번");
        System.out.println("--------");
        System.out.print("출력할 줄 수: ");
        int userNumber = scanner.nextInt();
<<<<<<< HEAD
        // 윗부분을 담당하는 i for 문
        for(int i = 1; i <= userNumber; i++) {
            String stars = new String();
            //별을 담당하는 j for 문
=======
        // 윗 부분을 담당하는 i for 문
        for(int i =1; i <= userNumber; i++) {
            String stars = new String();
            // 별을 담당하는 j for 문
>>>>>>> 02bb71477c4c8cdccfe81c1929f0e810d1379a8e
            for(int j = 1; j <= i; j++) {
                stars += "*";
            }
            System.out.println(stars);
        }
        
<<<<<<< HEAD
        // 아랫부분을 담당하는 i for 문
=======
        // 아랫 부분을 담당하는 i for 문
>>>>>>> 02bb71477c4c8cdccfe81c1929f0e810d1379a8e
        for(int i = 2; i <= userNumber; i++) {
            String stars = new String();
            for(int j = i; j <= userNumber; j++) {
                stars += "*";
            }
            
            System.out.println(stars);
        }
        
        scanner.close();
    }
}
<<<<<<< HEAD













=======
>>>>>>> 02bb71477c4c8cdccfe81c1929f0e810d1379a8e
