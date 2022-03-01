package ac.in.cutm.erp.training.onlinecompiler.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ac.in.cutm.erp.training.onlinecompiler.entities.Quiz;

public interface QuizRepository extends JpaRepository<Quiz, Integer> {
	
	public Quiz findById(int id);
}
