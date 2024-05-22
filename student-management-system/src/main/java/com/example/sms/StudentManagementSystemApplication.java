package com.example.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.sms.entity.Student;
import com.example.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
    @Autowired
    private StudentRepository studentRepository;
    
	@Override
	public void run(String... args) throws Exception {
		
		/*Student student1=new Student(1,"Ramesh","fadetara","ramesh@gmail.com");
		studentRepository.save(student1);
		Student student2=new Student(2, "Krishna","Dokku","Krishna@gmail.com");
		studentRepository.save(student2);
		Student student3=new Student(3, "Tulasi","Dokku","Tulasi@gmail.com");
		studentRepository.save(student3);*/
	}

}
