package branch;
<<<<<<< HEAD
// 사용자로부터 숫자를 입력받아서
// 홀수, 짝수를 출력하는 프로그램을 작성해주세요. (40분까지)
import java.util.Scanner;

=======
// 사용자로부터 숫자를 입력 받아서
// 홀수, 짝수를 출력하는 프로그램을 작성해주세요. (40분까지)
import java.util.Scanner;
>>>>>>> 02bb71477c4c8cdccfe81c1929f0e810d1379a8e
public class IfElse02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자: ");
        int number = scanner.nextInt();
        
        if(number % 2 == 1) {
            System.out.println("홀수입니다.");
        }else {
            System.out.println("짝수입니다.");
        }
        
<<<<<<< HEAD
        scanner.close();
    }
=======
        
        scanner.close();
    }

>>>>>>> 02bb71477c4c8cdccfe81c1929f0e810d1379a8e
}
