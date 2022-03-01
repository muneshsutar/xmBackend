package ac.in.cutm.erp.training.onlinecompiler.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import ac.in.cutm.erp.training.onlinecompiler.entities.Teacher;

public interface TeacherRepository  extends JpaRepository<Teacher,Integer>{
	@Query("select u from Teacher u where u.email= :email")
	public Teacher getTeacherByUsername(@Param("email") String email);
}
