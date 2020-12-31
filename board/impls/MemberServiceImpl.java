package board.impls;

<<<<<<< HEAD
import board.domains.MemberDto;
=======
import board.domains.MemberDTO;
import board.domains.StudentDTO;
import board.domains.TeacherDTO;
>>>>>>> 02bb71477c4c8cdccfe81c1929f0e810d1379a8e
import board.services.MemberService;

public class MemberServiceImpl implements MemberService {

    @Override
<<<<<<< HEAD
    public void registerGrade(MemberDto grade) {
=======
    public void registerMember(MemberDTO member) {
>>>>>>> 02bb71477c4c8cdccfe81c1929f0e810d1379a8e
        // TODO Auto-generated method stub

    }

    @Override
<<<<<<< HEAD
    public void registerStudent(MemberDto student) {
=======
    public void modifyMember(MemberDTO member) {
>>>>>>> 02bb71477c4c8cdccfe81c1929f0e810d1379a8e
        // TODO Auto-generated method stub

    }

    @Override
<<<<<<< HEAD
    public void registerTeacher(MemberDto teacher) {
=======
    public void removeMember(MemberDTO member) {
>>>>>>> 02bb71477c4c8cdccfe81c1929f0e810d1379a8e
        // TODO Auto-generated method stub

    }

    @Override
<<<<<<< HEAD
    public void modifyGrade(MemberDto grade) {
        // TODO Auto-generated method stub

    }

    @Override
    public void removeGrade(MemberDto grade) {
        // TODO Auto-generated method stub

    }

    @Override
    public void modifyStudent(MemberDto student) {
        // TODO Auto-generated method stub

    }

    @Override
    public void removeStudent(MemberDto student) {
        // TODO Auto-generated method stub

    }

    @Override
    public MemberDto login(MemberDto student) {
=======
    public StudentDTO login(StudentDTO student) {
>>>>>>> 02bb71477c4c8cdccfe81c1929f0e810d1379a8e
        // TODO Auto-generated method stub
        return null;
    }

    @Override
<<<<<<< HEAD
    public MemberDto access(MemberDto teacher) {
=======
    public TeacherDTO access(TeacherDTO teacher) {
>>>>>>> 02bb71477c4c8cdccfe81c1929f0e810d1379a8e
        // TODO Auto-generated method stub
        return null;
    }

    @Override
<<<<<<< HEAD
    public MemberDto[] fetchStudentList() {
=======
    public StudentDTO[] fetchstudentList() {
>>>>>>> 02bb71477c4c8cdccfe81c1929f0e810d1379a8e
        // TODO Auto-generated method stub
        return null;
    }

    @Override
<<<<<<< HEAD
    public MemberDto fetchStudentDetail(String userId) {
=======
    public StudentDTO fetchStudentDetail(String userId) {
>>>>>>> 02bb71477c4c8cdccfe81c1929f0e810d1379a8e
        // TODO Auto-generated method stub
        return null;
    }

    @Override
<<<<<<< HEAD
    public int sum(MemberDto grade) {
=======
    public int sum(StudentDTO student) {
>>>>>>> 02bb71477c4c8cdccfe81c1929f0e810d1379a8e
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
<<<<<<< HEAD
    public float avg(int sum) {
=======
    public float avg(StudentDTO Student) {
>>>>>>> 02bb71477c4c8cdccfe81c1929f0e810d1379a8e
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
<<<<<<< HEAD
    public boolean existId(String userid) {
=======
    public boolean existId(String userId) {
>>>>>>> 02bb71477c4c8cdccfe81c1929f0e810d1379a8e
        // TODO Auto-generated method stub
        return false;
    }

<<<<<<< HEAD
    
    
=======
	@Override
	public void registerStudent(StudentDTO student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registerTeacher(TeacherDTO teacher) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifyStudent(StudentDTO student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeStudent(StudentDTO student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float avg(int sum) {
		// TODO Auto-generated method stub
		return 0;
	}
>>>>>>> 02bb71477c4c8cdccfe81c1929f0e810d1379a8e
    
}
