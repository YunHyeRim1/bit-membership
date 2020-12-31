package array;
// 구조체(Struct)
// 구조체란
<<<<<<< HEAD
// 다양한 데이터타입을 우리가 필요한
// 하나의 커다란 데이터타입으로 만들어주는 것을
// 구조체라고 한다.
// 예를 들어
// 학생이란 구조체는
// 그 안에 번호, 이름, 국영수 점수
// 요로케 들어갈 수있고
// 자동차란 구조체는
// 그 안에 번호판 번호, 차종, 연식 등등의 정보를 모아서
// 자동차 라는 자료형을 만들어 줄 수 있다!
// 단 문제는 구조체는 2세대 언어까지에서만 사용됬다는 것.....................
// 하지만 자바에서도 구조체를 비슷하게 만들어줄 수 있다!

public class Struct {
    public static void main(String[] args) {
        // 우리가 미리 만들어놓은 Student 클래스는
        // 하나의 자료형이 될수 있다.
        // 그리고 그 안에
        // 어떠한 데이터들을 가질지를
        // 미리 규정 시켜놓으면
        // Student 클래스 변수를 만들어서
        // 그 안에 각기 다른 데이터를 넣어줄 수 있다.
        // 즉 id, korean, english, math, name을
        // 통째로 묶어서 하나의 Student라는 데이터타입을 
        // 만들어주게 된 것이다!

        Student s = new Student();
        /*
        s.id = 1;
        s.korean = 100;
        s.english = 95;
        s.math = 85;
        s.name = "조재영";
        
        Student s2 = new Student();
        s2.id = 2;
        s2.korean = 99;
        s2.english = 94;
        s2.math = 84;
        s2.name = "조재영2";
        
        System.out.printf("번호: %d번, 이름: %s\n", s.id, s.name);
        System.out.printf("국어: %03d점, 영어: %03d점, 수학: %03d점\n", 
                s.korean, s.english, s.math);
        System.out.println("-----------------------------------");
        System.out.printf("번호: %d번, 이름: %s\n", s2.id, s2.name);
        System.out.printf("국어: %03d점, 영어: %03d점, 수학: %03d점\n", 
                s2.korean, s2.english, s2.math);
                */
    }
=======
// 다양한 데이터타입을 필요한 하나의 커다란 데이터타입으로 만들어주는 것이다.
// 예를 들어,
// 학생이라는 구조체는 그 안에 번호, 이름, 국영수 점수
// 이렇게 들어갈 수 있고
// 자동차라는 구조체는 그 안에 번호판 번호, 차종, 연식 등의 정보를 모아서
// 자동차 라는 자료형을 만들어줄 수 있다.
// 단, 구조체는 2세대 언어에서까지만 사용됐다.
// 하지만 자바에서도 구조체를 비슷하게 만들 수 있다.
public class Struct {
    public static void main(String[] args) {
        // 미리 만들어놓은 Student 클래스는
        // 하나의 자료형이 될 수 있다.
        // 그리고 그 안에 어떠한 데이터들을 가질 것인지를
        // 미리 규정시켜놓으면
        // Student 클래스 변수를 만들어서
        // 그 안에 각기 다른 데이터를 넣어줄 수 있다.
        // 즉 id, korean, english, math, name 을
        // 통째로 묶어서 하나의 Student 라는 데이터타입을 만들어주게 된 것이다.
        
        int number = 1;
        String string = new String();
        
        Student s = new Student();
        s.setId(0);
        s.setKorean(100);
        s.setEnglish(95);
        s.setMath(85);
        s.setName("조재영");
        
        Student s2 = new Student();
        s2.setId(2);
        s2.setKorean(99);
        s2.setEnglish(94);
        s2.setMath(84);
        s2.setName("조재영2");
        
        System.out.printf("번호: %d번, 이름: %s\n", s.getId(), s.getName());
        System.out.printf("국어: %03d점, 영어: %03d점, 수학: %03d점\n",
                s.getKorean(), s.getEnglish(), s.getMath());
        System.out.println("------------------------------------");
        System.out.printf("번호: %d번, 이름: %s\n", s2.getId(), s2.getName());
        System.out.printf("국어: %03d점, 영어: %03d점, 수학: %03d점\n",
                s2.getKorean(), s2.getEnglish(), s2.getMath());
        
    }

>>>>>>> 02bb71477c4c8cdccfe81c1929f0e810d1379a8e
}





















<<<<<<< HEAD
=======




>>>>>>> 02bb71477c4c8cdccfe81c1929f0e810d1379a8e
