package com.soumya.quiz;

import com.soumya.quiz.dao.QuestionDao;
import com.soumya.quiz.model.Question;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class QuizApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuizApplication.class, args);
	}

	@Bean
	CommandLineRunner initDatabase(QuestionDao repository) {
		return args -> {

			Question q1 = new Question();
			q1.setQuestionTilte("If A is 50% more than B, then B is what percent less than A?");
			q1.setOption1("33.33%");
			q1.setOption2("25%");
			q1.setOption3("40%");
			q1.setOption4("50%");
			q1.setRightAnswer("33.33%");
			q1.setDificultyLevel("Medium");
			q1.setCategory("math");

			Question q2 = new Question();
			q2.setQuestionTilte("A train 180 m long crosses a man in 6 seconds. What is the speed of the train?");
			q2.setOption1("108 km/h");
			q2.setOption2("90 km/h");
			q2.setOption3("120 km/h");
			q2.setOption4("150 km/h");
			q2.setRightAnswer("108 km/h");
			q2.setDificultyLevel("Medium");
			q2.setCategory("math");

			Question q3 = new Question();
			q3.setQuestionTilte("The ratio of ages of A and B is 4:5. After 8 years, the ratio becomes 5:6. What is B’s present age?");
			q3.setOption1("20");
			q3.setOption2("24");
			q3.setOption3("30");
			q3.setOption4("40");
			q3.setRightAnswer("40");
			q3.setDificultyLevel("Hard");
			q3.setCategory("math");

			Question q4 = new Question();
			q4.setQuestionTilte("If the average of five numbers is 28, what is the total sum?");
			q4.setOption1("140");
			q4.setOption2("150");
			q4.setOption3("120");
			q4.setOption4("135");
			q4.setRightAnswer("140");
			q4.setDificultyLevel("Easy");
			q4.setCategory("math");

			Question q5 = new Question();
			q5.setQuestionTilte("A man invests ₹5000 at 12% simple interest. What will be the interest after 3 years?");
			q5.setOption1("₹1800");
			q5.setOption2("₹1500");
			q5.setOption3("₹2000");
			q5.setOption4("₹1750");
			q5.setRightAnswer("₹1800");
			q5.setDificultyLevel("Easy");
			q5.setCategory("math");

			repository.save(q1);
			repository.save(q2);
			repository.save(q3);
			repository.save(q4);
			repository.save(q5);

			System.out.println("Dummy Reasoning Questions Inserted into H2 Database!");
		};
	}
}
