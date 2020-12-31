package loop;
<<<<<<< HEAD

import java.util.Scanner;
// 별찍기 6번
public class PrintStar06 {
    public static void main(String[] args) {
=======
// 별찍기 6번
import java.util.Scanner;
public class PrintStar06 {
    public static void main(String[]args) {
>>>>>>> 02bb71477c4c8cdccfe81c1929f0e810d1379a8e
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------");
        System.out.println("별찍기 6번");
        System.out.println("--------");
        System.out.print("출력할 줄 수: ");
        int userNumber = scanner.nextInt();
        for(int i = userNumber; i >= 1; i--) {
            String stars = new String();
<<<<<<< HEAD
            //공백을 담당하는 j for 문
            for(int j = 1; j <= userNumber - i; j++) {
                stars += " ";
            }
            
            //별을 담당하는 j for 문
            for(int j = 1; j <= 2*i - 1; j++) {
                stars += "*";
            }
            
=======
            // 공백을 담당하는 j for 문
            for(int j = 1; j <= userNumber - i; j++) {
                stars += " ";
            }
            // 별을 담당하는 j for 문
            for(int j = 1; j <= 2*i - 1; j++) {
                stars += "*";
            
            }
>>>>>>> 02bb71477c4c8cdccfe81c1929f0e810d1379a8e
            System.out.println(stars);
        }
        
        scanner.close();
    }
}
