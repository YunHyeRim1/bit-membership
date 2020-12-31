package array;

import java.util.Random;

<<<<<<< HEAD

// 동적할당을 이용한 로또번호 추첨기  
=======
// 동적할당을 이용한 로또 번호 추첨기

>>>>>>> 02bb71477c4c8cdccfe81c1929f0e810d1379a8e
public class LottoNumbers3 {
    private static final int SIZE = 6;
    private static final int MAX = 45;
    public static void main(String[] args) {
        Random random = new Random();
        int[] lottoNumbers = new int[0];
        while(lottoNumbers.length < SIZE) {
            int randomNumber = random.nextInt(MAX)+1;
            if(!ArrayUtil.contains(lottoNumbers, randomNumber)) {
<<<<<<< HEAD
               lottoNumbers = ArrayUtil.add(lottoNumbers, randomNumber);
=======
                lottoNumbers = ArrayUtil.add(lottoNumbers, randomNumber);
>>>>>>> 02bb71477c4c8cdccfe81c1929f0e810d1379a8e
            }
        }
        
        for(int i = 0; i < lottoNumbers.length; i++) {
            System.out.printf("%d번 숫자: %d\n", i, lottoNumbers[i]);
        }
    }
}
<<<<<<< HEAD
=======















>>>>>>> 02bb71477c4c8cdccfe81c1929f0e810d1379a8e
