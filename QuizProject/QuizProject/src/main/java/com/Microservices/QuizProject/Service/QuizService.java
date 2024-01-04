package com.Microservices.QuizProject.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.Microservices.QuizProject.Dao.QuizDao;
import com.Microservices.QuizProject.Feign.QuizInterface;
import com.Microservices.QuizProject.Model.QuationWrapper;
import com.Microservices.QuizProject.Model.QuizEntity;
import com.Microservices.QuizProject.Model.Responce;

@Service
public class QuizService {

	@Autowired
	QuizDao quizDao;
	
	@Autowired
	QuizInterface quizInterface;

	public ResponseEntity<String> createQuiz(String category, int numQ, String title) {
		
		
		List<Integer> quations= quizInterface.getQuationForQuiz(category,numQ).getBody();
		QuizEntity quiz=new QuizEntity();
		quiz.setTitle(title);
		quiz.setQuations(quations);
		quizDao.save(quiz);
		
		return new ResponseEntity<>("Success",HttpStatus.OK);
	
	}

	public ResponseEntity<List<QuationWrapper>> getQuizQuations(Integer id) {
		
		return null;
	}

	public ResponseEntity<Integer> calculateResult(Integer id, List<Responce> responces) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
