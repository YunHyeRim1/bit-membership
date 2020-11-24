package day05;
// 2차원 배열
// 처음 배웠던 배열은 int 모음집이었다.

// 또한, 배열도 모아놓을 수 있다.
// "학년" - "반" - 학생
// 의 관계를 생각해보면 된다.
// 학생: 모여있는 데이터타입 하나하나
// 반: 학생들이 모여서 한 개의 반 = 데이터타입이 모여서 하나의 1차원 배열
// 학년: 반들이 모여서 한 개의 학년 = 1차원 배열들이 모여서 2차원 배열을 이룬다.
// 이때 우리가 개별 학생을 학년 기준으로 부르려면
// "1학년 2반 3번 나와!"
// 마찬가지로 2차원 배열을 기준으로 해서
// 각각 하나의 데이터타입을 호출할 때는
// "1학년[2][3] 나와!"
public class Ex11Array2D {
    public static void main(String[] args) {
        // 2차원 배열은
        // 데이터타입[][] 배열 이름 = new 데이터타입[배열의 갯수][배열 안의 칸수]
        // 으로 선언한다.
        int[][] array = new int[3][4];
        // array는 4칸짜리 배열이 3개 모여있는 2차원 배열이 된다.
        
        
        
        
        // 2차원 배열의 경우
        // System.out.println(array[i])를 실행하면 어떻게 될까?
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        // 위 for문을 실행하면 콘솔 창에
        // [I@cac736f
        // [I@1175e2db
        // [I@36aa7bc2
        // 라는 메시지가 출력된다.
        // 위 메시지는 우리 2차원 배열이 가지고 있는
        // 1차원 배열들의 주소값이다.
        // array[0]은 cac736f 라는 메모리 주소에 위치한 배열이다.
        // array[1]은 1175e2db 라는 메모리 주소에 위치한 배열이다.
        // array[2]은 36aa7bc2 라는 메모리 주소에 위치한 배열이다.
        
        // 또한 위의 for문에서 array.length를 실행하면?
        // 1차원 배열이 몇 개가 모여있는지 나온다.
        // 즉, array는 1차원 배열들이 모여있는 것이다.
        
        // 예를 들어
        // int[] intArray = new int[3]
        // 해당 배열은 무엇이 모인 것인가?
        // int 가 모인 것이다.
        
        // int[][] array 는 무엇이 모인 것인가?
        // int[] 이 모인 것이다.
        
        // 그럼 2차원 배열의
        // 위치한 각 배열의 각 int 공간의 값까지 한번 찍어보자.
        for(int i = 0; i < array.length; i++) {
            // j for문을 만들어서
            // array[i].length보다 작을 동안 반복해야 한다.
            for(int j = 0; j < array[i].length; j++) {
                System.out.printf("array[%d][%d]: %d\n", i, j, array[i][j]);
                
            }
        }
        
    }
}

















