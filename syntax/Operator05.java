package day02;
// 비트연산자
// 비트연산자는 정수를 비트로 변환해서
// 해당 자리에 대한 연산을 한다.

// & | ^ ~ << >> >>>
// &: 2개의 정수를 이진법으로 변환하고 같은 자리가 1일때만 1이 나오게 된다.
// |: 2개의 정수를 이진법으로 변환하고 같은 자리가 한개라도 1이면 1이 나오게 된다.
// ^: 2개의 정수를 이진법으로 변환하고 같은 자리가 다를때만 1이 나오게 된다.
// ~: 1개의 정수를 이진법으로 변환하고 1은 0으로 0은 1로 변환한다.
// <<: 지정된 숫자만큼 왼쪽으로 비트를 이동한다.
// >>: 지정된 숫자만큼 오른쪽으로 비트를 이동하되 부호는 유지한다.
// >>>: 지정된 숫자만큼 오른쪽으로 비트를 이동하되 무조건 +가 되도록 한다.

public class Ex03Operator05 {
    public static void main(String[] args) {
        byte myByte1 = 25;
        // 0001 1001
        byte myByte2 = 14;
        // 0000 1110
        
        //1. & 연산
        // 0001 1001
        //&0000 1110
        // ---------
        // 0000 1000
        System.out.println("myByte1 & myByte2: "+((byte)myByte1 & myByte2));
        
        //2. | 연산
        // 0001 1001
        //|0000 1110
        // ---------
        // 0001 1111 -> 31
        System.out.println("myByte1 | myByte2: "+((byte)myByte1 | myByte2));
        
        //3. ^ 연산
        // 0001 1001
        //^0000 1110
        // ---------
        // 0001 0111 -> 23
        System.out.println("myByte1 ^ myByte2: "+((byte)myByte1 ^ myByte2));
        
        //4. ~ 연산
        //~0001 1001
        // ---------
        // 1110 0110 -> -128 + 2 + 4 + 32 + 64
        //            = -26
        System.out.println("myByte1: "+((byte)~myByte1));
        
        //5. << 연산
        // 왼쪽 쉬프트 연산의 경우
        // 연산자 오른쪽에 있는 자릿수만큼
        // 오른쪽에 0을 붙여주고
        // 왼쪽 자릿수는 오른쪽 숫자만큼 날려준다.
        
        // 0001 1001 << 3
        // 0001 1001 000
        // 1 1001 000
        // 1100 1000 -> -128 + 8 + 64
        //            = -56
        System.out.println("myByte1 << 3: "+((byte)(myByte1 << 3)));
        
        // 6. >> 연산
        // 오른쪽 쉬프트 연산의 경우
        // 연산자 오른쪽에 있는 자릿수만큼
        // 왼쪽에 1이나 0을 붙여주고
        // 오른쪽 자릿수는 오른쪽 숫자만큼 날려준다.
        
        // 0001 1001 >> 4
        // 0000 0001 1001
        // 0000 0001 -> 1
        System.out.println("myByte1 >> 4: "+((byte)(myByte1 >> 4)));
        myByte1 = -120;
        
        // 1000 1000 >> 3
        // 111 1000 1000
        // 111 1000 1
        // 1111 0001 -> -128 + 1 + 16 + 32 + 64
        //            = -15
        System.out.println("myByte1 >> 3: "+((byte)(myByte1 >> 3)));
        
        // 7. >>> 연산
        //    연산자 뒤에 붙은 숫자만큼 앞에 0을 붙이고
        //    오른쪽 자리는 뒤에 붙은 숫자만큼 날려준다.
        
        // 1000 1000 >>> 3
        // 000 1000 1000
        // 000 1000 1
        // 0001 0001 -> 17
        System.out.println("myByte1 >>> 3: "+((byte)(myByte1 >>> 3)));
        // 위의 결과는 우리가 예상하기로 17이 나와야 하지만
        // -15가 나온다.
        // 왜냐, 얘네가 이걸 int로 바꾼 다음에 연산하고
        // 그 결과값을 다시 byte로 바꾸기 때문
        // 즉
        // 1000 1000 앞에 0을 3개 붙이는 게 아니라
        // 1111 1111 1111 1111 1111 1111 1000 1000 앞에 0을 3개 붙이게 된다
        // 그렇게 되면
        // 0001 1111 1111 1111 1111 1111 1001 0001이 되고
        // 맨 뒤에 8비트만 바이트로 변환하면
        // -15가 되버린다.
        
        // 하지만 자바에서는 비트연산을 잘 안 쓴다.
        // 왜냐하면 비트연산이 필요한 곳은 주로 속도가 중요한 분야인
        // 네트워크나 이미지 처리이기 때문!
        
        
    }

}
