package board.services;

import board.domains.StudentDTO;
import board.domains.TeacherDTO;

public interface MemberService {
    public void registerStudent(StudentDTO student);
    public void registerTeacher(TeacherDTO teacher);
    public void modifyStudent(StudentDTO student);
    public void removeStudent(StudentDTO student);
    public StudentDTO login(StudentDTO student);
    public TeacherDTO access(TeacherDTO teacher);
    public StudentDTO[] fetchstudentList();
    public StudentDTO fetchStudentDetail(String userId);
    public int sum(StudentDTO student);
    public float avg(int sum);
    public boolean existId(String userId);
}
// 학생등록, 강사등록, 학생정보수정, 학생정보삭제, 학생로그인
// 강사접속, 학생목록보기, 학생상세정보, 성적합계, 성적평균, 아이디중복체크