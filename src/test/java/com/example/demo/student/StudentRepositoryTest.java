package com.example.demo.student;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class StudentRepositoryTest {

	
	@Autowired
	private StudentRepository underTest;
	
	@Test
	void itShouldCheckIfStudentExistsByEmail() {
		
		//given
		Student student = new Student("Arthur", "arthur.iron@hotmail.com", Gender.MALE);
		//when
		//then
		
	}
	
	
	

}
