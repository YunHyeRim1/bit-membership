package day05;
// 로또 번호 생성기

import java.util.Random;

import util.ArrayUtil;

public class Ex08LottoNumbers {
    private static final int SIZE = 6;
    private static final int MAX = 45;
    public static void main(String[] args) {
        Random random = new Random();
        
        // 배열을 선언해보자
        int[] lottoNumbers = new int[SIZE];
        
        // 배열에 각 인덱스에
        // 랜덤을 이용한 난수를 넣어보자
        for(int i = 0; i < lottoNumbers.length; i++) {
            lottoNumbers[i] = random.nextInt(MAX)+1;
        }
        
        ArrayUtil.print("lottoNumbers", lottoNumbers);
        // 위의 코드에서 문제점은 중복 제거가 되지 않았다는 점이다.
        // 중복을 제거하기 위해서는
        // 두 가지 방법이 있다.
        // 1. 일단 숫자를 모두 채워놓고, 중복인 인덱스에 새로운 숫자 넣기.
        System.out.println("1. 먼저 채워놓고 중복인 곳 다시 넣기");
        // 중복이란 무엇인가?
        // 중복이란, 인덱스가 다르지만 배열의 해당 인덱스들의 값이 같을 때 중복이라 한다.
        // 예를 들어
        // 38 8 19 16 16 8
        // 이렇게 숫자가 있을 경우
        // 1번 인덱스와 5번 인덱스는
        // 인덱스는 다르지만 배열[인덱스]의 값이 같기 때문에 중복이 된다.
        
        // 따라서 2중 for문을 이용해서
        // i와 j가 다르지만
        // lottoNumbers[i]와 lottoNumbers[j]의 값이 같을 때는
        // lottoNumbers[i]에 새로운 값을 넣어주고
        // 해당 값이 중복인지 아닌지를 다시 체크하게 할 것이다.
        for(int i = 0; i < lottoNumbers.length; i++) {
            for(int j = 0; j < lottoNumbers.length; j++) {
                // if를 통해서 i와 j가 다르지만
                // lottoNumbers[i]와 lottoNumbers[j]가 같으면
                // i에 새로운 숫자를 넣고
                // j를 -1로 초기화해서
                // 0번 인덱스부터 다시 체크하게 만들어주자.
                if(i != j && lottoNumbers[i] == lottoNumbers[j]) {
                    int oldNumbers = lottoNumbers[i];
                    lottoNumbers[i] = random.nextInt(MAX)+1;
                    int newNumbers = lottoNumbers[i];
                    System.out.printf("%d에 있던 %d를 %d로 바꿈\n", i, oldNumbers, newNumbers);
                    // j를 0으로 돌려서 처음부터 다시 체크할 수 있게
                    // j를 -1로 초기화한다.
                    j = -1;
                }
            }
        }
        
        // 중복 제거가 됐는지 출력해본다.
        System.out.println("========중복 제거 후========");
        ArrayUtil.print("lottoNumbers", lottoNumbers);
        System.out.println("==========================");
        // 중복 제거된 배열을 정렬한다.
        ArrayUtil.sortByASC(lottoNumbers);
        System.out.println("========중복 제거 후========");
        ArrayUtil.print("lottoNumbers", lottoNumbers);
        System.out.println("==========================");
        
    }
}
























