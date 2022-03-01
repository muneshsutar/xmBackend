package ac.in.cutm.erp.training.onlinecompiler.services;

import ac.in.cutm.erp.training.onlinecompiler.entities.Teacher;

public interface TeacherService {
 
	public Teacher addTeacher(Teacher teacher);
	public Teacher editTeacherByusername(Teacher teacher);
	public void deleteTeacherbyid(int id);
}
