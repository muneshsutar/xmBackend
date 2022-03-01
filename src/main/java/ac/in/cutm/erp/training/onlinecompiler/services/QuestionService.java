package ac.in.cutm.erp.training.onlinecompiler.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ac.in.cutm.erp.training.onlinecompiler.entities.Answer;
import ac.in.cutm.erp.training.onlinecompiler.entities.Question;
import ac.in.cutm.erp.training.onlinecompiler.repository.QuestionRepository;

@Service
public class QuestionService {
	
	@Autowired
	QuestionRepository questionRepository;
	
	
	public int findAnsweidCorrect(int questionid) {
		Question question = questionRepository.findById(questionid);
		for (Answer answer : question.getAnswers()) {
			if(answer.isCorrect()) {
				return answer.getId();
			}
		}
		return -1;
	}
}
