package ac.in.cutm.erp.training.onlinecompiler.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ac.in.cutm.erp.training.onlinecompiler.entities.Question;

public interface QuestionRepository extends JpaRepository<Question, Integer> {
 
	public Question findById(int id);
}
