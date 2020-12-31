package syntax;
// 자바에서 콘솔에 출력하는 3가지 방법
<<<<<<< HEAD
// print: ()안의 내용을 출력하고, 다음 출력위치는 바로 오른쪽칸이 된다. 
// println: print a line 의 줄임말. ()의 내용을 출력하고, 다음 출력위치는 다음줄 첫번째 칸이 된다.
// printf: print in format의 줄임말. ()의 내용을 '형식에' 맞추어 출력하고, 다음 출력위치는 바로 오른쪽
=======
// print: ()안의 내용을 출력하고, 다음 출력 위치는 바로 오른쪽 칸이 된다.
// println: print a line 의 줄임말. ()의 내용을 출력하고, 다음 출력 위치는 다음줄 첫번째 칸이 된다.
// printf: print in format의 줄임말. ()의 내용을 '형식에' 맞추어 출력하고, 다음 출력 위치는 바로 오른쪽 
>>>>>>> 02bb71477c4c8cdccfe81c1929f0e810d1379a8e
//         칸이 된다.
public class Print {
    public static void main(String[] args) {
        //1. print()
        System.out.print("1.abc");
        System.out.print("2.DEF");
        //2. println()
        System.out.println("3.ghi");
        System.out.println("4.jkl");
        //3. printf()
        System.out.printf("5.mno");
        System.out.printf("6.pqr");
    }
}
