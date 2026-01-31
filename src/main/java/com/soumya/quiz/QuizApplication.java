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

			Question s1 = new Question();
			s1.setQuestionTilte("48.6 ÷ 2.7 + (35% of 420) - 18");
			s1.setOption1("120");
			s1.setOption2("118");
			s1.setOption3("122");
			s1.setOption4("115");
			s1.setRightAnswer("120");
			s1.setDificultyLevel("Hard");
			s1.setCategory("simplification");

			Question s2 = new Question();
			s2.setQuestionTilte("√1444 + 18.5 × 4 - 96 ÷ 3");
			s2.setOption1("116");
			s2.setOption2("112");
			s2.setOption3("120");
			s2.setOption4("108");
			s2.setRightAnswer("112");
			s2.setDificultyLevel("Hard");
			s2.setCategory("simplification");

			Question s3 = new Question();
			s3.setQuestionTilte("225% of 96 - (14.4 × 3) + 22");
			s3.setOption1("160");
			s3.setOption2("165");
			s3.setOption3("150");
			s3.setOption4("155");
			s3.setRightAnswer("160");
			s3.setDificultyLevel("Hard");
			s3.setCategory("simplification");

			Question s4 = new Question();
			s4.setQuestionTilte("(56 ÷ 7) × (15.6 ÷ 1.3) + 12.5");
			s4.setOption1("107.5");
			s4.setOption2("96");
			s4.setOption3("102");
			s4.setOption4("110");
			s4.setRightAnswer("107.5");
			s4.setDificultyLevel("Hard");
			s4.setCategory("simplification");

			Question s5 = new Question();
			s5.setQuestionTilte("78.4 - 16.8 + 24.5 × 3 - √625");
			s5.setOption1("122.1");
			s5.setOption2("118.1");
			s5.setOption3("120.1");
			s5.setOption4("116.1");
			s5.setRightAnswer("122.1");
			s5.setDificultyLevel("Hard");
			s5.setCategory("simplification");

			Question s6 = new Question();
			s6.setQuestionTilte("48 × 2.5 + (18% of 240) - 36 ÷ 1.5");
			s6.setOption1("150");
			s6.setOption2("160");
			s6.setOption3("168");
			s6.setOption4("174");
			s6.setRightAnswer("168");
			s6.setDificultyLevel("Hard");
			s6.setCategory("simplification");

			Question s7 = new Question();
			s7.setQuestionTilte("(45.5 × 4) - (22.75 × 2) + 18");
			s7.setOption1("140");
			s7.setOption2("135");
			s7.setOption3("125");
			s7.setOption4("132");
			s7.setRightAnswer("132");
			s7.setDificultyLevel("Hard");
			s7.setCategory("simplification");

			Question s8 = new Question();
			s8.setQuestionTilte("(32% of 750) + 19.2 ÷ 0.4");
			s8.setOption1("316");
			s8.setOption2("300");
			s8.setOption3("310");
			s8.setOption4("326");
			s8.setRightAnswer("316");
			s8.setDificultyLevel("Hard");
			s8.setCategory("simplification");

			Question s9 = new Question();
			s9.setQuestionTilte("144 ÷ 1.2 + 36 × 1.5 - 72");
			s9.setOption1("180");
			s9.setOption2("162");
			s9.setOption3("168");
			s9.setOption4("174");
			s9.setRightAnswer("174");
			s9.setDificultyLevel("Hard");
			s9.setCategory("simplification");

			Question s10 = new Question();
			s10.setQuestionTilte("96 ÷ 0.75 + 12.5 × 4 - √1296");
			s10.setOption1("152");
			s10.setOption2("160");
			s10.setOption3("148");
			s10.setOption4("158");
			s10.setRightAnswer("160");
			s10.setDificultyLevel("Hard");
			s10.setCategory("simplification");

			repository.save(s1);
			repository.save(s2);
			repository.save(s3);
			repository.save(s4);
			repository.save(s5);
			repository.save(s6);
			repository.save(s7);
			repository.save(s8);
			repository.save(s9);
			repository.save(s10);

			System.out.println("Simplification Questions Inserted!");
		};
	}

}
