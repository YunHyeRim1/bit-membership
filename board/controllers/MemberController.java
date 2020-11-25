package board.controllers;

import java.util.ArrayList;

import board.domains.StudentDTO;
import board.domains.TeacherDTO;
import board.impls.MemberServiceImpl;
import board.services.MemberService;

public class MemberController {
    private MemberService memberService;
    public MemberController() {
        memberService = new MemberServiceImpl();
    }
    public void postStudent(StudentDTO student) {
        memberService.registerStudent(student);
    }
    public void postTeacher(TeacherDTO teacher) {
        memberService.registerTeacher(teacher);
    }
    public void updateStudent(StudentDTO student) {
        memberService.modifyStudent(student);
    }
    public void deleteStudent(StudentDTO student) {
        memberService.removeStudent(student);
    }
    public StudentDTO postlogin(StudentDTO student) {
        return memberService.login(student);
    }
    public TeacherDTO getAccess(TeacherDTO teacher) {
        return memberService.access(teacher);
    }
    public StudentDTO[] getstudentList() {
        return memberService.fetchstudentList();
    }
    public StudentDTO getStudentDetail(String userId) {
        return memberService.fetchStudentDetail(userId);
    }
    public int sum(StudentDTO student) {
        return memberService.sum(student);
    }
    public float avg(int sum) {
        return memberService.avg(sum);
    }
    public boolean getExistId(String userId) {
        return memberService.existId(userId);
    }
}

















