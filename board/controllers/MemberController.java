package board.controllers;

<<<<<<< HEAD
import board.services.MemberService;
import board.impls.MemberServiceImpl;
import board.domains.TeacherDto;
import board.domains.MemberDto;

public class MemberController {
    private MemberService memberService;
    public MemberController(){
        memberService = new MemberServiceImpl();
    }
    public void postStudent(MemberDto student){
        memberService.registerStudent(student);
    }
    public void postTeacher(MemberDto teacher){
        memberService.registerTeacher(teacher);
    }
    public void updateStudent(MemberDto student){
        memberService.modifyStudent(student);
    }
    public void deleteStudent(MemberDto student){
        memberService.removeStudent(student);
    }
    public MemberDto postLogin(MemberDto student){
        return memberService.login(student);
    }
    public MemberDto postAccess(TeacherDto teacher){
        return memberService.access(teacher);
    }
    public MemberDto[] getStudentList(){
        return memberService.fetchStudentList();
    }
    public MemberDto getStudentDetail(String userId){
        return memberService.fetchStudentDetail(userId);
    } 
    public boolean getExistId(String userid){
        return memberService.existId(userid);
=======
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
>>>>>>> 02bb71477c4c8cdccfe81c1929f0e810d1379a8e
    }
}

















