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

			// ================= Simplification Question Set =================

			Question s1 = new Question();
			s1.setQuestionTilte("48.6 ÷ 2.7 + (35% of 420) - 18");
			s1.setOption1("147");
			s1.setOption2("142");
			s1.setOption3("150");
			s1.setOption4("138");
			s1.setRightAnswer("147");
			s1.setDificultyLevel("Hard");
			s1.setCategory("Simplification");

			Question s2 = new Question();
			s2.setQuestionTilte("√1764 + (25% of 320) - 18");
			s2.setOption1("104");
			s2.setOption2("102");
			s2.setOption3("100");
			s2.setOption4("106");
			s2.setRightAnswer("104");
			s2.setDificultyLevel("Medium");
			s2.setCategory("Simplification");

			Question s3 = new Question();
			s3.setQuestionTilte("∛2197 + (4/7 of 210) - 15");
			s3.setOption1("118");
			s3.setOption2("120");
			s3.setOption3("115");
			s3.setOption4("125");
			s3.setRightAnswer("118");
			s3.setDificultyLevel("Hard");
			s3.setCategory("Simplification");

			Question s4 = new Question();
			s4.setQuestionTilte("16² ÷ 8 × 5 + 20% of 150");
			s4.setOption1("190");
			s4.setOption2("200");
			s4.setOption3("210");
			s4.setOption4("180");
			s4.setRightAnswer("190");
			s4.setDificultyLevel("Hard");
			s4.setCategory("Simplification");

			Question s5 = new Question();
			s5.setQuestionTilte("(5/8 of 320) + √900 - 12");
			s5.setOption1("218");
			s5.setOption2("220");
			s5.setOption3("215");
			s5.setOption4("210");
			s5.setRightAnswer("218");
			s5.setDificultyLevel("Medium");
			s5.setCategory("Simplification");

			Question s6 = new Question();
			s6.setQuestionTilte("62.4 ÷ 1.6 × 2.5 + 15% of 200");
			s6.setOption1("127.5");
			s6.setOption2("125");
			s6.setOption3("130");
			s6.setOption4("135");
			s6.setRightAnswer("127.5");
			s6.setDificultyLevel("Hard");
			s6.setCategory("Simplification");

			Question s7 = new Question();
			s7.setQuestionTilte("{(48 + 32) ÷ 4} × 5 - 30% of 200");
			s7.setOption1("40");
			s7.setOption2("45");
			s7.setOption3("50");
			s7.setOption4("35");
			s7.setRightAnswer("40");
			s7.setDificultyLevel("Medium");
			s7.setCategory("Simplification");

			Question s8 = new Question();
			s8.setQuestionTilte("(9/16 of 256) + (3/4 of 120) - 18");
			s8.setOption1("216");
			s8.setOption2("210");
			s8.setOption3("204");
			s8.setOption4("198");
			s8.setRightAnswer("216");
			s8.setDificultyLevel("Medium");
			s8.setCategory("Simplification");

			Question s9 = new Question();
			s9.setQuestionTilte("√2025 ÷ 1.5 + 36.4 ÷ 1.4");
			s9.setOption1("56");
			s9.setOption2("58");
			s9.setOption3("60");
			s9.setOption4("54");
			s9.setRightAnswer("56");
			s9.setDificultyLevel("Hard");
			s9.setCategory("Simplification");

			Question s10 = new Question();
			s10.setQuestionTilte("40% of 250 + 20% of 300 - 15% of 200");
			s10.setOption1("130");
			s10.setOption2("120");
			s10.setOption3("140");
			s10.setOption4("150");
			s10.setRightAnswer("130");
			s10.setDificultyLevel("Medium");
			s10.setCategory("Simplification");

			// ================= End of Set =================

			repository.save(s1);
			repository.save(s2);
			repository.save(s3);
			repository.save(s4);
			repository.save(s5);
			/*
			repository.save(s6);
			repository.save(s7);
			repository.save(s8);
			repository.save(s9);
			repository.save(s10);
			*/
			System.out.println("Simplification Questions Inserted!");
		};
	}

}
