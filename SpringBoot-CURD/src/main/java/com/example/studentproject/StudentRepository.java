package com.example.studentproject;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {

List<Student> findAll();
Student findById(int id);
int deleteById(int id);

}
	