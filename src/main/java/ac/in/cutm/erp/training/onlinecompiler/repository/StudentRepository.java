package ac.in.cutm.erp.training.onlinecompiler.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import ac.in.cutm.erp.training.onlinecompiler.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	@Query("select s from Student s where s.email= :email")
	public Student getStudentByUsername(@Param("email") String email);
	@Query("select s from Student s where s.parentcode= :code")
	public Student getStudentByStudcode(@Param("code")String code);
}
