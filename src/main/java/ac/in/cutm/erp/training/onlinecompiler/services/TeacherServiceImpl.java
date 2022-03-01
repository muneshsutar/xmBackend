package ac.in.cutm.erp.training.onlinecompiler.services;

import org.springframework.beans.factory.annotation.Autowired;

import ac.in.cutm.erp.training.onlinecompiler.entities.Login;
import ac.in.cutm.erp.training.onlinecompiler.entities.Teacher;
import ac.in.cutm.erp.training.onlinecompiler.repository.TeacherRepository;
import ac.in.cutm.erp.training.onlinecompiler.repository.UserRepository;

public class TeacherServiceImpl implements TeacherService{
	
	@Autowired
	TeacherRepository trepository;
	
	@Autowired
	UserRepository userepository;

	@Override
	public Teacher addTeacher(Teacher teacher) {
		Teacher addteacher = trepository.save(teacher);
		return addteacher;
	}

	@Override
	public Teacher editTeacherByusername(Teacher teacher) {
		Teacher editteacher = trepository.findById(teacher.getTeacherId()).orElse(null);
		editteacher.setEmail(teacher.getEmail());
		editteacher.setName(teacher.getName());
		return trepository.save(editteacher);
	}

	@Override
	public void deleteTeacherbyid(int id) {
		trepository.deleteById(id);
	}

	
	
}
